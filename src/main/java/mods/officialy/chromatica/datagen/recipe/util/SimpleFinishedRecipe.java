package mods.officialy.chromatica.datagen.recipe.util;

import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import net.minecraft.Util;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;
import org.jetbrains.annotations.Nullable;

/**
 * A {@link FinishedRecipe} that allows the recipe result to have NBT.
 * Delegates all other logic to another {@link FinishedRecipe} instance.
 * <a href="https://github.com/Choonster-Minecraft-Mods/TestMod3/blob/1.20.x/src/main/java/choonster/testmod3/data/crafting/recipe/DelegateFinishedRecipe.java">...</a>
 * @author Choonster
 */
public class SimpleFinishedRecipe extends DelegateFinishedRecipe {
    private final RecipeSerializer<?> serializer;
    @Nullable
    private final CompoundTag resultNBT;

    public SimpleFinishedRecipe(final FinishedRecipe baseRecipe, final ItemStack result, final RecipeSerializer<?> serializer) {
        super(baseRecipe);
        this.serializer = serializer;
        resultNBT = result.getTag();
    }

    @Override
    public void serializeRecipeData(final JsonObject json) {
        super.serializeRecipeData(json);

        if (resultNBT != null) {
            json.getAsJsonObject("result")
                    .add("nbt", Util.getOrThrow(CompoundTag.CODEC.encodeStart(JsonOps.INSTANCE, resultNBT), IllegalStateException::new));
        }
    }

    @Override
    public RecipeSerializer<?> type() {
        return serializer;
    }

}