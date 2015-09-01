package io.github.mecorp.mineralessentials.fakediamond.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemFakeDiamondPickaxe extends ItemPickaxe
{
	public ItemFakeDiamondPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("FakeDiamondPickaxe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
