package mods.officialy.chromatica.init;

import com.google.common.collect.Sets;
import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.datagen.*;
import mods.officialy.chromatica.datagen.recipe.ChromaCraftingProvider;
import mods.officialy.chromatica.datagen.loot.ChromaLootTableProvider;
import mods.officialy.chromatica.datagen.worldgen.ChromaWorldGenProvider;
import net.minecraft.core.Cloner;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.RegistryDataLoader;
import net.minecraft.resources.ResourceKey;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.DataPackRegistriesHooks;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * Registers all data providers for Chromatica.
 * <p>
 * Credit to Choonster for the original code:
 * <a href="https://github.com/Choonster-Minecraft-Mods/TestMod3/blob/1.20.x/src/main/java/choonster/testmod3/data/TestMod3RecipeProvider.java">...</a>
 */
@Mod.EventBusSubscriber(modid = Chromatica.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ChromaDataProviders {

    @SubscribeEvent
    public static void registerDataProviders(final GatherDataEvent event) {
        final var dataGenerator = event.getGenerator();
        final var output = dataGenerator.getPackOutput();
        final var existingFileHelper = event.getExistingFileHelper();
        final var lookupProvider = event.getLookupProvider();//.thenApply(ChromaDataProviders::createLookup);


        dataGenerator.addProvider(event.includeClient(), new ChromaLanguageProvider(output));

        final var itemModelProvider = new ChromaItemModelProvider(output, existingFileHelper);
        dataGenerator.addProvider(event.includeClient(), itemModelProvider);

        // Let blockstate provider see generated item models by passing its existing file helper
        dataGenerator.addProvider(event.includeClient(), new ChromaBlockStateProvider(output, itemModelProvider.existingFileHelper));

        dataGenerator.addProvider(event.includeServer(), new ChromaCraftingProvider(output));
        dataGenerator.addProvider(event.includeServer(), ChromaLootTableProvider.create(output));

        final var blockTagsProvider = new ChromaBlockTagsProvider(output, lookupProvider, existingFileHelper);
        dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
        dataGenerator.addProvider(event.includeServer(), new ChromaItemTagsProvider(output, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        dataGenerator.addProvider(event.includeServer(), new ChromaBiomeTagsProvider(output, lookupProvider, existingFileHelper));
        dataGenerator.addProvider(event.includeServer(), new ChromaFluidTagsProvider(output, lookupProvider, existingFileHelper));
//        dataGenerator.addProvider(event.includeServer(), new ChromaEntityTypeTagsProvider(output, lookupProvider, existingFileHelper));
        dataGenerator.addProvider(event.includeServer(), new ChromaWorldGenProvider(output, lookupProvider));

//        dataGenerator.addProvider(event.includeServer(), new DatapackBuiltinEntriesProvider(output, lookupProvider, Set.of(Chromatica.MOD_ID)));
    }

    private static HolderLookup.Provider createLookup(final HolderLookup.Provider vanillaLookupProvider) {
        final var registryAccess = RegistryAccess.fromRegistryOfRegistries(BuiltInRegistries.REGISTRY);

        @SuppressWarnings("UnstableApiUsage")
        final var allKeys = DataPackRegistriesHooks.getDataPackRegistries()
                .stream()
                .map(RegistryDataLoader.RegistryData::key)
                .collect(Collectors.toSet());

        final var modKeys = Set.copyOf(ChromaWorldGenProvider.BUILDER.getEntryKeys());

        final var missingKeys = Sets.difference(allKeys, modKeys);

        missingKeys.forEach(key -> ChromaWorldGenProvider.BUILDER.add(
                ResourceKey.create(ResourceKey.createRegistryKey(key.registry()), key.location()),
                context -> {
                }
        ));

        return ChromaWorldGenProvider.BUILDER.buildPatch(registryAccess, vanillaLookupProvider, new Cloner.Factory()).full();
    }
}
