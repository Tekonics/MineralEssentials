package io.github.mecorp.mineralessentials.tweaks.recipies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by untamemadman on 01/09/2015.
 */

public class Skulls
{
    //Crafting for Skulls
    public static void RegisterSkullsRecipe()
    {
        //Skeleton Skull
        GameRegistry.addShapedRecipe(new ItemStack(Items.skull), "XXX", "XXX", "X X", 'X', new ItemStack(Items.bone));

        //Wither Skeleton Skull
        GameRegistry.addSmelting(new ItemStack(Items.skull), new ItemStack(Items.skull, 1, 1), 5);

        //Zombie Head
        GameRegistry.addShapedRecipe(new ItemStack(Items.skull, 1, 2), "XXX", "XZX", "   ", 'X', new ItemStack(Items.rotten_flesh), 'Z', new ItemStack(Items.skull));

        //Head
        GameRegistry.addShapedRecipe(new ItemStack(Items.skull, 1, 3), "XXX", "XZX", "   ", 'X', new ItemStack(Items.leather), 'Z', new ItemStack(Items.skull));

        //Creeper Head
        GameRegistry.addShapedRecipe(new ItemStack(Items.skull, 1, 4), "XXX", "XZX", "CCC", 'X', new ItemStack(Items.rotten_flesh), 'Z', new ItemStack(Items.skull), 'C', new ItemStack(Items.gunpowder));
    }
}
