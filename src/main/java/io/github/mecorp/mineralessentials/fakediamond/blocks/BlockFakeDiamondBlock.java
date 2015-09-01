package io.github.mecorp.mineralessentials.fakediamond.blocks;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFakeDiamondBlock extends Block
{
	public BlockFakeDiamondBlock()
	{
		super(Material.rock);
		setBlockName("FakeDiamondBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
	}
}
