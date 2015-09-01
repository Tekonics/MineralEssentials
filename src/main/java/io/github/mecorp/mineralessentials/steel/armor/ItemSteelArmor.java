package io.github.mecorp.mineralessentials.steel.armor;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemSteelArmor extends ItemArmor {

	public ItemSteelArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== SteelArmor.SteelHelmet || stack.getItem() == SteelArmor.SteelChestplate || stack.getItem() == SteelArmor.SteelBoots)
		{
			return Reference.MOD_ID + ":models/armor/Steel1.png";
		}
		else if(stack.getItem() == SteelArmor.SteelPants)
		{
			return Reference.MOD_ID + ":models/armor/Steel2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemSteelArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
