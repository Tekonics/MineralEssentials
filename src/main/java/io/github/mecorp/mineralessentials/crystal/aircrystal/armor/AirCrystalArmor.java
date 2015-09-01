package io.github.mecorp.mineralessentials.crystal.aircrystal.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AirCrystalArmor {
		static ArmorMaterial AirCrystalArmorMaterial = EnumHelper.addArmorMaterial("AirCrystalArmorMaterial", 50, new int[]{4, 11, 8, 4}, 14);
	    public static Item AirCrystalHelmet;
	    public static Item AirCrystalChestplate;
	    public static Item AirCrystalPants;
	    public static Item AirCrystalBoots;

		public static void RegisterAirCrystalArmor(){
			
			AirCrystalHelmet = new ItemAirCrystalArmor(AirCrystalArmorMaterial, 0, "AirCrystalHelmet");
		    RegisterHelper.registerItem(AirCrystalHelmet);
		    
		    AirCrystalChestplate = new ItemAirCrystalArmor(AirCrystalArmorMaterial, 1, "AirCrystalChestplate");
		    RegisterHelper.registerItem(AirCrystalChestplate);
		    
		    AirCrystalPants = new ItemAirCrystalArmor(AirCrystalArmorMaterial, 2, "AirCrystalPants");
		    RegisterHelper.registerItem(AirCrystalPants);
		    
		    AirCrystalBoots = new ItemAirCrystalArmor(AirCrystalArmorMaterial, 3, "AirCrystalBoots");
		    RegisterHelper.registerItem(AirCrystalBoots);
		    
		}

		
	}
