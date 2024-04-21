package mods.officialy.chromatica.util.random;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.init.ChromaBlockStateProviderTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;

public class RandomTagSingleStateProvider extends RandomSingleStateProvider {

    public static final Codec<RandomTagSingleStateProvider> CODEC = RecordCodecBuilder.create(p_161576_ -> p_161576_
            .group(Codec.list(BlockState.CODEC).fieldOf(("states")).forGetter(p_161592_ -> p_161592_.states),
                    TagKey.codec(Registries.BLOCK).fieldOf("tag").forGetter(randomTagSingleStateProvider -> randomTagSingleStateProvider.tag))
            .apply(p_161576_, RandomTagSingleStateProvider::new)
    );

    protected TagKey<Block> tag;

    public static DataResult<RandomSingleStateProvider> create(List<BlockState> p_161598_, TagKey<Block> tag) {
        return p_161598_.isEmpty() ? DataResult.error(() -> "RandomTagSingleStateProvider with no states or tag") : DataResult.success(new RandomTagSingleStateProvider(p_161598_, tag));
    }

    public RandomTagSingleStateProvider(List<BlockState> states, TagKey<Block> tag) {
        super(states);
        this.tag = tag;
    }

    @Override
    public @NotNull BlockState getState(RandomSource random, BlockPos p_225967_) {
//        Chromatica.LOGGER.info("Current tag is: " + tag.location());

        // Get the list of blocks from the tag
        Optional<List<Block>> blockListOptional = BuiltInRegistries.BLOCK.getTag(tag).map(t -> t.stream().map(Holder::value).toList());

        // If the tag is not present in the registry, return air
        if (blockListOptional.isEmpty()) {
            return Blocks.AIR.defaultBlockState();
        }

        List<Block> blockList = blockListOptional.get();

        // Select a random block from the list
        Block randomBlock = blockList.get(random.nextInt(blockList.size()));

        // Return the default state of the selected block
        return randomBlock.defaultBlockState();
    }

    @Override
    protected BlockStateProviderType<?> type() {
        return ChromaBlockStateProviderTypes.RANDOM_TAG_SINGLE_STATE_PROVIDER.get();
    }
}