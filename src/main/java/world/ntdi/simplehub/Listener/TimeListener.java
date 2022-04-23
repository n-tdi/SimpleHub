package world.ntdi.simplehub.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.TimeSkipEvent;

public class TimeListener implements Listener {
    @EventHandler
    public void onTimeChange(TimeSkipEvent e) {
        e.getWorld().setTime(6000);
    }
}
