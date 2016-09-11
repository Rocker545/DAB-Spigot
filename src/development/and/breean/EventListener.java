package development.and.breean;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

/**
 * Created by Rocker545 on 9/9/2016.
 */
public class EventListener implements Listener
{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event)
    {
        Bukkit.broadcastMessage(event.getPlayer().getDisplayName() + " sooks tyler's dook");
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event)
    {
        String EventUUID = event.getPlayer().getUniqueId().toString();
        String Derek = "35536359-762d-401a-ae4e-b020c0f9756c";
        if(EventUUID.equals(Derek))
        {
            Bukkit.broadcastMessage("hi");
            event.setCancelled(true);
        }
    }
}
