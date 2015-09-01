package io.github.mecorp.mineralessentials.food;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by untamemadman on 13/11/2014.
 */
public class FoodRecipes
{
    public static void RegisterFoodRecipes()
    {

        GameRegistry.addShapelessRecipe(new ItemStack(FoodItems.WheatFlour), new ItemStack(Items.wheat));

        GameRegistry.addSmelting(FoodItems.WheatFlour, new ItemStack(Items.bread, 1), 5);
    }
}