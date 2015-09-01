package io.github.mecorp.mineralessentials.cobalt.ore;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCobaltOre extends Block
{
	public BlockCobaltOre()
	{
		super(Material.rock);
		setBlockName("CobaltOre");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabMECorp.MECorp);
		setHardness(5.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 3);
	}
}
