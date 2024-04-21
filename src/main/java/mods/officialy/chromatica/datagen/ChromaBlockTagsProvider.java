package mods.officialy.chromatica.datagen;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.init.ChromaBlocks;
import mods.officialy.chromatica.init.ChromaTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

public class ChromaBlockTagsProvider extends BlockTagsProvider {
    public ChromaBlockTagsProvider(
            final PackOutput output,
            final CompletableFuture<HolderLookup.Provider> lookupProvider,
            final ExistingFileHelper existingFileHelper
    ) {
        super(output, lookupProvider, Chromatica.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(final HolderLookup.Provider lookupProvider) {
        tag(ChromaTags.CHROMA_LEAVES).add(ChromaBlocks.BLACK_CHROMATICAL_LEAVES.get(), ChromaBlocks.RED_CHROMATICAL_LEAVES.get(), ChromaBlocks.GREEN_CHROMATICAL_LEAVES.get(), ChromaBlocks.BROWN_CHROMATICAL_LEAVES.get(), ChromaBlocks.BLUE_CHROMATICAL_LEAVES.get(), ChromaBlocks.PURPLE_CHROMATICAL_LEAVES.get(), ChromaBlocks.CYAN_CHROMATICAL_LEAVES.get(), ChromaBlocks.LIGHT_GRAY_CHROMATICAL_LEAVES.get(), ChromaBlocks.GRAY_CHROMATICAL_LEAVES.get(), ChromaBlocks.PINK_CHROMATICAL_LEAVES.get(), ChromaBlocks.LIME_CHROMATICAL_LEAVES.get(), ChromaBlocks.YELLOW_CHROMATICAL_LEAVES.get(), ChromaBlocks.LIGHT_BLUE_CHROMATICAL_LEAVES.get(), ChromaBlocks.MAGENTA_CHROMATICAL_LEAVES.get(), ChromaBlocks.ORANGE_CHROMATICAL_LEAVES.get(), ChromaBlocks.WHITE_CHROMATICAL_LEAVES.get());
        tag(BlockTags.LEAVES).addTag(ChromaTags.CHROMA_LEAVES);
    }

}