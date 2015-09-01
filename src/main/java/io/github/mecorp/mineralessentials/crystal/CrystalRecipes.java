package io.github.mecorp.mineralessentials.crystal;

import io.github.mecorp.mineralessentials.crystal.armor.CrystalArmor;
import io.github.mecorp.mineralessentials.crystal.items.CrystalItems;
import io.github.mecorp.mineralessentials.crystal.tools.CrystalTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CrystalRecipes 
{
		public static void RegisterCrystalRecipes(){
	       	GameRegistry.addRecipe(new ItemStack(CrystalItems.CrystalCrystal), "XCX",
					"CXC",
					"XCX",
					'X', Items.diamond, 'C', Items.gold_nugget);
	   	    
	       	GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalPickaxe), "XXX",
					" C ",
					" C ",
					'X', CrystalItems.CrystalCrystal, 'C', Items.stick);
	   	  
	        GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalAxe), "XX ",
					"XC ",
					" C ",
					'X', CrystalItems.CrystalCrystal, 'C', Items.stick);
	        	
	       	GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalHoe), "XX ",
					" C ",
					" C ",
					'X', CrystalItems.CrystalCrystal, 'C', Items.stick);
	       	
	   	    GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalShovel), " X ",
					" C ",
					" C ",
					'X', CrystalItems.CrystalCrystal, 'C', Items.stick);
	   	    
	       	GameRegistry.addRecipe(new ItemStack(CrystalTools.CrystalSword), " X ",
					" X ",
					" C ",
					'X', CrystalItems.CrystalCrystal, 'C', Items.stick);
	       
	       	GameRegistry.addRecipe(new ItemStack(CrystalArmor.CrystalHelmet), "XXX",
					"X X",
					"   ",
					'X', CrystalItems.CrystalCrystal);
	       	
	       	GameRegistry.addRecipe(new ItemStack(CrystalArmor.CrystalChestplate), "X X",
					"XXX",
					"XXX",
					'X', CrystalItems.CrystalCrystal);
	       	
	       	GameRegistry.addRecipe(new ItemStack(CrystalArmor.CrystalPants), "XXX",
					"X X",
					"X X",
					'X', CrystalItems.CrystalCrystal);
	       	
	       	GameRegistry.addRecipe(new ItemStack(CrystalArmor.CrystalBoots), "   ",
					"X X",
					"X X",
					'X', CrystalItems.CrystalCrystal);
	       	
		}
}
