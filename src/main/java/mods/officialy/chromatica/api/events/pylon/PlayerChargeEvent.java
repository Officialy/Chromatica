package mods.officialy.chromatica.api.events.pylon;

import mods.officialy.chromatica.common.blockentity.BlockEntityPylon;
import net.minecraft.world.entity.player.Player;

public class PlayerChargeEvent extends PylonEvent {
    public final Player player;

    protected PlayerChargeEvent(BlockEntityPylon pylon, Player player) {
        super(pylon);
        this.player = player;
    }
}
