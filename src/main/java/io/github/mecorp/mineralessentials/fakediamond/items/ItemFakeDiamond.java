package io.github.mecorp.mineralessentials.fakediamond.items;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemFakeDiamond extends Item
{
	public ItemFakeDiamond()
	{
		super();
		setUnlocalizedName("FakeDiamond");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
}

