package io.github.mecorp.mineralessentials.glass;

import cpw.mods.fml.common.registry.GameRegistry;
import io.github.mecorp.mineralessentials.glass.blocks.GlassBlock;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * Created by untamemadman on 10/11/2014.
 */

public class GlassRecipes
{
    public static void RegisterGlassRecipes()
    {
        GameRegistry.addSmelting(Blocks.sandstone, new ItemStack(GlassBlock.ClearGlassBlock, 64), 10);
    }
}
