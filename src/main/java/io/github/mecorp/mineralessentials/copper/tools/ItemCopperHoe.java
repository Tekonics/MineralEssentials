package io.github.mecorp.mineralessentials.copper.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemCopperHoe extends ItemHoe
{
	public ItemCopperHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CopperHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
