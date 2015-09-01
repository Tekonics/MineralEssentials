package io.github.mecorp.mineralessentials.tweaks.recipies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by untamemadman on 01/09/2015.
 */

public class NetherStar
{
    public static void RegisterNetherStarRecipe()
    {
        //Crafting for a nether star. Without killing the wither
        GameRegistry.addShapedRecipe(new ItemStack(Items.nether_star), "ZZZ", "XXX", "CXV", 'Z', new ItemStack(Items.skull, 1, 1), 'X', new ItemStack(Blocks.soul_sand), 'C', new ItemStack(Items.diamond_sword), 'V', new ItemStack(Items.bow));
    }
}
