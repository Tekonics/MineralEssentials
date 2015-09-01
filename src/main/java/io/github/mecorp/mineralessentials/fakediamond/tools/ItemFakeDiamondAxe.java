package io.github.mecorp.mineralessentials.fakediamond.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemFakeDiamondAxe extends ItemAxe
{
	
    public ItemFakeDiamondAxe(ToolMaterial material)
    {
	super(material);
	setUnlocalizedName("FakeDiamondAxe");
	setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	setCreativeTab(CreativeTabMECorp.MECorp);
    }

}
