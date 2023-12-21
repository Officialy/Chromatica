package mods.officialy.chromatica.datagen;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ChromaBlockStateProvider extends BlockStateProvider {

    public ChromaBlockStateProvider(final PackOutput packOutput, final ExistingFileHelper existingFileHelper) {
        super(packOutput, Chromatica.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
