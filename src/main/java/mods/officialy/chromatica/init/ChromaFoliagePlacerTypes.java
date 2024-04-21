package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import mods.officialy.chromatica.common.level.gen.placement.RainbowTreeFoliagePlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ChromaFoliagePlacerTypes {

    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACER_TYPES = DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, Chromatica.MOD_ID);


    public static final DeferredHolder<FoliagePlacerType<?>, FoliagePlacerType<RainbowTreeFoliagePlacer>> RAINBOW_TREE_FOLIAGE_PLACER =
            FOLIAGE_PLACER_TYPES.register("rainbow_tree_foliage_placer", () -> new FoliagePlacerType<>(RainbowTreeFoliagePlacer.CODEC));

}
