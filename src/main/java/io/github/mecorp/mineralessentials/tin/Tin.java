package io.github.mecorp.mineralessentials.tin;

import io.github.mecorp.mineralessentials.tin.armor.TinArmor;
import io.github.mecorp.mineralessentials.tin.blocks.TinBlocks;
import io.github.mecorp.mineralessentials.tin.items.TinItems;
import io.github.mecorp.mineralessentials.tin.ore.TinOre;
import io.github.mecorp.mineralessentials.tin.tools.TinTools;

public class Tin
{
	public static void RegisterTin(){
		TinItems.RegisterTinItems();
		TinTools.RegisterTinTools();
		TinBlocks.RegisterTinBlocks();
		TinOre.RegisterTinOres();
		TinArmor.RegisterTinArmor();
		TinRecipes.RegisterTinRecipes();
		
	}
}
