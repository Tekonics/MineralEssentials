package io.github.mecorp.mineralessentials.fakediamond.ore;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class FakeDiamondOre
{
	
		public static Block FakeDiamondOre;
		public static void RegisterFakeDiamondOres()
		{
            FakeDiamondOre = new BlockFakeDiamondOre().setBlockName("FakeDiamondOre");
			RegisterHelper.registerBlock(FakeDiamondOre);
			OreDictionary.registerOre("oreFakeDiamond", new ItemStack(FakeDiamondOre));
		}

}