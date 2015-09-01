package io.github.mecorp.mineralessentials.tweaks.recipies;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by untamemadman on 01/09/2015.
 */

public class ArrowRecipe
{
    public static void RegisterArrowRecipe()
    {
        //Makes the arrow's recipe make 10 arrows
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.arrow, 10),
                "X  ",
                "C  ",
                "Z  ",
                'X', new ItemStack(Items.flint), 'C', "stickWood", 'Z', new ItemStack(Items.feather)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.arrow, 10),
                " X ",
                " C ",
                " Z ",
                'X', new ItemStack(Items.flint), 'C', "stickWood", 'Z', new ItemStack(Items.feather)));

        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.arrow, 10),
                "  X",
                "  C",
                "  Z",
                'X', new ItemStack(Items.flint), 'C', "stickWood", 'Z', new ItemStack(Items.feather)));
    }
}
