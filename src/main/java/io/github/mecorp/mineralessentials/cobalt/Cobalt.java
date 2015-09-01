package io.github.mecorp.mineralessentials.cobalt;

import io.github.mecorp.mineralessentials.cobalt.armor.CobaltArmor;
import io.github.mecorp.mineralessentials.cobalt.blocks.CobaltBlocks;
import io.github.mecorp.mineralessentials.cobalt.items.CobaltItems;
import io.github.mecorp.mineralessentials.cobalt.ore.CobaltOres;
import io.github.mecorp.mineralessentials.cobalt.tools.CobaltTools;

public class Cobalt
{
	public static void RegisterCobalt(){
		CobaltItems.RegisterCobaltItems();
		CobaltOres.RegisterCobaltOres();
		CobaltTools.RegisterCobaltTools();
		CobaltArmor.RegisterCobaltArmor();
		CobaltBlocks.RegisterCobaltBlocks();
		CobaltRecipes.RegisterCobaltRecipes();
	}
}
