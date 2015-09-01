package io.github.mecorp.mineralessentials.iridium.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class IridiumBlocks
{
	public static Block IridiumBlock;

	public static void RegisterIridiumBlocks()
	{
		IridiumBlock = new BlockIridiumBlock().setBlockName("IridiumBlock");
		RegisterHelper.registerBlock(IridiumBlock);
		OreDictionary.registerOre("blockIridium", new ItemStack(IridiumBlock));
	}
}