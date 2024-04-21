package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.common.level.gen.feature.CaveCrystalFeature;
import mods.officialy.chromatica.common.level.gen.feature.config.CaveCrystalFeatureConfig;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ChromaFeatures {
    public static final DeferredRegister<Feature<?>> FEATURE_REGISTRY = DeferredRegister.create(Registries.FEATURE, Chromatica.MOD_ID);

    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> BLACK_CAVE_CRYSTAL = FEATURE_REGISTRY.register("black_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> RED_CAVE_CRYSTAL = FEATURE_REGISTRY.register("red_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> GREEN_CAVE_CRYSTAL = FEATURE_REGISTRY.register("green_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> BROWN_CAVE_CRYSTAL = FEATURE_REGISTRY.register("brown_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> BLUE_CAVE_CRYSTAL = FEATURE_REGISTRY.register("blue_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> PURPLE_CAVE_CRYSTAL = FEATURE_REGISTRY.register("purple_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> CYAN_CAVE_CRYSTAL = FEATURE_REGISTRY.register("cyan_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> LIGHT_GRAY_CAVE_CRYSTAL = FEATURE_REGISTRY.register("light_gray_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> GRAY_CAVE_CRYSTAL = FEATURE_REGISTRY.register("gray_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> PINK_CAVE_CRYSTAL = FEATURE_REGISTRY.register("pink_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> LIME_CAVE_CRYSTAL = FEATURE_REGISTRY.register("lime_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> YELLOW_CAVE_CRYSTAL = FEATURE_REGISTRY.register("yellow_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> LIGHT_BLUE_CAVE_CRYSTAL = FEATURE_REGISTRY.register("light_blue_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> MAGENTA_CAVE_CRYSTAL = FEATURE_REGISTRY.register("magenta_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> ORANGE_CAVE_CRYSTAL = FEATURE_REGISTRY.register("orange_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));
    public static final DeferredHolder<Feature<?>, CaveCrystalFeature> WHITE_CAVE_CRYSTAL = FEATURE_REGISTRY.register("white_cave_crystal", () -> new CaveCrystalFeature(CaveCrystalFeatureConfig.CODEC));

//    public static final DeferredHolder<Feature<?>, ChromaticalTreeFeature> CHROMATICAL_TREE_FEATURE = FEATURE_REGISTRY.register("chromatical_tree", () -> new ChromaticalTreeFeature(TreeConfiguration.CODEC));
//    public static final DeferredHolder<Feature<?>, TallChromaticalTreeFeature> TALL_CHROMATICAL_TREE_FEATURE = FEATURE_REGISTRY.register("tall_chromatical_tree", () -> new TallChromaticalTreeFeature(TreeConfiguration.CODEC));

}