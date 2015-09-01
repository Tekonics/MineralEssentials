package io.github.mecorp.mineralessentials.crystal.earthcrystal;


import io.github.mecorp.mineralessentials.crystal.earthcrystal.armor.EarthCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.earthcrystal.items.EarthCrystalItems;
import io.github.mecorp.mineralessentials.crystal.earthcrystal.tools.EarthCrystalTools;

public class EarthCrystal
{
	public static void RegisterEarthCrystal(){
        EarthCrystalItems.RegisterEarthCrystalItems();
        EarthCrystalTools.RegisterEarthCrystalTools();
        EarthCrystalArmor.RegisterEarthCrystalArmor();
        EarthCrystalRecipes.RegisterEarthCrystalRecipes();
	}
}
