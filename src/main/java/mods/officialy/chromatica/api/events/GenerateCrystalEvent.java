package mods.officialy.chromatica.api.events;

import mods.officialy.chromatica.api.CrystalColours;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelAccessor;
import net.neoforged.neoforge.event.level.LevelEvent;

public class GenerateCrystalEvent extends LevelEvent {

    /** Crystal color */
    public final CrystalColours color;
    public final BlockPos pos;
    public final RandomSource rand;

    public GenerateCrystalEvent(LevelAccessor level, BlockPos pos, RandomSource rand, CrystalColours colours) {
        super(level);
        this.pos = pos;
        this.rand = rand;
        color = colours;
    }
}