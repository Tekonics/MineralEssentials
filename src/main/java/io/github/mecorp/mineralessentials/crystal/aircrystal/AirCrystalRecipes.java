package io.github.mecorp.mineralessentials.crystal.aircrystal;

import io.github.mecorp.mineralessentials.crystal.aircrystal.armor.AirCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.aircrystal.items.AirCrystalItems;
import io.github.mecorp.mineralessentials.crystal.aircrystal.tools.AirCrystalTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class AirCrystalRecipes
{
	public static void RegisterAirCrystalRecipes(){
       	GameRegistry.addRecipe(new ItemStack(AirCrystalItems.AirCrystalCrystal), "XXX",
				"XCX",
				"XXX",
				'X', Items.feather, 'C', CrystalItems.CrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalPickaxe), "XXX",
				" C ",
				" C ",
				'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalAxe), "XX ",
				"XC ",
				" C ",
				'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalHoe), "XX ",
				" C ",
				" C ",
				'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalShovel), " X ",
				" C ",
				" C ",
				'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(AirCrystalTools.AirCrystalSword), " X ",
				" X ",
				" C ",
				'X', AirCrystalItems.AirCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(AirCrystalArmor.AirCrystalHelmet), "XXX",
				"X X",
				"   ",
				'X', AirCrystalItems.AirCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(AirCrystalArmor.AirCrystalChestplate), "X X",
				"XXX",
				"XXX",
				'X', AirCrystalItems.AirCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(AirCrystalArmor.AirCrystalPants), "XXX",
				"X X",
				"X X",
				'X', AirCrystalItems.AirCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(AirCrystalArmor.AirCrystalBoots), "   ",
				"X X",
				"X X",
				'X', AirCrystalItems.AirCrystalCrystal);
	}
}
