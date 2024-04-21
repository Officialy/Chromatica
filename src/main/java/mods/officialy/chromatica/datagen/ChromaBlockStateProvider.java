package mods.officialy.chromatica.datagen;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.init.ChromaBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ChromaBlockStateProvider extends BlockStateProvider {

    ExistingFileHelper existingFileHelper;

    public ChromaBlockStateProvider(final PackOutput packOutput, final ExistingFileHelper existingFileHelper) {
        super(packOutput, Chromatica.MOD_ID, existingFileHelper);
        this.existingFileHelper = existingFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ChromaBlocks.BLACK_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.BLUE_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.BROWN_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.CYAN_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.GRAY_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.GREEN_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.LIGHT_BLUE_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.LIGHT_GRAY_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.LIME_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.MAGENTA_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.ORANGE_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.PINK_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.PURPLE_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.RED_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.WHITE_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
        simpleBlock(ChromaBlocks.YELLOW_CHROMATICAL_LEAVES.get(), new ModelFile.ExistingModelFile(mcLoc("block/oak_leaves"), existingFileHelper));
    }
}