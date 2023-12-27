package mods.officialy.chromatica.datagen.worldgen;

import mods.officialy.chromatica.init.ChromaFeatures;
import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
public class RainbowForestBiomeBuilder {

    public static Biome rainbowForestBiome(HolderGetter<PlacedFeature> placedFeatures, HolderGetter<ConfiguredWorldCarver<?>> worldCarvers) {
        return makeForestBiome(new BiomeGenerationSettings.Builder(placedFeatures, worldCarvers));
    }

    public static Biome makeForestBiome(BiomeGenerationSettings.Builder builder) {

        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ChromaFeatures.RAINBOW_TREE);

        return fullDefinition(
                true,
                0.8F,
                0.0F,
                new BiomeSpecialEffects.Builder()
                        .fogColor(0x50C8C8)
                        .skyColor(0x50C8C8)
                        .waterColor(0x64C8F0)
                        .waterFogColor(0x64C8F0)
                        .grassColorOverride(0xAAFFC8)
                        .foliageColorOverride(0xAAFFC8)
                        .grassColorModifier(BiomeSpecialEffects.GrassColorModifier.NONE)
                        .build(),
                new MobSpawnSettings.Builder().build(),
                builder.build(),
                Biome.TemperatureModifier.NONE
        );
    }

    public static Biome fullDefinition(boolean precipitation, float temperature, float downfall, BiomeSpecialEffects effects, MobSpawnSettings spawnSettings, BiomeGenerationSettings generationSettings, Biome.TemperatureModifier temperatureModifier) {
        return new Biome.BiomeBuilder()
                .hasPrecipitation(precipitation)
                .temperature(temperature)
                .downfall(downfall)
                .specialEffects(effects)
                .mobSpawnSettings(spawnSettings)
                .generationSettings(generationSettings)
                .temperatureAdjustment(temperatureModifier)
                .build();
    }

}
