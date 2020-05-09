package de.draculaside.core.mystik;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class JoinListener implements Listener {
     @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage("§8§5 " + player.getDisplayName());
    }

  /*  public void onQuite(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage("§8[§4-§8]§5" + player.getDisplayName());
    }
 */

    
}
