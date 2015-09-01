package io.github.mecorp.mineralessentials.crystal.firecrystal.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class FireCrystalArmor {
		static ArmorMaterial FireCrystalArmorMaterial = EnumHelper.addArmorMaterial("FireCrystalArmorMaterial", 50, new int[]{4, 11, 8, 4}, 14);
	    public static Item FireCrystalHelmet;
	    public static Item FireCrystalChestplate;
	    public static Item FireCrystalPants;
	    public static Item FireCrystalBoots;

		public static void RegisterFireCrystalArmor(){
			
			FireCrystalHelmet = new ItemFireCrystalArmor(FireCrystalArmorMaterial, 0, "FireCrystalHelmet");
		    RegisterHelper.registerItem(FireCrystalHelmet);
		    
		    FireCrystalChestplate = new ItemFireCrystalArmor(FireCrystalArmorMaterial, 1, "FireCrystalChestplate");
		    RegisterHelper.registerItem(FireCrystalChestplate);
		    
		    FireCrystalPants = new ItemFireCrystalArmor(FireCrystalArmorMaterial, 2, "FireCrystalPants");
		    RegisterHelper.registerItem(FireCrystalPants);
		    
		    FireCrystalBoots = new ItemFireCrystalArmor(FireCrystalArmorMaterial, 3, "FireCrystalBoots");
		    RegisterHelper.registerItem(FireCrystalBoots);
		    
		}

		
	}
