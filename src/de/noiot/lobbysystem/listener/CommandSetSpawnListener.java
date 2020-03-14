package de.noiot.lobbysystem.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandSetSpawnListener implements Listener {

    @EventHandler
    public void onChat(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();

        if(e.getMessage().equalsIgnoreCase("/setspawn")) {




        }



    }


}
