package io.github.mecorp.mineralessentials.tweaks.recipies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by untamemadman on 01/09/2015.
 */

public class Leather
{
    public static void RegisterLeatherRecipe()
    {
        //Smelting rotten flesh into leather
        GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh), new ItemStack(Items.leather), 1);
    }
}
