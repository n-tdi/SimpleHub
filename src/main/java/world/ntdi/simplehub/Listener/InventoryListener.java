package world.ntdi.simplehub.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryListener implements Listener {
    @EventHandler
    public void onInventoryEdit(InventoryClickEvent e) {
        e.setCancelled(true);
    }
}
