package io.github.mecorp.mineralessentials.tin.ore;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class TinOre
{
	
		public static Block TinOre;

		public static void RegisterTinOres()
		{
			TinOre = new BlockTinOre().setBlockName("TinOre");
			RegisterHelper.registerBlock(TinOre);
            OreDictionary.registerOre("oreTin", new ItemStack(TinOre));
		}
}