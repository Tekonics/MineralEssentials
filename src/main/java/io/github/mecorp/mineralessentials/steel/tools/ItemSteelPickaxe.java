package io.github.mecorp.mineralessentials.steel.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemSteelPickaxe extends ItemPickaxe
{

	public ItemSteelPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("SteelPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
