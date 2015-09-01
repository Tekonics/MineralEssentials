package io.github.mecorp.mineralessentials.fakediamond.armor;


import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemFakeDiamondArmor extends ItemArmor
{
	public ItemFakeDiamondArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== FakeDiamondArmor.FakeDiamondHelmet || stack.getItem() == FakeDiamondArmor.FakeDiamondChestplate || stack.getItem() == FakeDiamondArmor.FakeDiamondBoots)
		{
			return Reference.MOD_ID + ":models/armor/FakeDiamond1.png";
		}
		else if(stack.getItem() == FakeDiamondArmor.FakeDiamondPants)
		{
			return Reference.MOD_ID + ":models/armor/FakeDiamond2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemFakeDiamondArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
