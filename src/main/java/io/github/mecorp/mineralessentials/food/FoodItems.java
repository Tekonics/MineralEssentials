package io.github.mecorp.mineralessentials.food;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class FoodItems
{
		public static Item WheatFlour;
		
		public static void RegisterFoodItems()
		{
            WheatFlour = new ItemWheatFlour();
	    	RegisterHelper.registerItem(WheatFlour);
            OreDictionary.registerOre("dustFlour", new ItemStack(WheatFlour));
		}
}