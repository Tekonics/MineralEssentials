package io.github.mecorp.mineralessentials.helper;


import cpw.mods.fml.common.registry.GameRegistry;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegisterHelper
{
    public static void registerItem(Item item)
    {
        GameRegistry.registerItem(item, Reference.MOD_ID + "_" + item.getUnlocalizedName().substring(5));
    }
    public static void registerBlock(Block block)
    {
        GameRegistry.registerBlock(block,Reference.MOD_ID + "_" + block.getUnlocalizedName().substring(5));
    }
}