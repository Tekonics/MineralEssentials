package io.github.mecorp.mineralessentials.fakediamond.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class FakeDiamondArmor
{
	static ArmorMaterial FakeDiamondArmorMaterial = EnumHelper.addArmorMaterial("FakeDiamondArmorMaterial", 33, new int[]{3, 8, 6, 3}, 10);
    public static Item FakeDiamondHelmet;
    public static Item FakeDiamondChestplate;
    public static Item FakeDiamondPants;
    public static Item FakeDiamondBoots;

	public static void RegisterFakeDiamondArmor(){
		
		FakeDiamondHelmet = new ItemFakeDiamondArmor(FakeDiamondArmorMaterial, 0, "FakeDiamondHelmet");
	    RegisterHelper.registerItem(FakeDiamondHelmet);

	    FakeDiamondChestplate = new ItemFakeDiamondArmor(FakeDiamondArmorMaterial, 1, "FakeDiamondChestplate");
	    RegisterHelper.registerItem(FakeDiamondChestplate);

	    FakeDiamondPants = new ItemFakeDiamondArmor(FakeDiamondArmorMaterial, 2, "FakeDiamondPants");
	    RegisterHelper.registerItem(FakeDiamondPants);

	    FakeDiamondBoots = new ItemFakeDiamondArmor(FakeDiamondArmorMaterial, 3, "FakeDiamondBoots");
	    RegisterHelper.registerItem(FakeDiamondBoots);
	}
}
