package io.github.mecorp.mineralessentials.iridium.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class IridiumItems
{
	public static Item IridiumIngot;
	
	public static void RegisterIridiumItems()
	{
		IridiumIngot = new ItemIridiumIngot();
    	RegisterHelper.registerItem(IridiumIngot);
        OreDictionary.registerOre("ingotIridium", new ItemStack(IridiumIngot));
	}
}
