package world.ntdi.simplehub.Listener;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;
import world.ntdi.simplehub.SimpleHub;
import world.ntdi.simplehub.Util.StarterItems;

public class JoinListener implements Listener {
    @SuppressWarnings("deprecation")
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        StarterItems.setHotbar(p);
        e.setJoinMessage(null);

        new BukkitRunnable() {
            @Override
            public void run() {
                p.setGameMode(GameMode.ADVENTURE);
            }
        }.runTaskLater(SimpleHub.getInstance(), 20L);
    }
}
