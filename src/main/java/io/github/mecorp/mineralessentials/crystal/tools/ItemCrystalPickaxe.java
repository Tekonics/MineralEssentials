package io.github.mecorp.mineralessentials.crystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemCrystalPickaxe extends ItemPickaxe
{

	public ItemCrystalPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("CrystalPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
