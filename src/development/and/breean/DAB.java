package development.and.breean;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Rocker545 on 9/9/2016.
 */
public class DAB extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        System.out.println("hi how are you");
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable()
    {
        System.out.println("[DAB] Leaving so soon!?!?");
    }

}
