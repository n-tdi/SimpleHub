package world.ntdi.simplehub.Util;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Enchant {
    public static void addGlow(ItemStack stack) {
        ItemMeta meta = stack.getItemMeta();
        meta.addEnchant( Enchantment.LURE, 1, false );
        meta.addItemFlags( ItemFlag.HIDE_ENCHANTS );
        stack.setItemMeta( meta );
    }
}
