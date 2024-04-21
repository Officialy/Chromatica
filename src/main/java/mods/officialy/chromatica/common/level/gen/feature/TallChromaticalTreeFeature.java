//package mods.officialy.chromatica.common.level.gen.feature;
//
//import com.mojang.serialization.Codec;
//import mods.officialy.chromatica.Chromatica;
//import mods.officialy.chromatica.api.CrystalColours;
//import mods.officialy.chromatica.common.block.BlockChromaticalLeaves;
//import net.minecraft.core.BlockPos;
//import net.minecraft.util.Mth;
//import net.minecraft.util.RandomSource;
//import net.minecraft.world.level.WorldGenLevel;
//import net.minecraft.world.level.block.Block;
//import net.minecraft.world.level.block.Blocks;
//import net.minecraft.world.level.block.state.BlockState;
//import net.minecraft.world.level.chunk.ChunkGenerator;
//import net.minecraft.world.level.levelgen.feature.TreeFeature;
//import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
//import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
//import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
//import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.BiConsumer;
//
//public class TallChromaticalTreeFeature extends TreeFeature {
//    private Block logBlock;
//    private BlockChromaticalLeaves leafBlock;
//
//    public TallChromaticalTreeFeature(Codec<TreeConfiguration> p_67201_) {
//        super(p_67201_);
//    }
//
//    private void selectBlocks(RandomSource random) {
//        // Randomly select a leaf block based on the tree's color.
//        CrystalColours rndColor = CrystalColours.random(random);
//        leafBlock = CrystalColours.getLeafFromColor(rndColor);
//    }
//
//    @Override
//    public boolean place(TreeConfiguration config, WorldGenLevel world, ChunkGenerator p_225031_, RandomSource random, BlockPos position) {
//        BiConsumer<BlockPos, BlockState> biconsumer = (p_160555_, p_160556_) -> {
//            set.add(p_160555_.immutable());
//            worldgenlevel.setBlock(p_160555_, p_160556_, 19);
//        };
//
//        List<FoliagePlacer.FoliageAttachment> list = config.trunkPlacer.placeTrunk();
//
//        selectBlocks(random);
//

//
//        return true;
//    }
//}