package io.github.mecorp.mineralessentials.crystal.aircrystal.items;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemAirCrystalCrystal extends Item
{
	public ItemAirCrystalCrystal()
	{
		super();
		setUnlocalizedName("AirCrystalCrystal");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
