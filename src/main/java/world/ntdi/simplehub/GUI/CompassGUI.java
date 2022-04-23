package world.ntdi.simplehub.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import redempt.redlib.inventorygui.InventoryGUI;
import redempt.redlib.inventorygui.ItemButton;
import redempt.redlib.itemutils.ItemBuilder;
import world.ntdi.simplehub.Util.Enchant;
import world.ntdi.simplehub.Util.TranslateColorCodes;

public class CompassGUI {
    private InventoryGUI gui;

    public CompassGUI(Player p) {
        gui = new InventoryGUI(Bukkit.createInventory(null, 6*9, TranslateColorCodes.translateColor("&8» &9&lNavigator&8:")));
        makeItems();
        gui.open(p);
    }

    public void makeItems() {
        gui.fill(0, 6*9, new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).setName(""));

        // 22
        ItemStack pickaxe = new ItemBuilder(Material.NETHERITE_PICKAXE)
                .addItemFlags(ItemFlag.HIDE_ENCHANTS)
                .addEnchant(Enchantment.LURE, 1)
                .setName(TranslateColorCodes.translateColor("&8» &9&lCitybuild"));
        // 29
        ItemStack crossbow = new ItemBuilder(Material.CROSSBOW)
                .addItemFlags(ItemFlag.HIDE_ENCHANTS)
                .addEnchant(Enchantment.LURE, 1)
                .setName(TranslateColorCodes.translateColor("&8» &9&lSuro&8-&9&lTraining"));
        // 33
        ItemStack concrete = new ItemBuilder(Material.BLUE_CONCRETE)
                .addItemFlags(ItemFlag.HIDE_ENCHANTS)
                .addEnchant(Enchantment.LURE, 1)
                .setName(TranslateColorCodes.translateColor("&8» &9&lPartygames"));


        ItemButton pickaxeButton = ItemButton.create(pickaxe, e -> {
            e.getWhoClicked().closeInventory();
            //TODO: add features
        });
        gui.addButton(22, pickaxeButton);

        ItemButton crossbowButton = ItemButton.create(crossbow, e -> {
            e.getWhoClicked().closeInventory();
            //TODO: add features
        });
        gui.addButton(29, crossbowButton);

        ItemButton concreteButton = ItemButton.create(concrete, e -> {
            e.getWhoClicked().closeInventory();
            //TODO: add features
        });
        gui.addButton(33, concreteButton);



        gui.update();
    }
}
