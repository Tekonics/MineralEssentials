package io.github.mecorp.mineralessentials.iridium.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class IridiumArmor {
	
	static ArmorMaterial IridiumArmorMaterial = EnumHelper.addArmorMaterial("IridiumArmorMaterial", 50, new int[]{5, 10, 8, 5}, 50);
    public static Item IridiumHelmet;
    public static Item IridiumChestplate;
    public static Item IridiumPants;
    public static Item IridiumBoots;

	public static void RegisterIridiumArmor(){
		
		IridiumHelmet = new ItemIridiumArmor(IridiumArmorMaterial, 0, "IridiumHelmet");
	    RegisterHelper.registerItem(IridiumHelmet);
	    
	    IridiumChestplate = new ItemIridiumArmor(IridiumArmorMaterial, 1, "IridiumChestplate");
	    RegisterHelper.registerItem(IridiumChestplate);
	    
	    IridiumPants = new ItemIridiumArmor(IridiumArmorMaterial, 2, "IridiumPants");
	    RegisterHelper.registerItem(IridiumPants);
	    
	    IridiumBoots = new ItemIridiumArmor(IridiumArmorMaterial, 3, "IridiumBoots");
	    RegisterHelper.registerItem(IridiumBoots);
	    
	}

	
}
