package io.github.mecorp.mineralessentials.creative.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSpade;


public class ItemCreativeShovel extends ItemSpade
{

	public ItemCreativeShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CreativeShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
