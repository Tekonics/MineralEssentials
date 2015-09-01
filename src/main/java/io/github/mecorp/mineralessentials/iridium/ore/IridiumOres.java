package io.github.mecorp.mineralessentials.iridium.ore;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class IridiumOres {
	public static Block IridiumOre;
	public static void RegisterIridiumOres()
	{
		IridiumOre = new BlockIridiumOre().setBlockName("IridiumOre");
		RegisterHelper.registerBlock(IridiumOre);
        OreDictionary.registerOre("oreIridium", new ItemStack(IridiumOre));
	}
}
	
