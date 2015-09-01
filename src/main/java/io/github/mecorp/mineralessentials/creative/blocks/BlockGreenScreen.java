package io.github.mecorp.mineralessentials.creative.blocks;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockGreenScreen extends Block
{
	public BlockGreenScreen()
	{
		super(Material.rock);
		setBlockName("GreenScreen");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabDecorations);
		setLightLevel(1.0F);
		setBlockUnbreakable();
		setResistance(6000000.0F);
	}
}
