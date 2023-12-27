package mods.officialy.chromatica.common.blockentity;

import mods.officialy.chromatica.init.ChromaBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.capabilities.Capability;
import net.neoforged.neoforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BlockEntityPylon extends BlockEntity {
    public BlockEntityPylon(BlockPos p_155229_, BlockState p_155230_) {
        super(ChromaBlockEntities.PYLON.get(), p_155229_, p_155230_);
    }

    public void tick(Level level, BlockPos pos) {

    }

    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
    }

    @Override
    public void reviveCaps() {
        super.reviveCaps();
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        return super.getCapability(cap, side);
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        super.deserializeNBT(nbt);
    }

    @Override
    public CompoundTag serializeNBT() {
        return super.serializeNBT();
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        super.onDataPacket(net, pkt);
    }

    @Override
    public void handleUpdateTag(CompoundTag tag) {
        super.handleUpdateTag(tag);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return super.getUpdatePacket();
    }

    @Override
    public CompoundTag getUpdateTag() {
        return super.getUpdateTag();
    }
}