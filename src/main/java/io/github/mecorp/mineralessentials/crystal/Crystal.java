package io.github.mecorp.mineralessentials.crystal;

import io.github.mecorp.mineralessentials.crystal.aircrystal.AirCrystal;
import io.github.mecorp.mineralessentials.crystal.armor.CrystalArmor;
import io.github.mecorp.mineralessentials.crystal.earthcrystal.EarthCrystal;
import io.github.mecorp.mineralessentials.crystal.firecrystal.FireCrystal;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import io.github.mecorp.mineralessentials.crystal.tools.CrystalTools;
import io.github.mecorp.mineralessentials.crystal.watercrystal.WaterCrystal;

public class Crystal
{
	public static void RegisterCrystal(){
		CrystalItems.RegisterCrystalItems();
		CrystalTools.RegisterCrystalTools();
		CrystalArmor.RegisterCrystalArmor();
		CrystalRecipes.RegisterCrystalRecipes();
		FireCrystal.RegisterFireCrystal();
        WaterCrystal.RegisterWaterCrystal();
        AirCrystal.RegisterAirCrystal();
        EarthCrystal.RegisterEarthCrystal();
	}
}
