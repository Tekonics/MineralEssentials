package io.github.mecorp.mineralessentials.crystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemCrystalHoe extends ItemHoe
{

	public ItemCrystalHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CrystalHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
