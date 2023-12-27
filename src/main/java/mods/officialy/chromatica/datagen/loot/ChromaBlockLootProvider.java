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