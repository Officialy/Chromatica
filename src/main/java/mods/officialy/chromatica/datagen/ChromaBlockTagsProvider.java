package mods.officialy.chromatica.datagen;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
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

    }
}
