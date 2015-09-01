package io.github.mecorp.mineralessentials.crystal.earthcrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemEarthCrystalPickaxe extends ItemPickaxe
{

	public ItemEarthCrystalPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("EarthCrystalPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
