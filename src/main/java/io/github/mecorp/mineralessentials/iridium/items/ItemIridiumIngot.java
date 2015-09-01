package io.github.mecorp.mineralessentials.iridium.items;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemIridiumIngot extends Item
{
	public ItemIridiumIngot()
	{
		super();
		setUnlocalizedName("IridiumIngot");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
