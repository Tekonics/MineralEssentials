package io.github.mecorp.mineralessentials.copper.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class CopperArmor
{
	static ArmorMaterial CopperArmorMaterial = EnumHelper.addArmorMaterial("CopperArmorMaterial", 50, new int[]{5, 10, 8, 5}, 50);
    public static Item CopperHelmet;
    public static Item CopperChestplate;
    public static Item CopperPants;
    public static Item CopperBoots;

	public static void RegisterCopperArmor(){
		
		CopperHelmet = new ItemCopperArmor(CopperArmorMaterial, 0, "CopperHelmet");
	    RegisterHelper.registerItem(CopperHelmet);
	    
	    CopperChestplate = new ItemCopperArmor(CopperArmorMaterial, 1, "CopperChestplate");
	    RegisterHelper.registerItem(CopperChestplate);
	    
	    CopperPants = new ItemCopperArmor(CopperArmorMaterial, 2, "CopperPants");
	    RegisterHelper.registerItem(CopperPants);
	    
	    CopperBoots = new ItemCopperArmor(CopperArmorMaterial, 3, "CopperBoots");
	    RegisterHelper.registerItem(CopperBoots);
	}
}
