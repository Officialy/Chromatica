package mods.officialy.chromatica.api;

import net.minecraft.ChatFormatting;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.DyeColor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum CrystalColours {

    //Colour values and names matched with the 1.7.10 Chromaticraft mod by Reika
    BLACK("Kuro", 0x191919, DyeColor.BLACK, ChatFormatting.BLACK), //Black Magic
    RED("Karmir", 0xFF0000, DyeColor.RED, ChatFormatting.DARK_RED), //Endurance
    GREEN("Kijani", 0x007F0E, DyeColor.GREEN, ChatFormatting.DARK_GREEN), //Nature (Growth) (Plant) (Also Poison to the player)
    BROWN("Ruskea", 0x724528, DyeColor.BROWN, ChatFormatting.GOLD), //Earth (Saturation)
    BLUE("Nila", 0x0026FF, DyeColor.BLUE, ChatFormatting.BLUE), //Light
    PURPLE("Zambarau", 0x8C00EA, DyeColor.PURPLE, ChatFormatting.DARK_PURPLE), //Enhancement
    CYAN("Vadali", 0x009FBF, DyeColor.CYAN, ChatFormatting.DARK_AQUA), //Water
    LIGHT_GRAY("Argia", 0x979797, DyeColor.LIGHT_GRAY, ChatFormatting.GRAY), //Deception
    GRAY("Ykri", 0x404040, DyeColor.GRAY, ChatFormatting.DARK_GRAY), //Change
    PINK("Ruzova", 0xFFBAD9, DyeColor.PINK, ChatFormatting.RED), //Aggression
    LIME("Asveste", 0x00FF00, DyeColor.LIME, ChatFormatting.GREEN), //Motion
    YELLOW("Kitrino", 0xFFFF00, DyeColor.YELLOW, ChatFormatting.YELLOW), //Energy
    LIGHT_BLUE("Galazio", 0x7FD4FF, DyeColor.LIGHT_BLUE, ChatFormatting.AQUA), //Time
    MAGENTA("Kurauri", 0xFF00DC, DyeColor.MAGENTA, ChatFormatting.LIGHT_PURPLE), //Life (Healing)
    ORANGE("Portokali", 0xFF6A00, DyeColor.ORANGE, ChatFormatting.GOLD), //Fire
    WHITE("Tahara", 0xFFFFFF, DyeColor.WHITE, ChatFormatting.WHITE); //Purity
    public final String displayName;
    private final int rgb;
    private final ChatFormatting chatFormatting;
    private final DyeColor dye;
    private static final Random rand = new Random();
    public static final CrystalColours[] elements = values();
    private static final HashMap<String, CrystalColours> nameMap = new HashMap<>();
    private static final HashMap<CrystalColours, Integer> colourMap = new HashMap<>();

    CrystalColours(String n, int rgb, DyeColor d, ChatFormatting c) {
        displayName = n;
        this.rgb = 0xff000000 | rgb;
        chatFormatting = c;
        dye = d;
    }

    static {
        for (CrystalColours e : elements) {
            nameMap.put(e.displayName, e);
            colourMap.put(e, e.getColor());
        }
    }

    public static CrystalColours random() {
        return elements[rand.nextInt(elements.length)];
    }
    public static CrystalColours random(RandomSource rand) {
        return elements[rand.nextInt(elements.length)];
    }
    public int getColor() {
        return rgb;
    }
    public String getDisplayName() {
        return displayName;
    }
    public String getEnglishName() {
        return chatFormatting.getName();
    }
    public static CrystalColours getColour(String name) {
        return nameMap.get(name);
    }
    public static Map<CrystalColours, Integer> getColourMap() {
        return Collections.unmodifiableMap(colourMap);
    }
}
