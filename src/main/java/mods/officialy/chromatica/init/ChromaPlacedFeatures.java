package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountOnEveryLayerPlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class ChromaPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE_REGISTRY = DeferredRegister.create(Registries.PLACED_FEATURE, Chromatica.MOD_ID);

    public static final ResourceKey<PlacedFeature> CHROMATICAL_TREE = createKey("chromatical_tree");
    public static final ResourceKey<PlacedFeature> TALL_CHROMATICAL_TREE = createKey("tall_chromatical_tree");
    public static final ResourceKey<PlacedFeature> BLACK_CAVE_CRYSTAL = createKey("black_cave_crystal");
    public static final ResourceKey<PlacedFeature> RED_CAVE_CRYSTAL = createKey("red_cave_crystal");
    public static final ResourceKey<PlacedFeature> GREEN_CAVE_CRYSTAL = createKey("green_cave_crystal");
    public static final ResourceKey<PlacedFeature> BROWN_CAVE_CRYSTAL = createKey("brown_cave_crystal");
    public static final ResourceKey<PlacedFeature> BLUE_CAVE_CRYSTAL = createKey("blue_cave_crystal");
    public static final ResourceKey<PlacedFeature> PURPLE_CAVE_CRYSTAL = createKey("purple_cave_crystal");
    public static final ResourceKey<PlacedFeature> CYAN_CAVE_CRYSTAL = createKey("cyan_cave_crystal");
    public static final ResourceKey<PlacedFeature> LIGHT_GRAY_CAVE_CRYSTAL = createKey("light_gray_cave_crystal");
    public static final ResourceKey<PlacedFeature> GRAY_CAVE_CRYSTAL = createKey("gray_cave_crystal");
    public static final ResourceKey<PlacedFeature> PINK_CAVE_CRYSTAL = createKey("pink_cave_crystal");
    public static final ResourceKey<PlacedFeature> LIME_CAVE_CRYSTAL = createKey("lime_cave_crystal");
    public static final ResourceKey<PlacedFeature> YELLOW_CAVE_CRYSTAL = createKey("yellow_cave_crystal");
    public static final ResourceKey<PlacedFeature> LIGHT_BLUE_CAVE_CRYSTAL = createKey("light_blue_cave_crystal");
    public static final ResourceKey<PlacedFeature> MAGENTA_CAVE_CRYSTAL = createKey("magenta_cave_crystal");
    public static final ResourceKey<PlacedFeature> ORANGE_CAVE_CRYSTAL = createKey("orange_cave_crystal");
    public static final ResourceKey<PlacedFeature> WHITE_CAVE_CRYSTAL = createKey("white_cave_crystal");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holdergetter = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> rainbowtree = holdergetter.getOrThrow(ChromaConfiguredFeatures.CHROMATICAL_TREE);
        Holder<ConfiguredFeature<?, ?>> tallrainbowtree = holdergetter.getOrThrow(ChromaConfiguredFeatures.TALL_CHROMATICAL_TREE);


        Holder<ConfiguredFeature<?, ?>> black_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.BLACK_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> red_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.RED_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> green_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.GREEN_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> brown_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.BROWN_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> blue_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.BLUE_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> purple_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.PURPLE_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> cyan_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.CYAN_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> light_gray_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.LIGHT_GRAY_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> gray_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.GRAY_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> pink_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.PINK_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> lime_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.LIME_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> yellow_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.YELLOW_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> light_blue_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.LIGHT_BLUE_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> magenta_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.MAGENTA_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> orange_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.ORANGE_CAVE_CRYSTAL);
        Holder<ConfiguredFeature<?, ?>> white_cave_crystal = holdergetter.getOrThrow(ChromaConfiguredFeatures.WHITE_CAVE_CRYSTAL);

        //Rainbow forest features
        PlacementUtils.register(context, CHROMATICAL_TREE, rainbowtree, treePlacement(PlacementUtils.countExtra(3, 0.1F, 2)));
        PlacementUtils.register(context, TALL_CHROMATICAL_TREE, rainbowtree, treePlacement(PlacementUtils.countExtra(3, 0.1F, 2)));

        //Cave crystals
        PlacementUtils.register(context, BLACK_CAVE_CRYSTAL, black_cave_crystal);
        PlacementUtils.register(context, RED_CAVE_CRYSTAL, red_cave_crystal);
        PlacementUtils.register(context, GREEN_CAVE_CRYSTAL, green_cave_crystal);
        PlacementUtils.register(context, BROWN_CAVE_CRYSTAL, brown_cave_crystal);
        PlacementUtils.register(context, BLUE_CAVE_CRYSTAL, blue_cave_crystal);
        PlacementUtils.register(context, PURPLE_CAVE_CRYSTAL, purple_cave_crystal);
        PlacementUtils.register(context, CYAN_CAVE_CRYSTAL, cyan_cave_crystal);
        PlacementUtils.register(context, LIGHT_GRAY_CAVE_CRYSTAL, light_gray_cave_crystal);
        PlacementUtils.register(context, GRAY_CAVE_CRYSTAL, gray_cave_crystal);
        PlacementUtils.register(context, PINK_CAVE_CRYSTAL, pink_cave_crystal);
        PlacementUtils.register(context, LIME_CAVE_CRYSTAL, lime_cave_crystal);
        PlacementUtils.register(context, YELLOW_CAVE_CRYSTAL, yellow_cave_crystal);
        PlacementUtils.register(context, LIGHT_BLUE_CAVE_CRYSTAL, light_blue_cave_crystal);
        PlacementUtils.register(context, MAGENTA_CAVE_CRYSTAL, magenta_cave_crystal);
        PlacementUtils.register(context, ORANGE_CAVE_CRYSTAL, orange_cave_crystal);
        PlacementUtils.register(context, WHITE_CAVE_CRYSTAL, white_cave_crystal);

        //Proxima Biome features
    }

    public static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Chromatica.MOD_ID, name));
    }

}