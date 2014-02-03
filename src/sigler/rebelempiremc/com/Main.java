package sigler.rebelempiremc.com;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import sigler.rebelempiremc.com.CommandClass;
 
 
@SuppressWarnings("unused")
public class Main extends JavaPlugin{ 
   
    private static JavaPlugin plugin;
	public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new ListenerClass(this), this);
        getCommand("info").setExecutor(new CommandClass());
//        getCommand("serverinfo").setExecutor(new CommandClass());
//        getCommand("si").setExecutor(new CommandClass());
    }
   
    public void onDisable() {
       
    }
   
   
    //Much eaisier then registering events in 10 diffirent methods
    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
}

