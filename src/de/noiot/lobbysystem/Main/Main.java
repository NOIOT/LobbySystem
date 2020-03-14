package de.noiot.lobbysystem.Main;

import de.noiot.lobbysystem.data.Data;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public Main instance = this;

    public Main instance () {
        return instance;
    }


    @Override
    public void onEnable() {

        checkPluginAccess();


        Bukkit.getConsoleSender().sendMessage(Data.prefix + "§aPlugin wird geladen...");

        try {
            onExecute();
        }catch (Exception e) {
            e.printStackTrace();
            Bukkit.getConsoleSender().sendMessage(Data.prefix + "§cDas Plugin hat einen Fehler!");
        }
        Bukkit.getConsoleSender().sendMessage(Data.prefix + "§aDas Plugin wurde erfolgreich gestartet!");


    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(Data.prefix + "§cDas Plugin wird angehalten!");

    }

    public void onExecute() {

        //Commands



        //Listener




    }

    public void checkPluginAccess() {
        if(!Bukkit.getServer().getIp().toString().equals("91.200.100.127")) {
            Bukkit.broadcastMessage(Data.prefix + "§cDas Plugin wurde aufgrund Ausnutzung angehalten!");
            Bukkit.getPluginManager().disablePlugin(instance);
        }
    }
}
