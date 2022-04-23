package world.ntdi.simplehub;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import redempt.redlib.commandmanager.ArgType;
import redempt.redlib.commandmanager.CommandParser;
import redempt.redlib.enchants.EnchantRegistry;
import world.ntdi.simplehub.Commands.setHotBarCMD;
import world.ntdi.simplehub.Listener.*;


public final class SimpleHub extends JavaPlugin {

    public static SimpleHub instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        registeRedLib();
        registerEvents();


        Bukkit.getLogger().info("SimpleHub enabled!");
    }

    public void registeRedLib(){
        //ArgType<World> worldType = new ArgType<>("world", Bukkit::getWorld).tabStream(c -> Bukkit.getWorlds().stream().map(World::getName));

        new EnchantRegistry(this).registerAll(this);
        new CommandParser(this.getResource("command.rdcml")).parse().register("tazpvp", this,
                new setHotBarCMD()
        );

    }

    public void registerEvents(){
        regList(new JoinListener());
        regList(new InventoryListener());
        regList(new InteractListener());
        regList(new TimeListener());
        regList(new DamageListener());
        regList(new BlockListener());
    }

    public void regList(Listener listener){
        getServer().getPluginManager().registerEvents(listener, this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Bukkit.getLogger().info("SimpleHub disabled!");
    }

    public static SimpleHub getInstance() {
        return instance;
    }
}
