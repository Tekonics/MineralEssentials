package io.github.mecorp.mineralessentials.crystal.earthcrystal.tools;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.ItemSword;


public class ItemEarthCrystalSword extends ItemSword
{

	public ItemEarthCrystalSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("EarthCrystalSword");
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabMECorp.MECorp);
	}
    /*public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par1ItemStack.addEnchantment(Enchantment.fireAspect, 2);
    }*/
}