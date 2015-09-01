package io.github.mecorp.mineralessentials.steel.ore;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class SteelOres {
	public static Block SteelOre;
	public static void RegisterSteelOres()
	{
		SteelOre = new BlockSteelOre().setBlockName("SteelOre");
		RegisterHelper.registerBlock(SteelOre);
        OreDictionary.registerOre("oreSteel", new ItemStack(SteelOre));
	}
}
	
