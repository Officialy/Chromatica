package mods.officialy.chromatica.api.events.pylon;

import mods.officialy.chromatica.common.blockentity.BlockEntityPylon;

public class PylonFullChargeEvent extends PylonEvent {
    protected PylonFullChargeEvent(BlockEntityPylon pylon) {
        super(pylon);
    }
}
