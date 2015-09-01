package io.github.mecorp.mineralessentials.copper;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.mecorp.mineralessentials.copper.armor.CopperArmor;
import io.github.mecorp.mineralessentials.copper.blocks.CopperBlocks;
import io.github.mecorp.mineralessentials.copper.items.CopperItems;
import io.github.mecorp.mineralessentials.copper.ore.CopperOre;
import io.github.mecorp.mineralessentials.copper.tools.CopperTools;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class CopperRecipes
{
	public static void RegisterCopperRecipes(){

   		GameRegistry.addSmelting(CopperOre.CopperOre, new ItemStack(CopperItems.CopperIngot, 1), 10);

   	    GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperTools.CopperPickaxe), "XXX",
				" C ",
				" C ",
				'X', "ingotCopper", 'C', "stickWood"));
   	  
        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperTools.CopperAxe), "XX ",
				"XC ",
				" C ",
				'X', "ingotCopper", 'C', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperTools.CopperHoe), "XX ",
				" C ",
				" C ",
				'X', "ingotCopper", 'C', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperTools.CopperShovel), " X ",
				" C ",
				" C ",
				'X', "ingotCopper", 'C', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperTools.CopperSword), " X ",
				" X ",
				" C ",
				'X', "ingotCopper", 'C', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperBlocks.CopperBlock), "XXX",
				"XXX",
				"XXX",
				'X', "ingotCopper"));
			         	
       	GameRegistry.addShapelessRecipe(new ItemStack(CopperItems.CopperIngot, 9), new ItemStack(CopperBlocks.CopperBlock));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperArmor.CopperHelmet), "XXX",
				"X X",
				"   ",
				'X', "ingotCopper"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperArmor.CopperChestplate), "X X",
				"XXX",
				"XXX",
				'X', "ingotCopper"));
       	
       	GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperArmor.CopperPants), "XXX",
				"X X",
				"X X",
				'X', "ingotCopper"));
       	
       	GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(CopperArmor.CopperBoots), "   ",
				"X X",
				"X X",
				'X', "ingotCopper"));
	}
}
