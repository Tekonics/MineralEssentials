package io.github.mecorp.mineralessentials.cobalt.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CobaltItems
{
	public static Item CobaltIngot;
	
	public static void RegisterCobaltItems()
	{
		CobaltIngot = new ItemCobaltIngot();
    	RegisterHelper.registerItem(CobaltIngot);
        OreDictionary.registerOre("ingotCobalt", new ItemStack(CobaltIngot));
	}
}
