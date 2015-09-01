package io.github.mecorp.mineralessentials.steel.blocks;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSteelBlock extends Block
{
	public BlockSteelBlock()
	{
		super(Material.rock);
		setBlockName("SteelBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
	}
}
