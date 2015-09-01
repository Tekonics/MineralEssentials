package io.github.mecorp.mineralessentials.crystal.watercrystal.armor;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemWaterCrystalArmor extends ItemArmor {

	public ItemWaterCrystalArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== WaterCrystalArmor.WaterCrystalHelmet || stack.getItem() == WaterCrystalArmor.WaterCrystalChestplate || stack.getItem() == WaterCrystalArmor.WaterCrystalBoots)
		{
			return Reference.MOD_ID + ":models/armor/WaterCrystal1.png";
		}
		else if(stack.getItem() == WaterCrystalArmor.WaterCrystalPants)
		{
			return Reference.MOD_ID + ":models/armor/WaterCrystal2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemWaterCrystalArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
