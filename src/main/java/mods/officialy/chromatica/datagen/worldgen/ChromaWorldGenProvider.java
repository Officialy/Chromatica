package mods.officialy.chromatica.datagen.worldgen;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.init.ChromaBiomes;
import mods.officialy.chromatica.init.ChromaConfiguredFeatures;
import mods.officialy.chromatica.init.ChromaPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ChromaWorldGenProvider extends DatapackBuiltinEntriesProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ChromaConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ChromaPlacedFeatures::bootstrap)
            .add(Registries.BIOME, ChromaBiomes::bootstrap);
//                .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ChromaBiomeModifiers::bootstrap);

    public ChromaWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Chromatica.MOD_ID));
    }

}