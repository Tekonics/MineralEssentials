package io.github.mecorp.mineralessentials.proxy;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.mecorp.mineralessentials.machines.furnaces.TileEntityMultiSmelterBlock;

public class CommonProxy
{
    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileEntityMultiSmelterBlock.class, TileEntityMultiSmelterBlock.publicName);
    }
}
