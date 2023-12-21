package mods.officialy.chromatica.datagen;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ChromaItemModelProvider extends ItemModelProvider {
    public ChromaItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Chromatica.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

    }

    /**
     * The name of this provider, for logging / debugging.
     */
    @Override
    public String getName() {
        return "ChromaItemModelProvider";
    }
}