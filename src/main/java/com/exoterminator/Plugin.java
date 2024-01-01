package com.exoterminator;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * diff_tweaks java plugin
 */
public class Plugin extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("difficultytweaks");

  public void onEnable()
  {
    LOGGER.info("difficultytweaks enabled");
  }

  public void onDisable()
  {
    LOGGER.info("difficultytweaks disabled");
  }
}
