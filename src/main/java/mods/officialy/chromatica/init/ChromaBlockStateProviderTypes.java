package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.util.random.RandomSingleStateProvider;
import mods.officialy.chromatica.util.random.RandomTagSingleStateProvider;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ChromaBlockStateProviderTypes<P extends BlockStateProvider> {

    public static final DeferredRegister<BlockStateProviderType<?>> BLOCK_STATE_PROVIDER_TYPES = DeferredRegister.create(Registries.BLOCK_STATE_PROVIDER_TYPE, Chromatica.MOD_ID);

    public static final DeferredHolder<BlockStateProviderType<?>, BlockStateProviderType<RandomSingleStateProvider>> RANDOM_SINGLE_STATE_PROVIDER =
            BLOCK_STATE_PROVIDER_TYPES.register("random_single_state_provider", () -> new BlockStateProviderType<>(RandomSingleStateProvider.CODEC));
    public static final DeferredHolder<BlockStateProviderType<?>, BlockStateProviderType<RandomTagSingleStateProvider>> RANDOM_TAG_SINGLE_STATE_PROVIDER =
            BLOCK_STATE_PROVIDER_TYPES.register("random_tag_single_state_provider", () -> new BlockStateProviderType<>(RandomTagSingleStateProvider.CODEC));

}