package io.github.mecorp.mineralessentials.iridium;

import io.github.mecorp.mineralessentials.iridium.armor.IridiumArmor;
import io.github.mecorp.mineralessentials.iridium.blocks.IridiumBlocks;
import io.github.mecorp.mineralessentials.iridium.items.IridiumItems;
import io.github.mecorp.mineralessentials.iridium.ore.IridiumOres;
import io.github.mecorp.mineralessentials.iridium.tools.IridiumTools;

public class Iridium
{
	public static void RegisterIridium(){
		IridiumItems.RegisterIridiumItems();
		IridiumOres.RegisterIridiumOres();
		IridiumTools.RegisterIridiumTools();
		IridiumArmor.RegisterIridiumArmor();
		IridiumBlocks.RegisterIridiumBlocks();
		IridiumRecipes.RegisterIridiumRecipes();
	}
}
