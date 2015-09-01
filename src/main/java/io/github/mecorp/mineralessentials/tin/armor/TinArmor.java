package io.github.mecorp.mineralessentials.tin.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class TinArmor
{
	static ArmorMaterial TinArmorMaterial = EnumHelper.addArmorMaterial("TinArmorMaterial", 50, new int[]{5, 10, 8, 5}, 50);
    public static Item TinHelmet;
    public static Item TinChestplate;
    public static Item TinPants;
    public static Item TinBoots;

	public static void RegisterTinArmor(){
		
		TinHelmet = new ItemTinArmor(TinArmorMaterial, 0, "TinHelmet");
	    RegisterHelper.registerItem(TinHelmet);

	    TinChestplate = new ItemTinArmor(TinArmorMaterial, 1, "TinChestplate");
	    RegisterHelper.registerItem(TinChestplate);

	    TinPants = new ItemTinArmor(TinArmorMaterial, 2, "TinPants");
	    RegisterHelper.registerItem(TinPants);

	    TinBoots = new ItemTinArmor(TinArmorMaterial, 3, "TinBoots");
	    RegisterHelper.registerItem(TinBoots);
	}
}
