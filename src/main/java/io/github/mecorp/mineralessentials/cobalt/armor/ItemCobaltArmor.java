package io.github.mecorp.mineralessentials.cobalt.armor;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCobaltArmor extends ItemArmor {

	public ItemCobaltArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== CobaltArmor.CobaltHelmet || stack.getItem() == CobaltArmor.CobaltChestplate || stack.getItem() == CobaltArmor.CobaltBoots)
		{
			return Reference.MOD_ID + ":models/armor/Cobalt1.png";
		}
		else if(stack.getItem() == CobaltArmor.CobaltPants)
		{
			return Reference.MOD_ID + ":models/armor/Cobalt2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemCobaltArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
