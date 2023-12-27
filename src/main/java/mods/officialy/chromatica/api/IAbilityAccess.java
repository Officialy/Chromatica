package mods.officialy.chromatica.api;

import net.minecraft.world.entity.player.Player;

public interface IAbilityAccess {

    // Adds abilities to the list of abilities that can be activated via the ritual
    void addAbility(IAbility a);

    // Returns true if the player has the ability & it is activated via the ritual
    boolean hasAbility(Player ep, IAbility a);


}