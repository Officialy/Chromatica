package mods.officialy.chromatica.init;

import mods.officialy.chromatica.Chromatica;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ChromaTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Chromatica.MOD_ID);
    public static Map<TabTypes, List<Supplier<? extends ItemLike>>> TAB_ITEM_MAP = new HashMap<>();

    public static final DeferredHolder<CreativeModeTab, ? extends CreativeModeTab> CHROMATICA = CREATIVE_MODE_TABS.register("chromatica", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.chromatica"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(Items.STICK::getDefaultInstance)
            .displayItems((parameters, output) -> TAB_ITEM_MAP.forEach((tab, items) -> {
                if (tab == TabTypes.CHROMATICA) {
                    items.forEach(item -> output.accept(item.get()));
                }
            })).build());

    public static final Supplier<CreativeModeTab> CHROMATICA_TOOLS = CREATIVE_MODE_TABS.register("chromatica_tools", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.chromatica_tools"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(Items.STICK::getDefaultInstance)
            .displayItems((parameters, output) -> TAB_ITEM_MAP.forEach((tab, items) -> {
                if (tab == TabTypes.TOOLS) {
                    items.forEach(item -> output.accept(item.get()));
                }
            })).build());

    public static <T extends Item> void addItemToTab(Supplier<T> item, TabTypes tab) {
        TAB_ITEM_MAP.computeIfAbsent(tab, t -> new ArrayList<>()).add(item);
    }

    public enum TabTypes {
        CHROMATICA,
        TOOLS
    }

}
