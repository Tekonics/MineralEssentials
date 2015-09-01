package io.github.mecorp.mineralessentials.crystal.aircrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSword;


public class ItemAirCrystalSword extends ItemSword
{

	public ItemAirCrystalSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("AirCrystalSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}

    /*public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par1ItemStack.addEnchantment(Enchantment.fireAspect, 2);
    }*/
}