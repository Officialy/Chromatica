package mods.officialy.chromatica.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class BlockCaveCrystal extends Block {

    public static final VoxelShape COLLISION_SHAPE = Shapes.box(0.25, 0, 0.25, 0.75, 1, 0.75);
    public static final VoxelShape SHAPE = Stream.of(
            Block.box(4.15, 0, 2, 11, 2, 4),
            Block.box(6, 0, 4.25, 11, 3, 12),
            Block.box(11, 0, 5.5, 12.85, 4.75, 10.5),
            Block.box(4.15, 0, 4, 6, 2, 10.75),
            Block.box(7.00, -8.326672684688674e-17, 12, 9.75, 4, 13.25),
            Block.box(3.15, 0, 8, 4.15, 2.75, 10.75),
            Block.box(3.5, 2, 6, 5.25, 6.5, 8.25),
            Block.box(5.25, 2.5, 8.25, 7.25, 4.5, 12),
            Block.box(6.25, 3, 3.25, 11, 3.75, 6),
            Block.box(4.5, 2, 3.25, 11, 3, 4.25),
            Block.box(4.5, 2, 4.25, 6, 3, 6),
            Block.box(6.5, 2, 2, 8.275, 3, 3.5),
            Block.box(6.975, 5.2, 2.75, 8.75, 8.75, 3.5),
            Block.box(6.25, 3.75, 3.5, 9.25, 8.75, 5.25),
            Block.box(5.25, 4.4750, 5.25, 10.5, 12.5, 9.75),
            Block.box(6, 12.5, 5.75, 10.025, 14.5, 9),
            Block.box(6.975, 14.5, 6.5, 9.25, 15.75, 8.5),
            Block.box(7, 3, 9.75, 10.7, 8.75, 13),
            Block.box(10.475, 4.75, 5.5, 12.75, 8, 8.75)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public BlockCaveCrystal(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState p_60479_, BlockGetter p_60480_, BlockPos p_60481_, CollisionContext p_60482_) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState p_60572_, BlockGetter p_60573_, BlockPos p_60574_, CollisionContext p_60575_) {
        return COLLISION_SHAPE;
    }

}
