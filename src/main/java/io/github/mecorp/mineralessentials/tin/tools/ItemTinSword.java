package io.github.mecorp.mineralessentials.tin.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemTinSword extends ItemSword
{
	public ItemTinSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("TinSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
}
