package com.exoterminator;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * diff_tweaks java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("diff_tweaks");

  public void onEnable()
  {
    LOGGER.info("diff_tweaks enabled");
  }

  public void onDisable()
  {
    LOGGER.info("diff_tweaks disabled");
  }
}
