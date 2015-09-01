package io.github.mecorp.mineralessentials.crystal.aircrystal.armor;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemAirCrystalArmor extends ItemArmor
{

	public ItemAirCrystalArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== AirCrystalArmor.AirCrystalHelmet || stack.getItem() == AirCrystalArmor.AirCrystalChestplate || stack.getItem() == AirCrystalArmor.AirCrystalBoots)
		{
			return Reference.MOD_ID + ":models/armor/AirCrystal1.png";
		}
		else if(stack.getItem() == AirCrystalArmor.AirCrystalPants)
		{
			return Reference.MOD_ID + ":models/armor/AirCrystal2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemAirCrystalArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
