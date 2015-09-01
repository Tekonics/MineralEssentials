package io.github.mecorp.mineralessentials.crystal.earthcrystal.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class EarthCrystalItems
{
	public static Item EarthCrystalCrystal;
	
	public static void RegisterEarthCrystalItems()
	{
        EarthCrystalCrystal = new ItemEarthCrystalCrystal();
    	RegisterHelper.registerItem(EarthCrystalCrystal);
        OreDictionary.registerOre("gemEarthCrystal", new ItemStack(EarthCrystalCrystal));

	}
}
