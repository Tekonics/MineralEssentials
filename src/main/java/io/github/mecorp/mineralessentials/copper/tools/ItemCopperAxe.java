package io.github.mecorp.mineralessentials.copper.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemCopperAxe extends ItemAxe
{
	
    public ItemCopperAxe(ToolMaterial material)
    {
	super(material);
	setUnlocalizedName("CopperAxe");
	setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	setCreativeTab(CreativeTabMECorp.MECorp);
    }

}
