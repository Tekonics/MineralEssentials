package io.github.mecorp.mineralessentials.glass;

import io.github.mecorp.mineralessentials.glass.blocks.GlassBlock;

/**
 * Created by untamemadman on 26/10/2014.
 */
public class Glass
{
    public static void RegisterGlass()
    {
        GlassBlock.RegisterGlassBlocks();
        GlassRecipes.RegisterGlassRecipes();
    }
}
