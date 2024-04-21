package mods.officialy.chromatica.datagen.loot;


import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.init.ChromaBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ChromaBlockLootProvider extends BlockLootSubProvider {


    //Blacklist for blocks that have special drops / other than itself, ie ores that drop different items
    private static final List<Block> BLACKLIST = List.of(

    );

    public ChromaBlockLootProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
       /* ChromaBlocks.REGISTRATE.getAll(Registries.BLOCK).stream().map(RegistryEntry::get).filter(block -> !BLACKLIST.contains(block)).toList().forEach(block -> {
            Chromatica.LOGGER.info("Generating loot table for " + block);
            dropSelf(block);
        });*/
        dropSelf(ChromaBlocks.PYLON.get());
        dropSelf(ChromaBlocks.BLACK_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.RED_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.GREEN_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.BROWN_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.BLUE_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.PURPLE_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.CYAN_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.LIGHT_GRAY_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.GRAY_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.PINK_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.LIME_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.YELLOW_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.LIGHT_BLUE_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.MAGENTA_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.ORANGE_CAVE_CRYSTAL.get());
        dropSelf(ChromaBlocks.WHITE_CAVE_CRYSTAL.get());

        dropSelf(ChromaBlocks.BLACK_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.BLUE_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.BROWN_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.CYAN_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.GRAY_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.GREEN_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.LIGHT_BLUE_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.LIGHT_GRAY_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.LIME_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.MAGENTA_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.ORANGE_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.PINK_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.PURPLE_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.RED_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.WHITE_CHROMATICAL_LEAVES.get());
        dropSelf(ChromaBlocks.YELLOW_CHROMATICAL_LEAVES.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return StreamSupport.stream(BuiltInRegistries.BLOCK.spliterator(), false)
                .filter(entry ->
                        Optional.of(BuiltInRegistries.BLOCK.getKey(entry))
                                .filter(key -> key.getNamespace().equals(Chromatica.MOD_ID))
                                .isPresent()
                ).collect(Collectors.toSet());
    }

}