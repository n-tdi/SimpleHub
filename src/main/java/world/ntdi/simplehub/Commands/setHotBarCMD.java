package world.ntdi.simplehub.Commands;

import org.bukkit.entity.Player;
import redempt.redlib.commandmanager.CommandHook;
import world.ntdi.simplehub.Util.StarterItems;

public class setHotBarCMD {
    @CommandHook("sethotbar")
    public void setHotBar(Player p) {
        StarterItems.setHotbar(p);
    }
}
