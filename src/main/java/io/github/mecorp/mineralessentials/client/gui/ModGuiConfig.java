package io.github.mecorp.mineralessentials.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import io.github.mecorp.mineralessentials.handler.ConfigHandler;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by Sam on 8/25/2014.
 */
public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
		//noinspection unchecked
		super(guiScreen,
                new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
    }
}