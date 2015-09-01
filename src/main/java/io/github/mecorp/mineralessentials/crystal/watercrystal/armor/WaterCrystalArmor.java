package io.github.mecorp.mineralessentials.crystal.watercrystal.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class WaterCrystalArmor {
		static ArmorMaterial WaterCrystalArmorMaterial = EnumHelper.addArmorMaterial("WaterCrystalArmorMaterial", 50, new int[]{4, 11, 8, 4}, 14);
	    public static Item WaterCrystalHelmet;
	    public static Item WaterCrystalChestplate;
	    public static Item WaterCrystalPants;
	    public static Item WaterCrystalBoots;

		public static void RegisterWaterCrystalArmor(){

            WaterCrystalHelmet = new ItemWaterCrystalArmor(WaterCrystalArmorMaterial, 0, "WaterCrystalHelmet");
		    RegisterHelper.registerItem(WaterCrystalHelmet);

            WaterCrystalChestplate = new ItemWaterCrystalArmor(WaterCrystalArmorMaterial, 1, "WaterCrystalChestplate");
		    RegisterHelper.registerItem(WaterCrystalChestplate);

            WaterCrystalPants = new ItemWaterCrystalArmor(WaterCrystalArmorMaterial, 2, "WaterCrystalPants");
		    RegisterHelper.registerItem(WaterCrystalPants);

            WaterCrystalBoots = new ItemWaterCrystalArmor(WaterCrystalArmorMaterial, 3, "WaterCrystalBoots");
		    RegisterHelper.registerItem(WaterCrystalBoots);
		    
		}

		
	}
