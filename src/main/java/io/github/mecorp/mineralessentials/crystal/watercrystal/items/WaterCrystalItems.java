package io.github.mecorp.mineralessentials.crystal.watercrystal.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class WaterCrystalItems
{
	public static Item WaterCrystalCrystal;
	
	public static void RegisterWaterCrystalItems()
	{
        WaterCrystalCrystal = new ItemWaterCrystalCrystal();
    	RegisterHelper.registerItem(WaterCrystalCrystal);
        OreDictionary.registerOre("gemWaterCrystal", new ItemStack(WaterCrystalCrystal));

	}
}
