package io.github.mecorp.mineralessentials.cobalt.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CobaltBlocks
{
	public static Block CobaltBlock;

	public static void RegisterCobaltBlocks()
	{
		CobaltBlock = new BlockCobaltBlock().setBlockName("CobaltBlock");
		RegisterHelper.registerBlock(CobaltBlock);
		OreDictionary.registerOre("blockCobalt", new ItemStack(CobaltBlock));
	}
}