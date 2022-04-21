package world.ntdi.simplehub.Util;

import org.bukkit.ChatColor;

public class TranslateColorCodes {
    public static String translateColor(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }
}
