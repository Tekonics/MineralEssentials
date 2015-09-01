package io.github.mecorp.mineralessentials.crystal.earthcrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemEarthCrystalAxe extends ItemAxe
{

	public ItemEarthCrystalAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("EarthCrystalAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
