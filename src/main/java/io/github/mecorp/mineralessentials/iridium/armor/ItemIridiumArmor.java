package io.github.mecorp.mineralessentials.iridium.armor;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemIridiumArmor extends ItemArmor {

	public ItemIridiumArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== IridiumArmor.IridiumHelmet || stack.getItem() == IridiumArmor.IridiumChestplate || stack.getItem() == IridiumArmor.IridiumBoots)
		{
			return Reference.MOD_ID + ":models/armor/Iridium1.png";
		}
		else if(stack.getItem() == IridiumArmor.IridiumPants)
		{
			return Reference.MOD_ID + ":models/armor/Iridium2.png";
		}
		else
		{
			System.out.println("Invallid Item ItemIridiumArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
