package io.github.mecorp.mineralessentials.crystal.earthcrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemEarthCrystalHoe extends ItemHoe
{

	public ItemEarthCrystalHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("EarthCrystalHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
