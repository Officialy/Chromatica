package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.common.blockentity.BlockEntityPylon;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ChromaBlockEntities {

    //deferred registry
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Chromatica.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BlockEntityPylon>> PYLON = BLOCK_ENTITIES.register("pylon", () -> BlockEntityType.Builder.of(BlockEntityPylon::new, ChromaBlocks.PYLON.get()).build(null));

}
