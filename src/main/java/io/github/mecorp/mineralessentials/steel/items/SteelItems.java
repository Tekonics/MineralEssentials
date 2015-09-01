package io.github.mecorp.mineralessentials.steel.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class SteelItems
{
	public static Item SteelIngot;
	
	public static void RegisterSteelItems()
	{
		SteelIngot = new ItemSteelIngot();
    	RegisterHelper.registerItem(SteelIngot);
        OreDictionary.registerOre("ingotSteel", new ItemStack(SteelIngot));
	}
}
