package io.github.mecorp.mineralessentials.copper.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CopperBlocks
{
	
		public static Block CopperBlock;

		public static void RegisterCopperBlocks()
		{
			CopperBlock = new BlockCopperBlock().setBlockName("CopperBlock");
			RegisterHelper.registerBlock(CopperBlock);
			OreDictionary.registerOre("blockCopper", new ItemStack(CopperBlock));
		}
}
