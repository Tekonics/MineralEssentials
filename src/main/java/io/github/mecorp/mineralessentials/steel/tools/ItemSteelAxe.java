package io.github.mecorp.mineralessentials.steel.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemSteelAxe extends ItemAxe
{

	public ItemSteelAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("SteelAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
