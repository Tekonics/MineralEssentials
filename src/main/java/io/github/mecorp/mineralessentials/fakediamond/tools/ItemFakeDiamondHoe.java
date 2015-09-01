package io.github.mecorp.mineralessentials.fakediamond.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemFakeDiamondHoe extends ItemHoe
{
	public ItemFakeDiamondHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("FakeDiamondHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
