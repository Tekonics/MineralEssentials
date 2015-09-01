package io.github.mecorp.mineralessentials.steel;

import io.github.mecorp.mineralessentials.steel.SteelRecipes;
import io.github.mecorp.mineralessentials.steel.armor.SteelArmor;
import io.github.mecorp.mineralessentials.steel.blocks.SteelBlocks;
import io.github.mecorp.mineralessentials.steel.items.SteelItems;
import io.github.mecorp.mineralessentials.steel.ore.SteelOres;
import io.github.mecorp.mineralessentials.steel.tools.SteelTools;

public class Steel
{
    public static void RegisterSteel(){
        SteelItems.RegisterSteelItems();
        SteelOres.RegisterSteelOres();
        SteelTools.RegisterSteelTools();
        SteelArmor.RegisterSteelArmor();
        SteelBlocks.RegisterSteelBlocks();
        SteelRecipes.RegisterSteelRecipes();
    }
}
