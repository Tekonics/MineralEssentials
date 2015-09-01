package io.github.mecorp.mineralessentials.steel.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SteelArmor {
	
	static ArmorMaterial SteelArmorMaterial = EnumHelper.addArmorMaterial("SteelArmorMaterial", 50, new int[]{5, 10, 8, 5}, 50);
    public static Item SteelHelmet;
    public static Item SteelChestplate;
    public static Item SteelPants;
    public static Item SteelBoots;

	public static void RegisterSteelArmor(){
		
		SteelHelmet = new ItemSteelArmor(SteelArmorMaterial, 0, "SteelHelmet");
	    RegisterHelper.registerItem(SteelHelmet);
	    
	    SteelChestplate = new ItemSteelArmor(SteelArmorMaterial, 1, "SteelChestplate");
	    RegisterHelper.registerItem(SteelChestplate);
	    
	    SteelPants = new ItemSteelArmor(SteelArmorMaterial, 2, "SteelPants");
	    RegisterHelper.registerItem(SteelPants);
	    
	    SteelBoots = new ItemSteelArmor(SteelArmorMaterial, 3, "SteelBoots");
	    RegisterHelper.registerItem(SteelBoots);
	    
	}

	
}
