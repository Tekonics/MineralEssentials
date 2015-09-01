package io.github.mecorp.mineralessentials.steel.items;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemSteelIngot extends Item
{
	public ItemSteelIngot()
	{
		super();
		setUnlocalizedName("SteelIngot");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
