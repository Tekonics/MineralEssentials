package io.github.mecorp.mineralessentials.crystal.firecrystal.items;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemFireCrystalCrystal extends Item
{
	public ItemFireCrystalCrystal()
	{
		super();
		setUnlocalizedName("FireCrystalCrystal");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
