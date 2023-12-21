package mods.officialy.chromatica.api;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

public interface IAbility {

    // Get the mod-specific unique ID for this ability
    ResourceLocation getAbilityId();

    // Get the texture/icon for the ability
    ResourceLocation getAbilityIcon(boolean greyscale);

    // Get the maximum power for this ability
    float getMaxPower();

    // Execute the ability action
    boolean execute(Player player, float powerLevel);

    // Apply the ability's effects to the player
    void apply(Player player);

    // Get the description component for the ability
    Component getDescription();

    // Get the name component for the ability
    Component getName();

    // Check if the ability is only visible on the client
    boolean isClientOnly();

    // Check if the ability costs power every tick
    boolean costsEveryTick();

}
