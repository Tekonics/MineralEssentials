package io.github.mecorp.mineralessentials.fakediamond.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemFakeDiamondSword extends ItemSword
{
	public ItemFakeDiamondSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("FakeDiamondSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
