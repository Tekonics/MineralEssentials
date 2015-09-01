package io.github.mecorp.mineralessentials.crystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemCrystalAxe extends ItemAxe
{

	public ItemCrystalAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CrystalAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
