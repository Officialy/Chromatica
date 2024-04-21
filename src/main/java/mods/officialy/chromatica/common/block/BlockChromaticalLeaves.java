package mods.officialy.chromatica.common.block;

import com.mojang.blaze3d.systems.RenderSystem;
import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.api.CrystalColours;
import mods.officialy.chromatica.init.ChromaBlocks;
import mods.officialy.chromatica.init.ChromaParticleTypes;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import org.jetbrains.annotations.Nullable;

@Mod.EventBusSubscriber(modid = Chromatica.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockChromaticalLeaves extends LeavesBlock {

    private CrystalColours colour;

    public BlockChromaticalLeaves(CrystalColours colour) {
        super(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
        this.colour = colour;
    }

    public CrystalColours getColour() {
        return colour;
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource rand) {
        super.animateTick(state, level, pos, rand);
        if (rand.nextInt(15) == 1) {
            BlockPos blockpos = pos.below();
            BlockState blockstate = level.getBlockState(blockpos);
            if (!blockstate.canOcclude() || !blockstate.isFaceSturdy(level, blockpos, Direction.UP)) {

                level.addParticle(ChromaParticleTypes.CHROMATICAL_LEAVES.get(), (double) pos.getX() + rand.nextDouble(), (double) pos.getY() - 0.5D, (double) pos.getZ() + rand.nextDouble(), 0.0d, 0.0D, 0.0D);
            }
        }
    }

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.BLACK.getColor(), ChromaBlocks.BLACK_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.BLUE.getColor(), ChromaBlocks.BLUE_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.BROWN.getColor(), ChromaBlocks.BROWN_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.CYAN.getColor(), ChromaBlocks.CYAN_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.GRAY.getColor(), ChromaBlocks.GRAY_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.GREEN.getColor(), ChromaBlocks.GREEN_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.LIGHT_BLUE.getColor(), ChromaBlocks.LIGHT_BLUE_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.LIGHT_GRAY.getColor(), ChromaBlocks.LIGHT_GRAY_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.LIME.getColor(), ChromaBlocks.LIME_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.MAGENTA.getColor(), ChromaBlocks.MAGENTA_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.ORANGE.getColor(), ChromaBlocks.ORANGE_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.PINK.getColor(), ChromaBlocks.PINK_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.PURPLE.getColor(), ChromaBlocks.PURPLE_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.RED.getColor(), ChromaBlocks.RED_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.WHITE.getColor(), ChromaBlocks.WHITE_CHROMATICAL_LEAVES.get());
        event.register((p_276237_, p_276238_, p_276239_, p_276240_) -> CrystalColours.YELLOW.getColor(), ChromaBlocks.YELLOW_CHROMATICAL_LEAVES.get());
    }

}