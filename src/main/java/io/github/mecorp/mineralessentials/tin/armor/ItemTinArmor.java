package io.github.mecorp.mineralessentials.tin.armor;


import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTinArmor extends ItemArmor
{
	public ItemTinArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== TinArmor.TinHelmet || stack.getItem() == TinArmor.TinChestplate || stack.getItem() == TinArmor.TinBoots)
		{
			return Reference.MOD_ID + ":models/armor/Tin1.png";
		}
		else if(stack.getItem() == TinArmor.TinPants)
		{
			return Reference.MOD_ID + ":models/armor/Tin2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemTinArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
