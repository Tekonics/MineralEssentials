package io.github.mecorp.mineralessentials.crystal.aircrystal.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class AirCrystalItems
{
	public static Item AirCrystalCrystal;
	
	public static void RegisterAirCrystalItems()
	{
		AirCrystalCrystal = new ItemAirCrystalCrystal();
    	RegisterHelper.registerItem(AirCrystalCrystal);
        OreDictionary.registerOre("gemAirCrystal", new ItemStack(AirCrystalCrystal));
	}
}
