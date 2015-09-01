package io.github.mecorp.mineralessentials.crystal.firecrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemFireCrystalAxe extends ItemAxe
{

	public ItemFireCrystalAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("FireCrystalAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
