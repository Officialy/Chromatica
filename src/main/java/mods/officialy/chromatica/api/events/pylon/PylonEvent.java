package mods.officialy.chromatica.api.events.pylon;

import mods.officialy.chromatica.common.blockentity.BlockEntityPylon;
import net.neoforged.bus.api.Event;

public class PylonEvent extends Event {

    public final BlockEntityPylon pylon;

    protected PylonEvent(BlockEntityPylon pylon) {
        this.pylon = pylon;
    }
}
