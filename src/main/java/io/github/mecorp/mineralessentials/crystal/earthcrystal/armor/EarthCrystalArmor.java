package io.github.mecorp.mineralessentials.crystal.earthcrystal.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class EarthCrystalArmor {
		static ArmorMaterial EarthCrystalArmorMaterial = EnumHelper.addArmorMaterial("EarthCrystalArmorMaterial", 50, new int[]{4, 11, 8, 4}, 14);
	    public static Item EarthCrystalHelmet;
	    public static Item EarthCrystalChestplate;
	    public static Item EarthCrystalPants;
	    public static Item EarthCrystalBoots;

		public static void RegisterEarthCrystalArmor(){

            EarthCrystalHelmet = new ItemEarthCrystalArmor(EarthCrystalArmorMaterial, 0, "EarthCrystalHelmet");
		    RegisterHelper.registerItem(EarthCrystalHelmet);

            EarthCrystalChestplate = new ItemEarthCrystalArmor(EarthCrystalArmorMaterial, 1, "EarthCrystalChestplate");
		    RegisterHelper.registerItem(EarthCrystalChestplate);

            EarthCrystalPants = new ItemEarthCrystalArmor(EarthCrystalArmorMaterial, 2, "EarthCrystalPants");
		    RegisterHelper.registerItem(EarthCrystalPants);

            EarthCrystalBoots = new ItemEarthCrystalArmor(EarthCrystalArmorMaterial, 3, "EarthCrystalBoots");
		    RegisterHelper.registerItem(EarthCrystalBoots);
		    
		}

		
	}
