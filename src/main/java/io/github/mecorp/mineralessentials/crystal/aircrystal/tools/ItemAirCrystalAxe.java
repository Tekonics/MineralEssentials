package io.github.mecorp.mineralessentials.crystal.aircrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemAirCrystalAxe extends ItemAxe
{

	public ItemAirCrystalAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("AirCrystalAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
