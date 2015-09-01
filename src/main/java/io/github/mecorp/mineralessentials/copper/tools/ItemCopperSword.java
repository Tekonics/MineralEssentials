package io.github.mecorp.mineralessentials.copper.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemCopperSword extends ItemSword 
{
	public ItemCopperSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CopperSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
