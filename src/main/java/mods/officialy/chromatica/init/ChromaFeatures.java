package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ChromaFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE_REGISTRY = DeferredRegister.create(Registries.PLACED_FEATURE, Chromatica.MOD_ID);

    public static final ResourceKey<PlacedFeature> RAINBOW_TREE = createKey("rainbow_tree");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holdergetter = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> holder = holdergetter.getOrThrow(ChromaConfiguredFeatures.RAINBOW_TREE);

        PlacementUtils.register(context, RAINBOW_TREE, holder, new PlacementModifier[]{CountOnEveryLayerPlacement.of(8), BiomeFilter.biome()});
    }

    public static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Chromatica.MOD_ID, name));
    }

}