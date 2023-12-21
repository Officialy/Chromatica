package mods.officialy.chromatica.common.level.gen.features.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public record ColouredCrystalFeatureConfig(IntProvider iterationProvider,
                                           BlockStateProvider blockStateProvider) implements FeatureConfiguration {

    public static final Codec<ColouredCrystalFeatureConfig> CODEC = RecordCodecBuilder.create((instance) -> instance.group(
            IntProvider.POSITIVE_CODEC.fieldOf("iterations").forGetter(ColouredCrystalFeatureConfig::iterationProvider),
            BlockStateProvider.CODEC.fieldOf("state_provider").forGetter(ColouredCrystalFeatureConfig::blockStateProvider)
    ).apply(instance, ColouredCrystalFeatureConfig::new));
}