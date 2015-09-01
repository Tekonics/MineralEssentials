package io.github.mecorp.mineralessentials.tin.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class TinBlocks
{
	
		public static Block TinBlock;

		public static void RegisterTinBlocks()
		{
			TinBlock = new BlockTinBlock().setBlockName("TinBlock");
			RegisterHelper.registerBlock(TinBlock);
			OreDictionary.registerOre("blockTin", new ItemStack(TinBlock));
		}
}
