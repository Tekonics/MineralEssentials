package io.github.mecorp.mineralessentials.steel.ore;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSteelOre extends Block
{
	public BlockSteelOre()
	{
		super(Material.rock);
		setBlockName("SteelOre");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
	}
}
