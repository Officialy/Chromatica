package mods.officialy.chromatica.common.level.gen.placement;

import com.mojang.datafixers.Products;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import mods.officialy.chromatica.api.CrystalColours;
import mods.officialy.chromatica.init.ChromaFoliagePlacerTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class RainbowTreeFoliagePlacer extends FoliagePlacer {

    public static final Codec<RainbowTreeFoliagePlacer> CODEC = RecordCodecBuilder.create(p_68427_ -> rainbowTreeFoliage(p_68427_).apply(p_68427_, RainbowTreeFoliagePlacer::new));
    protected final int height;
    protected final CrystalColours colour;

    protected static <P extends RainbowTreeFoliagePlacer> Products.P4<RecordCodecBuilder.Mu<P>, IntProvider, IntProvider, Integer, CrystalColours> rainbowTreeFoliage(RecordCodecBuilder.Instance<P> p_68414_) {
        return foliagePlacerParts(p_68414_).and(Codec.intRange(0, 16).fieldOf("height").forGetter(p_68412_ -> p_68412_.height))
                .and(Codec.unit(CrystalColours.BLACK).fieldOf("colour").forGetter(p_161020_ -> p_161020_.colour));
    }

    public RainbowTreeFoliagePlacer(IntProvider radius, IntProvider offset, int height, CrystalColours colour) {
        super(radius, offset);
        this.height = height;
        this.colour = colour;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ChromaFoliagePlacerTypes.RAINBOW_TREE_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader world, FoliagePlacer.FoliageSetter foliageSetter, RandomSource random, TreeConfiguration config, int baseHeight, FoliagePlacer.FoliageAttachment attachment, int foliageHeight, int foliageWidth, int startingHeightOffset) {
        BlockPos position = attachment.pos();
        Block leafBlock = CrystalColours.getLeafFromColor(colour);

        // Adjust height to fit within the world and avoid obstruction.
//        while (foliageHeight > 2 && !world.isStateAtPosition(position.above(foliageHeight + 4), BlockBehaviour.BlockStateBase::isAir))
//            foliageHeight--;

        // Calculate the minimum height of the trunk.
        startingHeightOffset = Math.min(startingHeightOffset, foliageHeight / 2);

        for (int j = 0; j < foliageHeight; j++) {
            int currentY = position.getY() + j;

            if (j >= startingHeightOffset) {
                for (int i = -foliageWidth; i <= foliageWidth; i++) {
                    for (int k = -foliageWidth; k <= foliageWidth; k++) {
                        if ((i != 0 || k != 0) && Math.abs(i) + Math.abs(k) <= foliageWidth + 1) {
                            int currentX = position.getX() + i;
                            int currentZ = position.getZ() + k;

                            if (world.isStateAtPosition(new BlockPos(currentX, currentY, currentZ),  BlockBehaviour.BlockStateBase::isAir)) {
                                foliageSetter.set(new BlockPos(currentX, currentY, currentZ), leafBlock.defaultBlockState());
                            }
                        }
                    }
                }
            }

            for (int i = -1; i <= 1; i++) {
                for (int k = -1; k <= 1; k++) {
                    int currentX = position.getX() + i;
                    int currentZ = position.getZ() + k;

                    if (i == 0 || k == 0) {
                        if (world.isStateAtPosition(new BlockPos(currentX, position.getY() + foliageHeight, currentZ), BlockBehaviour.BlockStateBase::isAir)) {
                            foliageSetter.set(new BlockPos(currentX, position.getY() + foliageHeight, currentZ), leafBlock.defaultBlockState());
                        }
                    } else {
                        if (world.isStateAtPosition(new BlockPos(currentX, currentY, currentZ),  BlockBehaviour.BlockStateBase::isAir)) {
                            foliageSetter.set(new BlockPos(currentX, currentY, currentZ), leafBlock.defaultBlockState());
                        }
                    }
                }
            }

            // Place leaf block at the top of the tree.
            foliageSetter.set(new BlockPos(position.above(foliageHeight + 1)), leafBlock.defaultBlockState());
        }
    }

    @Override
    public int foliageHeight(RandomSource p_225516_, int p_225517_, TreeConfiguration p_225518_) {
        return this.height;
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource p_225509_, int p_225510_, int p_225511_, int p_225512_, int p_225513_, boolean p_225514_) {
        return p_225510_ == p_225513_ && p_225512_ == p_225513_ && (p_225509_.nextInt(2) == 0 || p_225511_ == 0);
    }
}
