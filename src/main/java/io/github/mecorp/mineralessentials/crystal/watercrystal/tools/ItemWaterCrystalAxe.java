package io.github.mecorp.mineralessentials.crystal.watercrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemWaterCrystalAxe extends ItemAxe
{

	public ItemWaterCrystalAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("WaterCrystalAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
