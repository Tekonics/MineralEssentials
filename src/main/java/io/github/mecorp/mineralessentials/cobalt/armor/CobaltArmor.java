package io.github.mecorp.mineralessentials.cobalt.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CobaltArmor {
	
	static ArmorMaterial CobaltArmorMaterial = EnumHelper.addArmorMaterial("CobaltArmorMaterial", 50, new int[]{5, 10, 8, 5}, 50);
    public static Item CobaltHelmet;
    public static Item CobaltChestplate;
    public static Item CobaltPants;
    public static Item CobaltBoots;

	public static void RegisterCobaltArmor(){
		
		CobaltHelmet = new ItemCobaltArmor(CobaltArmorMaterial, 0, "CobaltHelmet");
	    RegisterHelper.registerItem(CobaltHelmet);
	    
	    CobaltChestplate = new ItemCobaltArmor(CobaltArmorMaterial, 1, "CobaltChestplate");
	    RegisterHelper.registerItem(CobaltChestplate);
	    
	    CobaltPants = new ItemCobaltArmor(CobaltArmorMaterial, 2, "CobaltPants");
	    RegisterHelper.registerItem(CobaltPants);
	    
	    CobaltBoots = new ItemCobaltArmor(CobaltArmorMaterial, 3, "CobaltBoots");
	    RegisterHelper.registerItem(CobaltBoots);
	    
	}

	
}
