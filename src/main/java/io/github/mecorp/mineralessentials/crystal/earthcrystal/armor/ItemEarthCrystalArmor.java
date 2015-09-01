package io.github.mecorp.mineralessentials.crystal.earthcrystal.armor;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemEarthCrystalArmor extends ItemArmor {

	public ItemEarthCrystalArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== EarthCrystalArmor.EarthCrystalHelmet || stack.getItem() == EarthCrystalArmor.EarthCrystalChestplate || stack.getItem() == EarthCrystalArmor.EarthCrystalBoots)
		{
			return Reference.MOD_ID + ":models/armor/EarthCrystal1.png";
		}
		else if(stack.getItem() == EarthCrystalArmor.EarthCrystalPants)
		{
			return Reference.MOD_ID + ":models/armor/EarthCrystal2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemEarthCrystalArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
