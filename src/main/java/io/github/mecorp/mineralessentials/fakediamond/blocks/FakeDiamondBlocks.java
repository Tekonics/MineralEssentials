package io.github.mecorp.mineralessentials.fakediamond.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class FakeDiamondBlocks
{
	
		public static Block FakeDiamondBlock;

		public static void RegisterFakeDiamondBlocks()
		{
			FakeDiamondBlock = new BlockFakeDiamondBlock().setBlockName("FakeDiamondBlock");
			RegisterHelper.registerBlock(FakeDiamondBlock);
			OreDictionary.registerOre("blockFakeDiamond", new ItemStack(FakeDiamondBlock));
		}
}
