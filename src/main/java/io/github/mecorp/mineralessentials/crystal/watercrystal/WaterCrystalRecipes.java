package io.github.mecorp.mineralessentials.crystal.watercrystal;

import io.github.mecorp.mineralessentials.crystal.watercrystal.armor.WaterCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.watercrystal.items.WaterCrystalItems;
import io.github.mecorp.mineralessentials.crystal.watercrystal.tools.WaterCrystalTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class WaterCrystalRecipes
{
	public static void RegisterWaterCrystalRecipes(){

       	GameRegistry.addRecipe(new ItemStack(WaterCrystalItems.WaterCrystalCrystal), " X ",
				"XCX",
				" X ",
				'X', Items.water_bucket, 'C', CrystalItems.CrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(WaterCrystalTools.WaterCrystalPickaxe), "XXX",
				" C ",
				" C ",
				'X', WaterCrystalItems.WaterCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(WaterCrystalTools.WaterCrystalAxe), "XX ",
				"XC ",
				" C ",
				'X', WaterCrystalItems.WaterCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(WaterCrystalTools.WaterCrystalHoe), "XX ",
				" C ",
				" C ",
				'X', WaterCrystalItems.WaterCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(WaterCrystalTools.WaterCrystalShovel), " X ",
				" C ",
				" C ",
				'X', WaterCrystalItems.WaterCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(WaterCrystalTools.WaterCrystalSword), " X ",
				" X ",
				" C ",
				'X', WaterCrystalItems.WaterCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(WaterCrystalArmor.WaterCrystalHelmet), "XXX",
				"X X",
				"   ",
				'X', WaterCrystalItems.WaterCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(WaterCrystalArmor.WaterCrystalChestplate), "X X",
				"XXX",
				"XXX",
				'X', WaterCrystalItems.WaterCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(WaterCrystalArmor.WaterCrystalPants), "XXX",
				"X X",
				"X X",
				'X', WaterCrystalItems.WaterCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(WaterCrystalArmor.WaterCrystalBoots), "   ",
				"X X",
				"X X",
				'X', WaterCrystalItems.WaterCrystalCrystal);
	}
}
