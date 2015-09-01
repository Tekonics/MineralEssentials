package io.github.mecorp.mineralessentials.fakediamond.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSpade;

public class ItemFakeDiamondShovel extends ItemSpade
{
	public ItemFakeDiamondShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("FakeDiamondShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
