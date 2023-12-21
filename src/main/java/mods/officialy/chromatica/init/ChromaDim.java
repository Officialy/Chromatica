package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class ChromaDim {

    public static final ResourceKey<Level> PROXIMA = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(Chromatica.MOD_ID, "proxima"));

    public static final ResourceKey<DimensionType> PROXIMA_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE, PROXIMA.registry());

    public static void register() {
        
    }
}