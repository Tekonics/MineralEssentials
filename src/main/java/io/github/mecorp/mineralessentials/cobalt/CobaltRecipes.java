package io.github.mecorp.mineralessentials.cobalt;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import io.github.mecorp.mineralessentials.cobalt.armor.CobaltArmor;
import io.github.mecorp.mineralessentials.cobalt.blocks.CobaltBlocks;
import io.github.mecorp.mineralessentials.cobalt.items.CobaltItems;
import io.github.mecorp.mineralessentials.cobalt.ore.CobaltOres;
import io.github.mecorp.mineralessentials.cobalt.tools.CobaltTools;
import cpw.mods.fml.common.registry.GameRegistry;

public class CobaltRecipes
{
	public static void RegisterCobaltRecipes(){

   		GameRegistry.addSmelting(CobaltOres.CobaltOre, new ItemStack(CobaltItems.CobaltIngot, 1), 10);

   	    GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltPickaxe), "XXX",
				" C ",
				" C ",
				'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod);
   	  
        GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltAxe), "XX ",
				"XC ",
				" C ",
				'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod);
        	
       	GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltHoe), "XX ",
				" C ",
				" C ",
				'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod);
       	
   	    GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltShovel), " X ",
				" C ",
				" C ",
				'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod);
   	    
       	GameRegistry.addRecipe(new ItemStack(CobaltTools.CobaltSword), " X ",
				" X ",
				" C ",
				'X', CobaltItems.CobaltIngot, 'C', Items.blaze_rod);
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltBlocks.CobaltBlock), "XXX",
				"XXX",
				"XXX",
				'X', CobaltItems.CobaltIngot);
			         	
       	GameRegistry.addShapelessRecipe(new ItemStack(CobaltItems.CobaltIngot, 9), new ItemStack(CobaltBlocks.CobaltBlock));
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltArmor.CobaltHelmet), "XXX",
				"X X",
				"   ",
				'X', CobaltItems.CobaltIngot);
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltArmor.CobaltChestplate), "X X",
				"XXX",
				"XXX",
				'X', CobaltItems.CobaltIngot);
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltArmor.CobaltPants), "XXX",
				"X X",
				"X X",
				'X', CobaltItems.CobaltIngot);
       	
       	GameRegistry.addRecipe(new ItemStack(CobaltArmor.CobaltBoots), "   ",
				"X X",
				"X X",
				'X', CobaltItems.CobaltIngot);
	}
}
