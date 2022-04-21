package world.ntdi.simplehub.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import world.ntdi.simplehub.Util.StarterItems;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        StarterItems.setHotbar(e.getPlayer());
    }
}
