package io.github.mecorp.mineralessentials.machines.furnaces;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;

/**
 * Created by untamemadman on 23/11/2014.
 */
public class FurnaceBlocks
{
    public static Block MultiSmelterBlock;

    public static void RegisterFurnaceBlocks()
    {
        MultiSmelterBlock = new BlockMultiSmelter().setBlockName("MultiSmelterBlock");
        RegisterHelper.registerBlock(MultiSmelterBlock);
    }
}
