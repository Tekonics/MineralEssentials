package io.github.mecorp.mineralessentials.steel.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class SteelBlocks
{
	public static Block SteelBlock;

	public static void RegisterSteelBlocks()
	{
		SteelBlock = new BlockSteelBlock().setBlockName("SteelBlock");
		RegisterHelper.registerBlock(SteelBlock);
		OreDictionary.registerOre("blockSteel", new ItemStack(SteelBlock));
	}
}