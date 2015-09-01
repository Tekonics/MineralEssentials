package io.github.mecorp.mineralessentials.copper.ore;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class CopperOre
{
	
		public static Block CopperOre;
		public static void RegisterCopperOres()
		{
			CopperOre = new BlockCopperOre().setBlockName("CopperOre");
			RegisterHelper.registerBlock(CopperOre);
            OreDictionary.registerOre("oreCopper", new ItemStack(CopperOre));
		}
}