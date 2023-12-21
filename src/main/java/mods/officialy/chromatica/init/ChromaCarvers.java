package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.common.level.gen.carver.ChromaCaveWorldCarver;
import mods.officialy.chromatica.common.level.gen.carver.config.ChromaCaveCarverConfiguration;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.carver.WorldCarver;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ChromaCarvers {

    public static final DeferredRegister<WorldCarver<?>> CARVERS = DeferredRegister.create(Registries.CARVER, Chromatica.MOD_ID);

    public static final DeferredHolder<WorldCarver<?>, ChromaCaveWorldCarver> CHROMA_CAVE = CARVERS.register("chroma_cave", () -> new ChromaCaveWorldCarver(ChromaCaveCarverConfiguration.CODEC));

}
