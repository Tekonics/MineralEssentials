package io.github.mecorp.mineralessentials.steel.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSpade;


public class ItemSteelShovel extends ItemSpade
{

	public ItemSteelShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("SteelShovel");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
