package io.github.mecorp.mineralessentials.fakediamond;

import io.github.mecorp.mineralessentials.fakediamond.armor.FakeDiamondArmor;
import io.github.mecorp.mineralessentials.fakediamond.blocks.FakeDiamondBlocks;
import io.github.mecorp.mineralessentials.fakediamond.items.FakeDiamondItems;
import io.github.mecorp.mineralessentials.fakediamond.ore.FakeDiamondOre;
import io.github.mecorp.mineralessentials.fakediamond.tools.FakeDiamondTools;

public class FakeDiamond
{
	public static void RegisterDiamond(){
        FakeDiamondItems.RegisterFakeDiamondItems();
        FakeDiamondOre.RegisterFakeDiamondOres();
        //FakeDiamondTools.RegisterFakeDiamondTools();
        //FakeDiamondBlocks.RegisterFakeDiamondBlocks();
        //FakeDiamondArmor.RegisterFakeDiamondArmor();
		
	}
}
