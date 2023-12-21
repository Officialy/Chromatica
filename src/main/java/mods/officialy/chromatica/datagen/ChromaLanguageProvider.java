package mods.officialy.chromatica.datagen;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ChromaLanguageProvider extends LanguageProvider {
    public ChromaLanguageProvider(PackOutput output) {
        super(output, Chromatica.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {

    }
}
