package io.github.mecorp.mineralessentials.fakediamond.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class FakeDiamondItems
{
public static Item FakeDiamond;
	
	public static void RegisterFakeDiamondItems()
	{
        FakeDiamond = new ItemFakeDiamond();
    	RegisterHelper.registerItem(FakeDiamond);
		OreDictionary.registerOre("gemFakeDiamond", new ItemStack(FakeDiamond));
	}
}
