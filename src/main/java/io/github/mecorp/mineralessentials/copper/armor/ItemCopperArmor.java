package io.github.mecorp.mineralessentials.copper.armor;


import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import net.minecraft.creativetab.CreativeTabs;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCopperArmor extends ItemArmor
{
	public ItemCopperArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== CopperArmor.CopperHelmet || stack.getItem() == CopperArmor.CopperChestplate || stack.getItem() == CopperArmor.CopperBoots)
		{
			return Reference.MOD_ID + ":models/armor/Copper1.png";
		}
		else if(stack.getItem() == CopperArmor.CopperPants)
		{
			return Reference.MOD_ID + ":models/armor/Copper2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemCopperArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
