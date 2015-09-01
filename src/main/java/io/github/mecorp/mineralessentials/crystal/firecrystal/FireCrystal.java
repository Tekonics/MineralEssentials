package io.github.mecorp.mineralessentials.crystal.firecrystal;

import io.github.mecorp.mineralessentials.crystal.firecrystal.armor.FireCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.firecrystal.items.FireCrystalItems;
import io.github.mecorp.mineralessentials.crystal.firecrystal.tools.FireCrystalTools;

public class FireCrystal
{
	public static void RegisterFireCrystal(){
		FireCrystalItems.RegisterFireCrystalItems();
		FireCrystalTools.RegisterFireCrystalTools();
		FireCrystalArmor.RegisterFireCrystalArmor();
		FireCrystalRecipes.RegisterFireCrystalRecipes();
	}
}
