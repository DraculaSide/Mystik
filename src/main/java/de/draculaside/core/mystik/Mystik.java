package de.draculaside.core.mystik;


import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mystik extends JavaPlugin {
    String prefix = "§5Mystik §7>>";

    @Override
    public void onEnable() {
        System.out.println(prefix + "Plugin geladen");
        // Plugin startup logic
      loadEvent();
    }

    @Override
    public void onDisable() {
        System.out.println(prefix + "Plugin entgeladen");
        // Plugin shutdown logic
    }
    public void loadEvent(){
        PluginManager pm  = Bukkit.getPluginManager();
        pm.registerEvents(new JoinListener(),this);


    }
}
