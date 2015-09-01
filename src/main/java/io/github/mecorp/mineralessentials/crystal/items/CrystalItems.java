package io.github.mecorp.mineralessentials.crystal.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class CrystalItems
{
		public static Item CrystalCrystal;
		
		public static void RegisterCrystalItems()
		{
			CrystalCrystal = new ItemCrystalCrystal();
	    	RegisterHelper.registerItem(CrystalCrystal);
            OreDictionary.registerOre("gemCrystal", new ItemStack(CrystalCrystal));
	    	
		}
}