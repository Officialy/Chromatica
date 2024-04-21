package mods.officialy.chromatica.common.level.gen.feature;

import com.mojang.serialization.Codec;
import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.api.CrystalColours;
import mods.officialy.chromatica.api.events.GenerateCrystalEvent;
import mods.officialy.chromatica.common.level.gen.feature.config.CaveCrystalFeatureConfig;
import mods.officialy.chromatica.init.ChromaBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.neoforged.neoforge.common.NeoForge;

public class CaveCrystalFeature extends Feature<CaveCrystalFeatureConfig> {

    public CaveCrystalFeature(Codec<CaveCrystalFeatureConfig> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<CaveCrystalFeatureConfig> config) {
        int x = config.origin().getX();
        int y = config.origin().getY();
        int z = config.origin().getZ();
        RandomSource random = config.random();
        int placeAttempts = 128;
        for (int i = 0; i < placeAttempts; i++) {
            int posX = x + random.nextInt(16);
            int posZ = z + random.nextInt(16);
            int maxy = 300;
            if (config.level() == Level.NETHER)
                maxy = 128;
            int posY = y + random.nextInt(maxy - 4);
            BlockState state = config.config().targetStates.get(0).state; //todo tall crystals below y=0
            CrystalColours colour = config.config().colour;
            for (OreConfiguration.TargetBlockState targetStates : config.config().targetStates) {
                for (int l1 = x; l1 <= x; ++l1) {
                    for (int i2 = z; i2 <= z; ++i2) {
                        BlockPos pos = new BlockPos(posX, posY, posZ);
                        if (posY <= config.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, l1, i2)) {
                            if (canPlace(targetStates, pos, config.level(), config.random())) {
                                config.level().setBlock(pos.above(), state, 3);
                                NeoForge.EVENT_BUS.post(new GenerateCrystalEvent(config.level(), pos, config.random(), colour));
//                                Chromatica.LOGGER.info("Generating " + state.getBlock().getName() + " Crystal at " + posX + ", " + posY + ", " + posZ);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean canPlace(OreConfiguration.TargetBlockState targetStates, BlockPos pos, WorldGenLevel level, RandomSource random) {
        // Check if the block at the given position is replaceable based on targetStates
        if (targetStates.target.test(level.getBlockState(pos), random)) {
            BlockPos downPos = pos.below();
            BlockState groundState = level.getBlockState(downPos);
            boolean airAbove = level.isEmptyBlock(pos.above());

            // Check if the block above is air and if at least 3 of the blocks around the position are air
            //Currently disabled because it's not working properly so im setting blocks next to it as air
            boolean sidesValid =
                    (level.isEmptyBlock(pos.east()) ? 1 : 0) +
                            (level.isEmptyBlock(pos.west()) ? 1 : 0) +
                            (level.isEmptyBlock(pos.north()) ? 1 : 0) +
                            (level.isEmptyBlock(pos.south()) ? 1 : 0) >= 2;
//            Chromatica.LOGGER.info("Sides Valid: " + sidesValid);
            // Check if the block below is solid ground, currently uses the same check as for placing a cake in-case mojang changes code.
            // This is however deprecated rn so it'll be changed in the future.
            return airAbove && sidesValid && Blocks.CAKE.canSurvive(groundState, level, downPos);
        }
        return false;
    }

}
