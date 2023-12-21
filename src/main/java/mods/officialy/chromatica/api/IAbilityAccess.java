package mods.officialy.chromatica.api;

import net.minecraft.world.entity.player.Player;

public interface IAbilityAccess {

    // Adds abilities
    void addAbility(IAbility a);

    // Returns true if the player has the ability & it is activated via the ritual
    boolean playerHasAbility(Player ep, IAbility a);
}