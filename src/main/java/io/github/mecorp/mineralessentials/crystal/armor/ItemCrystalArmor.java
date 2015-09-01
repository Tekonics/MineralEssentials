package io.github.mecorp.mineralessentials.crystal.armor;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCrystalArmor extends ItemArmor {

	public ItemCrystalArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== CrystalArmor.CrystalHelmet || stack.getItem() == CrystalArmor.CrystalChestplate || stack.getItem() == CrystalArmor.CrystalBoots)
		{
			return Reference.MOD_ID + ":models/armor/Crystal1.png";
		}
		else if(stack.getItem() == CrystalArmor.CrystalPants)
		{
			return Reference.MOD_ID + ":models/armor/Crystal2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemCrystalArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
