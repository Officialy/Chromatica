package mods.officialy.chromatica.common.level.gen.carver.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.HolderSet;
import net.minecraft.util.valueproviders.FloatProvider;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.carver.CarverConfiguration;
import net.minecraft.world.level.levelgen.carver.CarverDebugSettings;
import net.minecraft.world.level.levelgen.heightproviders.HeightProvider;

public class ChromaCaveCarverConfiguration extends CarverConfiguration {

    public static final Codec<ChromaCaveCarverConfiguration> CODEC = RecordCodecBuilder.create((p_159184_) -> p_159184_.group(CarverConfiguration.CODEC
            .forGetter((p_159192_) -> p_159192_), FloatProvider.CODEC.fieldOf("horizontal_radius_multiplier")
            .forGetter((p_159190_) -> p_159190_.horizontalRadiusMultiplier), FloatProvider.CODEC.fieldOf("vertical_radius_multiplier")
            .forGetter((p_159188_) -> p_159188_.verticalRadiusMultiplier), FloatProvider.codec(-10.0F, 10.0F).fieldOf("floor_level")
            .forGetter((p_159186_) -> p_159186_.floorLevel)).apply(p_159184_, ChromaCaveCarverConfiguration::new));
    public final FloatProvider horizontalRadiusMultiplier;
    public final FloatProvider verticalRadiusMultiplier;
    public final FloatProvider floorLevel;

    public ChromaCaveCarverConfiguration(float pProbability, HeightProvider pY, FloatProvider pYScale, VerticalAnchor pLavaLevel, CarverDebugSettings pDebugSettings, HolderSet<Block> pReplaceable, FloatProvider pHorizontalRadiusMultiplier, FloatProvider pVerticalRadiusMultiplier, FloatProvider pFloorLevel) {
        super(pProbability, pY, pYScale, pLavaLevel, pDebugSettings, pReplaceable);
        this.horizontalRadiusMultiplier = pHorizontalRadiusMultiplier;
        this.verticalRadiusMultiplier = pVerticalRadiusMultiplier;
        this.floorLevel = pFloorLevel;
    }

    public ChromaCaveCarverConfiguration(float pProbability, HeightProvider pY, FloatProvider pYScale, VerticalAnchor pLavaLevel, HolderSet<Block> pReplaceable, FloatProvider pHorizontalRadiusMultiplier, FloatProvider pVerticalRadiusMultiplier, FloatProvider pFloorLevel) {
        this(pProbability, pY, pYScale, pLavaLevel, CarverDebugSettings.DEFAULT, pReplaceable, pHorizontalRadiusMultiplier, pVerticalRadiusMultiplier, pFloorLevel);
    }

    public ChromaCaveCarverConfiguration(CarverConfiguration p_159179_, FloatProvider p_159180_, FloatProvider p_159181_, FloatProvider p_159182_) {
        this(p_159179_.probability, p_159179_.y, p_159179_.yScale, p_159179_.lavaLevel, p_159179_.debugSettings, p_159179_.replaceable, p_159180_, p_159181_, p_159182_);
    }
}
