package io.github.mecorp.mineralessentials.tin.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class TinItems
{
public static Item TinIngot;
	
	public static void RegisterTinItems()
	{
		TinIngot = new ItemTinIngot();
    	RegisterHelper.registerItem(TinIngot);
        OreDictionary.registerOre("ingotTin", new ItemStack(TinIngot));
	}
}
