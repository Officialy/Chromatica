package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.datagen.worldgen.RainbowForestBiomeBuilder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ChromaBiomes {

    public static final ResourceKey<Biome> RAINBOW_FOREST = registerKey("rainbow_forest");

    public static void bootstrap(BootstapContext<Biome> context) {
        HolderGetter<PlacedFeature> placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> vanillaConfiguredCarvers = context.lookup(Registries.CONFIGURED_CARVER);
        context.register(RAINBOW_FOREST, RainbowForestBiomeBuilder.rainbowForestBiome(placedFeatures, vanillaConfiguredCarvers));
    }

    private static ResourceKey<Biome> registerKey(String name) {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(Chromatica.MOD_ID, name));
    }
}
