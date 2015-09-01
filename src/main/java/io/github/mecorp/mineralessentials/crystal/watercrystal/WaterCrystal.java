package io.github.mecorp.mineralessentials.crystal.watercrystal;


import io.github.mecorp.mineralessentials.crystal.watercrystal.armor.WaterCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.watercrystal.items.WaterCrystalItems;
import io.github.mecorp.mineralessentials.crystal.watercrystal.tools.WaterCrystalTools;

public class WaterCrystal
{
	public static void RegisterWaterCrystal(){
        WaterCrystalItems.RegisterWaterCrystalItems();
        WaterCrystalTools.RegisterWaterCrystalTools();
        WaterCrystalArmor.RegisterWaterCrystalArmor();
        WaterCrystalRecipes.RegisterWaterCrystalRecipes();
	}
}
