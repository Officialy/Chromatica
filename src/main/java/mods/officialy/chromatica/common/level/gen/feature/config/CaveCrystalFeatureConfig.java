package mods.officialy.chromatica.common.level.gen.feature.config;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import mods.officialy.chromatica.api.CrystalColours;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class CaveCrystalFeatureConfig extends OreConfiguration {

    public static final Codec<CaveCrystalFeatureConfig> CODEC = RecordCodecBuilder.create(
            p_67849_ -> p_67849_.group(
                            Codec.list(CaveCrystalFeatureConfig.TargetBlockState.CODEC).fieldOf("targets").forGetter(p_161027_ -> p_161027_.targetStates),
                            Codec.unit(CrystalColours.BLACK).fieldOf("colour").forGetter(p_161020_ -> p_161020_.colour)
                    )
                    .apply(p_67849_, CaveCrystalFeatureConfig::new)
    );

    public final CrystalColours colour;
    public CaveCrystalFeatureConfig(List<TargetBlockState> list, CrystalColours colour) {
        super(list, 1);
        this.colour = colour;
    }

    public CaveCrystalFeatureConfig(RuleTest p_161008_, BlockState p_161009_, CrystalColours colour) {
        this(ImmutableList.of(new OreConfiguration.TargetBlockState(p_161008_, p_161009_)), colour);
    }
}