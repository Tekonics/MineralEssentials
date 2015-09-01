package io.github.mecorp.mineralessentials.copper.items;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item
{
	public ItemCopperIngot()
	{
		super();
		setUnlocalizedName("CopperIngot");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}

