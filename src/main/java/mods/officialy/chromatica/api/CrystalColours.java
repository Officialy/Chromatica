package mods.officialy.chromatica.api;

import net.minecraft.ChatFormatting;
import net.minecraft.util.RandomSource;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum CrystalColours {

    //Colour values and names matched with the 1.7.10 Chromaticraft mod by Reika
    BLACK("Kuro", 0x191919, ChatFormatting.BLACK), //Black Magic
    RED("Karmir", 0xFF0000, ChatFormatting.DARK_RED), //Endurance
    GREEN("Kijani", 0x007F0E, ChatFormatting.DARK_GREEN), //Nature (Growth) (Plant) (Also Poison to the player)
    BROWN("Ruskea", 0x724528, ChatFormatting.GOLD), //Earth (Saturation)
    BLUE("Nila", 0x0026FF, ChatFormatting.BLUE), //Light
    PURPLE("Zambarau", 0x8C00EA, ChatFormatting.DARK_PURPLE), //Enhancement
    CYAN("Vadali", 0x009FBF, ChatFormatting.DARK_AQUA), //Water
    LIGHTGRAY("Argia", 0x979797, ChatFormatting.GRAY), //Deception
    GRAY("Ykri", 0x404040, ChatFormatting.DARK_GRAY), //Change
    PINK("Ruzova", 0xFFBAD9, ChatFormatting.RED), //Aggression
    LIME("Asveste", 0x00FF00, ChatFormatting.GREEN), //Motion
    YELLOW("Kitrino", 0xFFFF00, ChatFormatting.YELLOW), //Energy
    LIGHTBLUE("Galazio", 0x7FD4FF, ChatFormatting.AQUA), //Time
    MAGENTA("Kurauri", 0xFF00DC, ChatFormatting.LIGHT_PURPLE), //Life (Healing)
    ORANGE("Portokali", 0xFF6A00, ChatFormatting.GOLD), //Fire
    WHITE("Tahara", 0xFFFFFF, ChatFormatting.WHITE); //Purity
    public final String displayName;
    private final int rgb;
    private final ChatFormatting chatFormatting;
    private static final Random rand = new Random();
    public static final CrystalColours[] elements = values();
    private static final HashMap<String, CrystalColours> nameMap = new HashMap<>();
    private static final HashMap<CrystalColours, Integer> colourMap = new HashMap<>();

    CrystalColours(String n, int rgb, ChatFormatting c) {
        displayName = n;
        this.rgb = 0xff000000 | rgb;
        chatFormatting = c;
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
