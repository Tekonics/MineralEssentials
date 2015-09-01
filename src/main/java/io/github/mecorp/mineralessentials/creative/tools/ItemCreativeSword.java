package io.github.mecorp.mineralessentials.creative.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSword;


public class ItemCreativeSword extends ItemSword
{

	public ItemCreativeSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CreativeSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
