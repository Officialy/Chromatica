//package mods.officialy.chromatica.common.level.gen.feature;
//
//import com.mojang.serialization.Codec;
//import mods.officialy.chromatica.api.CrystalColours;
//import mods.officialy.chromatica.init.ChromaBlocks;
//import net.minecraft.core.BlockPos;
//import net.minecraft.tags.BlockTags;
//import net.minecraft.util.RandomSource;
//import net.minecraft.world.level.WorldGenLevel;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.chunk.ChunkGenerator;
//import net.minecraft.world.level.levelgen.feature.TreeFeature;
//import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class ChromaticalTreeFeature extends TreeFeature {
//    private static final List<Block> LOG_BLOCKS = Arrays.asList(Blocks.OAK_LOG, Blocks.BIRCH_LOG, Blocks.SPRUCE_LOG, Blocks.JUNGLE_LOG, Blocks.ACACIA_LOG, Blocks.DARK_OAK_LOG);
//    private Block logBlock;
//    private Block leafBlock;
//
//    public ChromaticalTreeFeature(Codec<TreeConfiguration> p_67201_) {
//        super(p_67201_);
//    }
//
//    private void selectBlocks(RandomSource random) {
//        // Randomly select a log block and a leaf block
//        logBlock = LOG_BLOCKS.get(random.nextInt(LOG_BLOCKS.size()));
//        CrystalColours rndColor = CrystalColours.random(random);
//        leafBlock = CrystalColours.getLeafFromColor(rndColor);
//    }
//    @Override
//    public boolean place(TreeConfiguration p_225029_, WorldGenLevel world, ChunkGenerator p_225031_, RandomSource random, BlockPos pos) {
//        selectBlocks(random);
//
//        // Randomly determine the height of the trunk (between 4 and 8 blocks)
//        int trunkHeight = 4 + random.nextInt(5);
//
//        // Generate the trunk
//        for (int i = 0; i < trunkHeight; i++) {
//            BlockPos currentPos = pos.above(i);
//            if (!world.getBlockState(currentPos.below()).is(BlockTags.LEAVES)) {
//                world.setBlock(currentPos, logBlock.defaultBlockState(), 2);
//            } else {
//                return false;
//            }
//        }
//
//        // Generate the branches
//        for (int i = trunkHeight - 2; i < trunkHeight; i++) {
//            for (int j = 0; j < 2; j++) {
//                BlockPos branchPos = pos.above(i).offset(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
//                world.setBlock(branchPos, logBlock.defaultBlockState(), 2);
//            }
//        }
//
//        // Generate the leaves
//        for (int dx = -3; dx <= 3; dx++) {
//            for (int dz = -3; dz <= 3; dz++) {
//                for (int dy = trunkHeight - 1; dy <= trunkHeight + 2; dy++) {
//                    if (Math.abs(dx) + Math.abs(dz) <= 3 - (dy - trunkHeight)) {
//                        BlockPos leafPos = pos.offset(dx, dy, dz);
//                        if (world.getBlockState(leafPos).isAir()) {
//                            world.setBlock(leafPos, leafBlock.defaultBlockState(), 2);
//                        }
//                    }
//                }
//            }
//        }
//
//        return true;
//    }
//}