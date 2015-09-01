package io.github.mecorp.mineralessentials.creative.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemCreativeHoe extends ItemHoe
{

	public ItemCreativeHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CreativeHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
