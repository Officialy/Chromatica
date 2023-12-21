package mods.officialy.chromatica.common.level.gen.carver;

import com.mojang.serialization.Codec;
import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.common.level.gen.carver.config.ChromaCaveCarverConfiguration;
import mods.officialy.chromatica.init.ChromaBlocks;
import mods.officialy.chromatica.library.noise.FastNoiseLite;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.SectionPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.chunk.CarvingMask;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.levelgen.Aquifer;
import net.minecraft.world.level.levelgen.carver.CarvingContext;
import net.minecraft.world.level.levelgen.carver.WorldCarver;

import java.util.function.Function;

public class ChromaCaveWorldCarver extends WorldCarver<ChromaCaveCarverConfiguration> {
    public ChromaCaveWorldCarver(Codec<ChromaCaveCarverConfiguration> pCodec) {
        super(pCodec);
    }

    public boolean isStartChunk(ChromaCaveCarverConfiguration pConfig, RandomSource pRandom) {
        return pRandom.nextFloat() <= pConfig.probability;
    }

    /**
     * Carves the given chunk with caves that originate from the given {@code chunkPos}.
     * This method is invoked 289 times in order to generate each chunk (once for every position in an 8 chunk radius, or
     * 17x17 chunk area, centered around the target chunk).
     *
     * @see net.minecraft.world.level.chunk.ChunkGenerator#applyCarvers
     * @param pChunk The chunk to be carved
     * @param pChunkPos The chunk position this carver is being called from
     */
    public boolean carve(CarvingContext pContext, ChromaCaveCarverConfiguration pConfig, ChunkAccess pChunk, Function<BlockPos, Holder<Biome>> pBiomeAccessor, RandomSource pRandom, Aquifer pAquifer, ChunkPos pChunkPos, CarvingMask pCarvingMask) {
        int i = SectionPos.sectionToBlockCoord(this.getRange() * 2 - 1);
        int j = pRandom.nextInt(pRandom.nextInt(pRandom.nextInt(this.getCaveBound()) + 1) + 1);

        for (int k = 0; k < j; ++k) {
            double d0 = pChunkPos.getBlockX(pRandom.nextInt(16));
            double d1 = pConfig.y.sample(pRandom, pContext);
            double d2 = pChunkPos.getBlockZ(pRandom.nextInt(16));
            double d3 = pConfig.horizontalRadiusMultiplier.sample(pRandom);
            double d4 = pConfig.verticalRadiusMultiplier.sample(pRandom);
            double d5 = pConfig.floorLevel.sample(pRandom);
            WorldCarver.CarveSkipChecker worldcarver$carveskipchecker = (p_159202_, p_159203_, p_159204_, p_159205_, p_159206_) -> shouldSkip(p_159203_, p_159204_, p_159205_, d5);

            int l = 1;
            if (pRandom.nextInt(4) == 0) {
                double d6 = pConfig.yScale.sample(pRandom);
                float f1 = 1.0F + pRandom.nextFloat() * 6.0F;
                this.createRoom(pContext, pConfig, pChunk, pBiomeAccessor, pAquifer, d0, d1, d2, f1, d6, pCarvingMask, worldcarver$carveskipchecker);
                l += pRandom.nextInt(4);
            }

            for (int k1 = 0; k1 < l; ++k1) {
                float f = pRandom.nextFloat() * ((float) Math.PI * 2F);
                float f3 = (pRandom.nextFloat() - 0.5F) / 4.0F;
                float f2 = this.getThickness(pRandom);
                int i1 = i - pRandom.nextInt(i / 4);
                int j1 = 0;

                // Carve a crystal-filled tunnel
                this.createCrystalTunnel(pContext, pConfig, pChunk, pBiomeAccessor, pRandom.nextInt(), pAquifer, d0, d1, d2, d3, d4, f2, f, f3, 0, i1, this.getYScale(), pCarvingMask, worldcarver$carveskipchecker);
            }
        }

        return true;
    }

    private void createCrystalTunnel(CarvingContext context, ChromaCaveCarverConfiguration config, ChunkAccess chunk, Function<BlockPos, Holder<Biome>> biomeAccessor, int seed, Aquifer aquifer, double x, double y, double z, double hRadius, double vRadius, float thickness, float direction, float tilt, int branch, int length, double yScale, CarvingMask carvingMask, WorldCarver.CarveSkipChecker carveSkipChecker) {
        FastNoiseLite noise = new FastNoiseLite(seed);
        noise.SetNoiseType(FastNoiseLite.NoiseType.OpenSimplex2S);

        for (int i = 0; i < length; ++i) {
            float progress = (float) i / (float) length;
            float posX = (float) (x + Math.cos(direction) * progress * hRadius);
            float posY = (float) (y + Mth.lerp(progress, y, y * yScale));
            float posZ = (float) (z + Math.sin(direction) * progress * hRadius);

            // Apply tilt
            float xDist = posX - (float) x;
            float zDist = posZ - (float) z;
            float tiltFactor = (float) (Math.sqrt(xDist * xDist + zDist * zDist) * tilt);
            posY += (float) (tiltFactor * tiltFactor * 2.0) * Mth.sin(tiltFactor);

            // Use 3D noise for crystal placement
            float noiseValue = noise.GetNoise(posX, posY, posZ);
            Chromatica.LOGGER.info("posY: " + posY);
            if (noiseValue > 0.5) {
                // Crystal block
                int blockX = Mth.floor(posX);
                int blockY = Mth.floor(posY);
                int blockZ = Mth.floor(posZ);
                BlockPos blockPos = new BlockPos(blockX, blockY, blockZ);

                if (carveSkipChecker.shouldSkip(context, blockPos.getX(), blockPos.getY(), blockPos.getZ(), context.getMinGenY())) {
                    continue;
                }
//                Chromatica.LOGGER.info("posY: " + posY);
                // Add your Crystal block here, for example:
                chunk.setBlockState(blockPos, Blocks.DIAMOND_BLOCK.defaultBlockState(), false);
            }
        }
    }

    protected int getCaveBound() {
        return 15;
    }

    protected float getThickness(RandomSource pRandom) {
        float f = pRandom.nextFloat() * 2.0F + pRandom.nextFloat();
        if (pRandom.nextInt(10) == 0) {
            f *= pRandom.nextFloat() * pRandom.nextFloat() * 3.0F + 1.0F;
        }

        return f;
    }

    protected double getYScale() {
        return 1.0D;
    }

    protected void createRoom(CarvingContext pContext, ChromaCaveCarverConfiguration pConfig, ChunkAccess pChunk, Function<BlockPos, Holder<Biome>> pBiomeAccessor, Aquifer pAquifer, double pX, double pY, double pZ, float pRadius, double pHorizontalVerticalRatio, CarvingMask pCarvingMask, WorldCarver.CarveSkipChecker pSkipChecker) {
        double d0 = 1.5D + (double)(Mth.sin(((float)Math.PI / 2F)) * pRadius);
        double d1 = d0 * pHorizontalVerticalRatio;
        this.carveEllipsoid(pContext, pConfig, pChunk, pBiomeAccessor, pAquifer, pX + 1.0D, pY, pZ, d0, d1, pCarvingMask, pSkipChecker);
    }

    protected void createTunnel(CarvingContext pContext, ChromaCaveCarverConfiguration pConfig, ChunkAccess pChunk, Function<BlockPos, Holder<Biome>> pBiomeAccessor, long pSeed, Aquifer pAquifer, double pX, double pY, double pZ, double pHorizontalRadiusMultiplier, double pVerticalRadiusMultiplier, float pThickness, float pYaw, float pPitch, int pBranchIndex, int pBranchCount, double pHorizontalVerticalRatio, CarvingMask pCarvingMask, WorldCarver.CarveSkipChecker pSkipChecker) {
        RandomSource randomsource = RandomSource.create(pSeed);
        int i = randomsource.nextInt(pBranchCount / 2) + pBranchCount / 4;
        boolean flag = randomsource.nextInt(6) == 0;
        float f = 0.0F;
        float f1 = 0.0F;

        for(int j = pBranchIndex; j < pBranchCount; ++j) {
            double d0 = 1.5D + (double)(Mth.sin((float)Math.PI * (float)j / (float)pBranchCount) * pThickness);
            double d1 = d0 * pHorizontalVerticalRatio;
            float f2 = Mth.cos(pPitch);
            pX += Mth.cos(pYaw) * f2;
            pY += Mth.sin(pPitch);
            pZ += Mth.sin(pYaw) * f2;
            pPitch *= flag ? 0.92F : 0.7F;
            pPitch += f1 * 0.1F;
            pYaw += f * 0.1F;
            f1 *= 0.9F;
            f *= 0.75F;
            f1 += (randomsource.nextFloat() - randomsource.nextFloat()) * randomsource.nextFloat() * 2.0F;
            f += (randomsource.nextFloat() - randomsource.nextFloat()) * randomsource.nextFloat() * 4.0F;
            if (j == i && pThickness > 1.0F) {
                this.createTunnel(pContext, pConfig, pChunk, pBiomeAccessor, randomsource.nextLong(), pAquifer, pX, pY, pZ, pHorizontalRadiusMultiplier, pVerticalRadiusMultiplier, randomsource.nextFloat() * 0.5F + 0.5F, pYaw - ((float)Math.PI / 2F), pPitch / 3.0F, j, pBranchCount, 1.0D, pCarvingMask, pSkipChecker);
                this.createTunnel(pContext, pConfig, pChunk, pBiomeAccessor, randomsource.nextLong(), pAquifer, pX, pY, pZ, pHorizontalRadiusMultiplier, pVerticalRadiusMultiplier, randomsource.nextFloat() * 0.5F + 0.5F, pYaw + ((float)Math.PI / 2F), pPitch / 3.0F, j, pBranchCount, 1.0D, pCarvingMask, pSkipChecker);
                return;
            }

            if (randomsource.nextInt(4) != 0) {
                if (!canReach(pChunk.getPos(), pX, pZ, j, pBranchCount, pThickness)) {
                    return;
                }

                this.carveEllipsoid(pContext, pConfig, pChunk, pBiomeAccessor, pAquifer, pX, pY, pZ, d0 * pHorizontalRadiusMultiplier, d1 * pVerticalRadiusMultiplier, pCarvingMask, pSkipChecker);
            }
        }

    }

    private static boolean shouldSkip(double pRelative, double pRelativeY, double pRelativeZ, double pMinrelativeY) {
        if (pRelativeY <= pMinrelativeY) {
            return true;
        } else {
            return pRelative * pRelative + pRelativeY * pRelativeY + pRelativeZ * pRelativeZ >= 1.0D;
        }
    }
}
