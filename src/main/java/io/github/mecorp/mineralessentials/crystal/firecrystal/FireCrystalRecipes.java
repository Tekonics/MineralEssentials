package io.github.mecorp.mineralessentials.crystal.firecrystal;

import io.github.mecorp.mineralessentials.crystal.firecrystal.armor.FireCrystalArmor;
import io.github.mecorp.mineralessentials.crystal.firecrystal.items.FireCrystalItems;
import io.github.mecorp.mineralessentials.crystal.firecrystal.tools.FireCrystalTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class FireCrystalRecipes
{
	public static void RegisterFireCrystalRecipes(){
       	GameRegistry.addRecipe(new ItemStack(FireCrystalItems.BlazeBlob), "   ",
				" XX",
				" XX",
				'X', Items.blaze_powder);
       	
       	GameRegistry.addRecipe(new ItemStack(FireCrystalItems.FireCrystalCrystal), " X ",
				"XCX",
				" X ",
				'X', FireCrystalItems.BlazeBlob, 'C', CrystalItems.CrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalPickaxe), "XXX",
				" C ",
				" C ",
				'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalAxe), "XX ",
				"XC ",
				" C ",
				'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalHoe), "XX ",
				" C ",
				" C ",
				'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalShovel), " X ",
				" C ",
				" C ",
				'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(FireCrystalTools.FireCrystalSword), " X ",
				" X ",
				" C ",
				'X', FireCrystalItems.FireCrystalCrystal, 'C', Items.stick);

        GameRegistry.addRecipe(new ItemStack(FireCrystalArmor.FireCrystalHelmet), "XXX",
				"X X",
				"   ",
				'X', FireCrystalItems.FireCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(FireCrystalArmor.FireCrystalChestplate), "X X",
				"XXX",
				"XXX",
				'X', FireCrystalItems.FireCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(FireCrystalArmor.FireCrystalPants), "XXX",
				"X X",
				"X X",
				'X', FireCrystalItems.FireCrystalCrystal);

        GameRegistry.addRecipe(new ItemStack(FireCrystalArmor.FireCrystalBoots), "   ",
				"X X",
				"X X",
				'X', FireCrystalItems.FireCrystalCrystal);
	}
}
