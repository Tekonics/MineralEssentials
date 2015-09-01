package io.github.mecorp.mineralessentials.cobalt.items;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemCobaltIngot extends Item
{
	public ItemCobaltIngot()
	{
		super();
		setUnlocalizedName("CobaltIngot");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
