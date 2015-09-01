package io.github.mecorp.mineralessentials.glass.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by untamemadman on 26/10/2014.
 */

public class GlassBlock
{

    public static Block ClearGlassBlock;
    public static Block MECorpClearGlassBlock;

    public static void RegisterGlassBlocks()
    {
        ClearGlassBlock = new BlockGlassBlock("GlassBlock", "Glass/glass_").setBlockName("ClearGlassBlock");
        RegisterHelper.registerBlock(ClearGlassBlock);
        OreDictionary.registerOre("blockGlass", new ItemStack(ClearGlassBlock));

        MECorpClearGlassBlock = new BlockMECorpGlassBlock("MECorpClearGlass", "logoGlass/glass_").setBlockName("MECorpClearGlassBlock");
        RegisterHelper.registerBlock(MECorpClearGlassBlock);
        OreDictionary.registerOre("blockGlass", new ItemStack(MECorpClearGlassBlock));
    }
}
