package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.SimpleStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ChromaConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> RAINBOW_TREE = createKey("rainbow_tree");

    public static SimpleWeightedRandomList.Builder<BlockState> list = new SimpleWeightedRandomList.Builder<BlockState>()
            .add(Blocks.OAK_LOG.defaultBlockState(), 1).add(Blocks.SPRUCE_LOG.defaultBlockState(), 1);

    public static void boot(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, RAINBOW_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                new WeightedStateProvider(list),
                new StraightTrunkPlacer(6, 5, 4),

                BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),

                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Chromatica.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, Feature<FC> feature, FC configuredFeature) {
        context.register(key, new ConfiguredFeature<>(feature, configuredFeature));
    }

}