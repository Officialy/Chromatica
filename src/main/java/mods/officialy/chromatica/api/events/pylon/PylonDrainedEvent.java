package mods.officialy.chromatica.api.events.pylon;

import mods.officialy.chromatica.common.blockentity.BlockEntityPylon;

public class PylonDrainedEvent extends PylonEvent {
    protected PylonDrainedEvent(BlockEntityPylon pylon) {
        super(pylon);
    }
}
