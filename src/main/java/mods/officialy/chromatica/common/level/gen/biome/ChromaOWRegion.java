package mods.officialy.chromatica.common.level.gen.biome;

import com.mojang.datafixers.util.Pair;
import mods.officialy.chromatica.init.ChromaBiomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.*;

import java.util.function.Consumer;

public class ChromaOWRegion extends Region {
    public ChromaOWRegion(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();

        new ParameterUtils.ParameterPointListBuilder()
                .temperature(ParameterUtils.Temperature.WARM)
                .humidity(ParameterUtils.Humidity.NEUTRAL)
                .continentalness(ParameterUtils.Continentalness.MID_INLAND)
                .erosion(ParameterUtils.Erosion.EROSION_2, ParameterUtils.Erosion.EROSION_3)
                .depth(ParameterUtils.Depth.SURFACE, ParameterUtils.Depth.FLOOR)
                .weirdness(ParameterUtils.Weirdness.MID_SLICE_NORMAL_ASCENDING, ParameterUtils.Weirdness.MID_SLICE_VARIANT_DESCENDING)
                .build().forEach(point -> builder.add(point, ChromaBiomes.RAINBOW_FOREST));

        builder.build().forEach(mapper);
    }

}
