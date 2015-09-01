package io.github.mecorp.mineralessentials.crystal.watercrystal.items;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

public class ItemWaterCrystalCrystal extends Item
{
	public ItemWaterCrystalCrystal()
	{
		super();
		setUnlocalizedName("WaterCrystalCrystal");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
