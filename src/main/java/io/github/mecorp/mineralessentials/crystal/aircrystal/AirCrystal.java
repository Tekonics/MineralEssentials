package io.github.mecorp.mineralessentials.crystal.aircrystal;

import io.github.mecorp.mineralessentials.crystal.aircrystal.armor.AirCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.aircrystal.items.AirCrystalItems;
import io.github.mecorp.mineralessentials.crystal.aircrystal.tools.AirCrystalTools;

public class AirCrystal
{
	public static void RegisterAirCrystal(){
		AirCrystalItems.RegisterAirCrystalItems();
		AirCrystalTools.RegisterAirCrystalTools();
		AirCrystalArmor.RegisterAirCrystalArmor();
		AirCrystalRecipes.RegisterAirCrystalRecipes();
	}
}
