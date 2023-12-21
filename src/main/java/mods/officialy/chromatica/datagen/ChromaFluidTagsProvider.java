package mods.officialy.chromatica.datagen;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.FluidTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ChromaFluidTagsProvider extends FluidTagsProvider {
    public ChromaFluidTagsProvider(
            final PackOutput output,
            final CompletableFuture<HolderLookup.Provider> holderLookup,
            @Nullable final ExistingFileHelper existingFileHelper
    ) {
        super(output, holderLookup, Chromatica.MOD_ID, existingFileHelper);
    }
}
