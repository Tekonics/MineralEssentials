package io.github.mecorp.mineralessentials.crystal.aircrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemAirCrystalPickaxe extends ItemPickaxe
{

	public ItemAirCrystalPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("AirCrystalPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
