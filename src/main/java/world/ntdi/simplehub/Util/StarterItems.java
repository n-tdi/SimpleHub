package world.ntdi.simplehub.Util;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import redempt.redlib.itemutils.ItemBuilder;
import redempt.redlib.itemutils.ItemUtils;

public class StarterItems {
    public static void setHotbar(Player p) {
        ItemStack[] items = new ItemStack[9];
        items[0] = new ItemBuilder(Material.COMPASS).setName(TranslateColorCodes.translateColor("&8» &9&lNavigator"));
        items[1] = new ItemBuilder(Material.FIREWORK_STAR).setName(TranslateColorCodes.translateColor("temp"));
        items[2] = new ItemBuilder(Material.AIR);
        items[3] = new ItemBuilder(Material.AIR);
        items[4] = new ItemBuilder(Material.CHEST).setName(TranslateColorCodes.translateColor("temp"));
        items[5] = new ItemBuilder(Material.AIR);
        items[6] = new ItemBuilder(Material.AIR);
        items[7] = new ItemBuilder(Material.NETHER_STAR).setName(TranslateColorCodes.translateColor("temp"));
        items[8] = new ItemBuilder(ItemUtils.skull(p)).setName(TranslateColorCodes.translateColor("&8» &9&l" + p.getName()));

        for (int i = 0; i < items.length; i++) {
            p.getInventory().setItem(i, items[i]);
        }
    }
}
