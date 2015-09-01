package io.github.mecorp.mineralessentials.crystal.earthcrystal.items;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemEarthCrystalCrystal extends Item
{
	public ItemEarthCrystalCrystal()
	{
		super();
		setUnlocalizedName("EarthCrystalCrystal");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
