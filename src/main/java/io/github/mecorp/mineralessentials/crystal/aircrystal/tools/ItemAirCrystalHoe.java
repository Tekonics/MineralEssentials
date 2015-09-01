package io.github.mecorp.mineralessentials.crystal.aircrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemAirCrystalHoe extends ItemHoe
{

	public ItemAirCrystalHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("AirCrystalHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
