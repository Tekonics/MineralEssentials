package io.github.mecorp.mineralessentials.cobalt.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemCobaltAxe extends ItemAxe
{

	public ItemCobaltAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CobaltAxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
