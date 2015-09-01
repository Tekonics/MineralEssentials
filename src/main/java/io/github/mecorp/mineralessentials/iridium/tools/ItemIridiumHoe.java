package io.github.mecorp.mineralessentials.iridium.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemIridiumHoe extends ItemHoe
{

	public ItemIridiumHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("IridiumHoe");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
    }

}
