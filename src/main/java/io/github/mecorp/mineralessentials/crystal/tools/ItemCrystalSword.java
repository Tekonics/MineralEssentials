package io.github.mecorp.mineralessentials.crystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSword;



public class ItemCrystalSword extends ItemSword
{

	public ItemCrystalSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CrystalSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
