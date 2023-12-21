package mods.officialy.chromatica.datagen;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ChromaBiomeTagsProvider extends BiomeTagsProvider {
    public ChromaBiomeTagsProvider(final PackOutput packOutput, final CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable final ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, Chromatica.MOD_ID, existingFileHelper);
    }
}
