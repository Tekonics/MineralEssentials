package io.github.mecorp.mineralessentials.client.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/**
 * Created by untamemadman on 06/12/2014.
 */

public class GuiHandeler implements IGuiHandler
{

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == GUIs.MultiSmelter.ordinal()) return new GuiMultiSmelter(player, world, x, y, z);
        else return null;
    }
}
