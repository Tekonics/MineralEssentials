package io.github.mecorp.mineralessentials.crystal.earthcrystal;

import io.github.mecorp.mineralessentials.crystal.earthcrystal.armor.EarthCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.earthcrystal.items.EarthCrystalItems;
import io.github.mecorp.mineralessentials.crystal.earthcrystal.tools.EarthCrystalTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class EarthCrystalRecipes
{
	public static void RegisterEarthCrystalRecipes(){

       	GameRegistry.addRecipe(new ItemStack(EarthCrystalItems.EarthCrystalCrystal), " X ",
				"XCX",
				" X ",
				'X', Blocks.dirt, 'C', CrystalItems.CrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalPickaxe), "XXX",
				" C ",
				" C ",
				'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalAxe), "XX ",
				"XC ",
				" C ",
				'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalHoe), "XX ",
				" C ",
				" C ",
				'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalShovel), " X ",
				" C ",
				" C ",
				'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(EarthCrystalTools.EarthCrystalSword), " X ",
				" X ",
				" C ",
				'X', EarthCrystalItems.EarthCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(EarthCrystalArmor.EarthCrystalHelmet), "XXX",
				"X X",
				"   ",
				'X', EarthCrystalItems.EarthCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(EarthCrystalArmor.EarthCrystalChestplate), "X X",
				"XXX",
				"XXX",
				'X', EarthCrystalItems.EarthCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(EarthCrystalArmor.EarthCrystalPants), "XXX",
				"X X",
				"X X",
				'X', EarthCrystalItems.EarthCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(EarthCrystalArmor.EarthCrystalBoots), "   ",
				"X X",
				"X X",
				'X', EarthCrystalItems.EarthCrystalCrystal);
	}
}
