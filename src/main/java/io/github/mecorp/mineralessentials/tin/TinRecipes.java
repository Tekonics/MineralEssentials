package io.github.mecorp.mineralessentials.tin;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.mecorp.mineralessentials.tin.armor.TinArmor;
import io.github.mecorp.mineralessentials.tin.blocks.TinBlocks;
import io.github.mecorp.mineralessentials.tin.items.TinItems;
import io.github.mecorp.mineralessentials.tin.ore.TinOre;
import io.github.mecorp.mineralessentials.tin.tools.TinTools;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class TinRecipes
{
	public static void RegisterTinRecipes(){

   		GameRegistry.addSmelting(TinOre.TinOre, new ItemStack(TinItems.TinIngot, 1), 10);

   	    GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinTools.TinPickaxe), "XXX",
				" C ",
				" C ",
				'X', "ingotTin", 'C', "stickWood"));
   	  
        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinTools.TinAxe), "XX ",
				"XC ",
				" C ",
				'X', "ingotTin", 'C', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinTools.TinHoe), "XX ",
				" C ",
				" C ",
				'X', "ingotTin", 'C', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinTools.TinShovel), " X ",
				" C ",
				" C ",
				'X', "ingotTin", 'C', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinTools.TinSword), " X ",
				" X ",
				" C ",
				'X', "ingotTin", 'C', "stickWood"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinBlocks.TinBlock), "XXX",
				"XXX",
				"XXX",
				'X', "ingotTin"));
			         	
       	GameRegistry.addShapelessRecipe(new ItemStack(TinItems.TinIngot, 9), new ItemStack(TinBlocks.TinBlock));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinArmor.TinHelmet), "XXX",
				"X X",
				"   ",
				'X', "ingotTin"));

        GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinArmor.TinChestplate), "X X",
				"XXX",
				"XXX",
				'X', "ingotTin"));
       	
       	GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinArmor.TinPants), "XXX",
				"X X",
				"X X",
				'X', "ingotTin"));
       	
       	GameRegistry.addRecipe(new ShapedOreRecipe (new ItemStack(TinArmor.TinBoots), "   ",
				"X X",
				"X X",
				'X', "ingotTin"));
	}
}
