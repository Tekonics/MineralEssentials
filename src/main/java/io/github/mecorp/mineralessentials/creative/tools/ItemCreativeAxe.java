package io.github.mecorp.mineralessentials.creative.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemCreativeAxe extends ItemAxe
{

	public ItemCreativeAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CreativeAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
