package io.github.mecorp.mineralessentials.copper;

import io.github.mecorp.mineralessentials.copper.armor.CopperArmor;
import io.github.mecorp.mineralessentials.copper.blocks.CopperBlocks;
import io.github.mecorp.mineralessentials.copper.items.CopperItems;
import io.github.mecorp.mineralessentials.copper.ore.CopperOre;
import io.github.mecorp.mineralessentials.copper.tools.CopperTools;

public class Copper
{
	public static void RegisterCopper(){
		CopperItems.RegisterCopperItems();
		CopperTools.RegisterCopperTools();
		CopperBlocks.RegisterCopperBlocks();
		CopperOre.RegisterCopperOres();
		CopperArmor.RegisterCopperArmor();
		CopperRecipes.RegisterCopperRecipes();
		
	}
}
