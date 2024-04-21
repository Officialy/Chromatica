package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ChromaTags {

    public static final TagKey<Block> CHROMA_LEAVES = create("chromatical_leaves");

    public static TagKey<Block> create(String name) {
        return TagKey.create(Registries.BLOCK, Chromatica.rl(name));
    }
}