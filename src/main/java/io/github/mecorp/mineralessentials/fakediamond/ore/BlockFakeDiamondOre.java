package io.github.mecorp.mineralessentials.fakediamond.ore;

import io.github.mecorp.mineralessentials.fakediamond.items.FakeDiamondItems;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;


public class BlockFakeDiamondOre extends Block
{
	public BlockFakeDiamondOre()
	{
		super(Material.rock);
		setBlockName("FakeDiamondOre");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 3);
	}


    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return FakeDiamondItems.FakeDiamond;
    }

}
