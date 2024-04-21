package mods.officialy.chromatica.datagen.worldgen;

import mods.officialy.chromatica.init.ChromaPlacedFeatures;
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

        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ChromaPlacedFeatures.CHROMATICAL_TREE);
        builder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ChromaPlacedFeatures.TALL_CHROMATICAL_TREE);

        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.BLACK_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.RED_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.GREEN_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.BROWN_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.BLUE_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.PURPLE_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.CYAN_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.LIGHT_GRAY_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.GRAY_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.PINK_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.LIME_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.YELLOW_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.LIGHT_BLUE_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.MAGENTA_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.ORANGE_CAVE_CRYSTAL);
        builder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ChromaPlacedFeatures.WHITE_CAVE_CRYSTAL);


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
