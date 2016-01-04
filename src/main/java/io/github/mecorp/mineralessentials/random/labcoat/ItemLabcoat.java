package io.github.mecorp.mineralessentials.random.labcoat;


		import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
		import io.github.mecorp.mineralessentials.reference.Reference;
		import net.minecraft.creativetab.CreativeTabs;
		import net.minecraft.entity.Entity;
		import net.minecraft.item.ItemArmor;
		import net.minecraft.item.ItemStack;

public class ItemLabcoat extends ItemArmor
{
	public ItemLabcoat(ArmorMaterial material, int armorType, String name)
	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == Labcoat.LabcoatChestplate)
		{
			return Reference.MOD_ID + ":models/armor/Labcoat1.png";
		}
		else if(stack.getItem() == Labcoat.LabcoatPants)
		{
			return Reference.MOD_ID + ":models/armor/Labcoat1.png";
		}
		else
		{
			System.out.println("Invalid Item ItemLabcoat");
			return null;
		}
	}
	@Override
	public CreativeTabs getCreativeTab()
	{
		return CreativeTabMECorp.MECorp;
	}
}
