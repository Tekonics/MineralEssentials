package io.github.mecorp.mineralessentials.cobalt.ore;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CobaltOres {
	public static Block CobaltOre;
	public static void RegisterCobaltOres()
	{
		CobaltOre = new BlockCobaltOre().setBlockName("CobaltOre");
		RegisterHelper.registerBlock(CobaltOre);
        OreDictionary.registerOre("oreCobalt", new ItemStack(CobaltOre));
	}
}
	
