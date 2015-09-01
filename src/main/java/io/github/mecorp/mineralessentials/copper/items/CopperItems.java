package io.github.mecorp.mineralessentials.copper.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CopperItems
{
public static Item CopperIngot;
	
	public static void RegisterCopperItems()
	{
		CopperIngot = new ItemCopperIngot();
    	RegisterHelper.registerItem(CopperIngot);
        OreDictionary.registerOre("ingotCopper", new ItemStack(CopperIngot));
	}
}
