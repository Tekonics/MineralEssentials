package io.github.mecorp.mineralessentials.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Sam on 8/25/2014.
 */
public class ConfigHandler
{
    public static Configuration configuration;
    public static final String CATEGORY_GENERAL = "General";
    public static final String CATEGORY_RECIPIES = "Recipies";
    public static boolean testValue = false;
    public static boolean ArrowRecipe = false;
    public static boolean LeatherRecipe = false;
    public static boolean NetherStarRecipe = false;
    public static boolean SkullsRecipe = false;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    public static void loadConfiguration()
    {
        testValue = configuration.getBoolean("Useless", CATEGORY_GENERAL, true, "This is useless!");
        ArrowRecipe = configuration.getBoolean("Arrow recipe", CATEGORY_RECIPIES, true, "Enable or Disable the Arrow crafting change");
        LeatherRecipe = configuration.getBoolean("Leather recipe", CATEGORY_RECIPIES, true, "Enable or Disable the Leather smelting change");
        NetherStarRecipe = configuration.getBoolean("Nether Star recipe", CATEGORY_RECIPIES, true, "Enable or Disable the Nether Star crafting change");
        SkullsRecipe = configuration.getBoolean("Skulls recipe", CATEGORY_RECIPIES, true, "Enable or Disable the Skulls crafting change");
        if (configuration.hasChanged())
        {
            configuration.save();
        }

    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}