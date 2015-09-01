package io.github.mecorp.mineralessentials.crystal.watercrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSpade;


public class ItemWaterCrystalShovel extends ItemSpade
{

	public ItemWaterCrystalShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("WaterCrystalShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
