package io.github.mecorp.mineralessentials.crystal.firecrystal.armor;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemFireCrystalArmor extends ItemArmor
{

	public ItemFireCrystalArmor(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem()== FireCrystalArmor.FireCrystalHelmet || stack.getItem() == FireCrystalArmor.FireCrystalChestplate || stack.getItem() == FireCrystalArmor.FireCrystalBoots)
		{
			return Reference.MOD_ID + ":models/armor/FireCrystal1.png";
		}
		else if(stack.getItem() == FireCrystalArmor.FireCrystalPants)
		{
			return Reference.MOD_ID + ":models/armor/FireCrystal2.png";
		}
		else
		{
			System.out.println("Invalid Item ItemFireCrystalArmor");
		return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
	{
		if(!world.isRemote)
		{
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 1, 5, true));
		}
	}
}
