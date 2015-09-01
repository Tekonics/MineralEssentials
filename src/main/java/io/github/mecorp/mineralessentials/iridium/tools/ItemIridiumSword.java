package io.github.mecorp.mineralessentials.iridium.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSword;


public class ItemIridiumSword extends ItemSword
{

	public ItemIridiumSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("IridiumSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
