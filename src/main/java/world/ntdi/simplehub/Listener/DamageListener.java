package world.ntdi.simplehub.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {
    @EventHandler
    public void ondamage(EntityDamageEvent e) {
        e.setCancelled(true);
    }
}
