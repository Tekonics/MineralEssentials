package io.github.mecorp.mineralessentials.creative.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemCreativePickaxe extends ItemPickaxe
{

	public ItemCreativePickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CreativePickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
