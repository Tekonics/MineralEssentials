package io.github.mecorp.mineralessentials.iridium.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemIridiumPickaxe extends ItemPickaxe
{

	public ItemIridiumPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("IridiumPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
