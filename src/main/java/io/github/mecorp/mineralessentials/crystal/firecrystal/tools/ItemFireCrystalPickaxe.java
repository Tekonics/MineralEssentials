package io.github.mecorp.mineralessentials.crystal.firecrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemFireCrystalPickaxe extends ItemPickaxe
{

	public ItemFireCrystalPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("FireCrystalPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

}
