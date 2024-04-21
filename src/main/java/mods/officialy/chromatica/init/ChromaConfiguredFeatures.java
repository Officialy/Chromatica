package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.api.CrystalColours;
import mods.officialy.chromatica.common.level.gen.feature.config.CaveCrystalFeatureConfig;
import mods.officialy.chromatica.common.level.gen.placement.RainbowTreeFoliagePlacer;
import mods.officialy.chromatica.util.random.RandomTagSingleStateProvider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.ArrayList;
import java.util.List;

public class ChromaConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> CHROMATICAL_TREE = createKey("chromatical_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_CHROMATICAL_TREE = createKey("tall_chromatical_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_CAVE_CRYSTAL = createKey("black_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CAVE_CRYSTAL = createKey("red_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CAVE_CRYSTAL = createKey("green_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BROWN_CAVE_CRYSTAL = createKey("brown_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_CAVE_CRYSTAL = createKey("blue_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CAVE_CRYSTAL = createKey("purple_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYAN_CAVE_CRYSTAL = createKey("cyan_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_GRAY_CAVE_CRYSTAL = createKey("light_gray_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAY_CAVE_CRYSTAL = createKey("gray_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CAVE_CRYSTAL = createKey("pink_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIME_CAVE_CRYSTAL = createKey("lime_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CAVE_CRYSTAL = createKey("yellow_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_BLUE_CAVE_CRYSTAL = createKey("light_blue_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAGENTA_CAVE_CRYSTAL = createKey("magenta_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_CAVE_CRYSTAL = createKey("orange_cave_crystal");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CAVE_CRYSTAL = createKey("white_cave_crystal");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest ruletest = new TagMatchTest(BlockTags.BASE_STONE_OVERWORLD);
        RuleTest ruletest1 = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest ruletest2 = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest ruletest3 = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest ruletest4 = new TagMatchTest(BlockTags.BASE_STONE_NETHER);

        register(context, CHROMATICAL_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new RandomTagSingleStateProvider(new ArrayList<>(), BlockTags.OVERWORLD_NATURAL_LOGS),
                new StraightTrunkPlacer(4, 1, 3),

                BlockStateProvider.simple(ChromaBlocks.BLACK_CHROMATICAL_LEAVES.get().defaultBlockState()),
                new RainbowTreeFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 6, CrystalColours.random()),

                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, TALL_CHROMATICAL_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new RandomTagSingleStateProvider(new ArrayList<>(), BlockTags.OVERWORLD_NATURAL_LOGS),
                new StraightTrunkPlacer(6, 5, 4),

                BlockStateProvider.simple(ChromaBlocks.BLACK_CHROMATICAL_LEAVES.get().defaultBlockState()),
                new RainbowTreeFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 8, CrystalColours.random()),

                new TwoLayersFeatureSize(1, 0, 2)).build());

        registerCaveCrystal(context, BLACK_CAVE_CRYSTAL, ChromaFeatures.BLACK_CAVE_CRYSTAL.get(), CrystalColours.BLACK, ruletest1, ruletest2, ChromaBlocks.BLACK_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, RED_CAVE_CRYSTAL, ChromaFeatures.RED_CAVE_CRYSTAL.get(), CrystalColours.RED, ruletest1, ruletest2, ChromaBlocks.RED_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, GREEN_CAVE_CRYSTAL, ChromaFeatures.GREEN_CAVE_CRYSTAL.get(), CrystalColours.GREEN, ruletest1, ruletest2, ChromaBlocks.GREEN_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, BROWN_CAVE_CRYSTAL, ChromaFeatures.BROWN_CAVE_CRYSTAL.get(), CrystalColours.BROWN, ruletest1, ruletest2, ChromaBlocks.BROWN_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, BLUE_CAVE_CRYSTAL, ChromaFeatures.BLUE_CAVE_CRYSTAL.get(), CrystalColours.BLUE, ruletest1, ruletest2, ChromaBlocks.BLUE_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, PURPLE_CAVE_CRYSTAL, ChromaFeatures.PURPLE_CAVE_CRYSTAL.get(), CrystalColours.PURPLE, ruletest1, ruletest2, ChromaBlocks.PURPLE_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, CYAN_CAVE_CRYSTAL, ChromaFeatures.CYAN_CAVE_CRYSTAL.get(), CrystalColours.CYAN, ruletest1, ruletest2, ChromaBlocks.CYAN_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, LIGHT_GRAY_CAVE_CRYSTAL, ChromaFeatures.LIGHT_GRAY_CAVE_CRYSTAL.get(), CrystalColours.LIGHT_GRAY, ruletest1, ruletest2, ChromaBlocks.LIGHT_GRAY_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, GRAY_CAVE_CRYSTAL, ChromaFeatures.GRAY_CAVE_CRYSTAL.get(), CrystalColours.GRAY, ruletest1, ruletest2, ChromaBlocks.GRAY_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, PINK_CAVE_CRYSTAL, ChromaFeatures.PINK_CAVE_CRYSTAL.get(), CrystalColours.PINK, ruletest1, ruletest2, ChromaBlocks.PINK_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, LIME_CAVE_CRYSTAL, ChromaFeatures.LIME_CAVE_CRYSTAL.get(), CrystalColours.LIME, ruletest1, ruletest2, ChromaBlocks.LIME_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, YELLOW_CAVE_CRYSTAL, ChromaFeatures.YELLOW_CAVE_CRYSTAL.get(), CrystalColours.YELLOW, ruletest1, ruletest2, ChromaBlocks.YELLOW_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, LIGHT_BLUE_CAVE_CRYSTAL, ChromaFeatures.LIGHT_BLUE_CAVE_CRYSTAL.get(), CrystalColours.LIGHT_BLUE, ruletest1, ruletest2, ChromaBlocks.LIGHT_BLUE_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, MAGENTA_CAVE_CRYSTAL, ChromaFeatures.MAGENTA_CAVE_CRYSTAL.get(), CrystalColours.MAGENTA, ruletest1, ruletest2, ChromaBlocks.MAGENTA_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, ORANGE_CAVE_CRYSTAL, ChromaFeatures.ORANGE_CAVE_CRYSTAL.get(), CrystalColours.ORANGE, ruletest1, ruletest2, ChromaBlocks.ORANGE_CAVE_CRYSTAL.get());
        registerCaveCrystal(context, WHITE_CAVE_CRYSTAL, ChromaFeatures.WHITE_CAVE_CRYSTAL.get(), CrystalColours.WHITE, ruletest1, ruletest2, ChromaBlocks.WHITE_CAVE_CRYSTAL.get());

        //todo tall crystals for below y=0

    }

    private static List<OreConfiguration.TargetBlockState> createTargetBlockStateList(RuleTest ruletest1, RuleTest ruletest2, Block block) {
        return List.of(
                OreConfiguration.target(ruletest1, block.defaultBlockState()),
                OreConfiguration.target(ruletest2, block.defaultBlockState())
        );
    }

    private static void registerCaveCrystal(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, Feature<CaveCrystalFeatureConfig> feature, CrystalColours colour, RuleTest ruletest1, RuleTest ruletest2, Block block) {
        List<OreConfiguration.TargetBlockState> targetBlockStateList = createTargetBlockStateList(ruletest1, ruletest2, block);
        register(context, key, feature, new CaveCrystalFeatureConfig(targetBlockStateList, colour));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Chromatica.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, Feature<FC> feature, FC configuredFeature) {
        context.register(key, new ConfiguredFeature<>(feature, configuredFeature));
    }

}