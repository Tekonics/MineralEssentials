package io.github.mecorp.mineralessentials.crystal.armor;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CrystalArmor {
		static ArmorMaterial CrystalArmorMaterial = EnumHelper.addArmorMaterial("CrystalArmorMaterial", 50, new int[]{4, 11, 8, 4}, 14);
	    public static Item CrystalHelmet;
	    public static Item CrystalChestplate;
	    public static Item CrystalPants;
	    public static Item CrystalBoots;

		public static void RegisterCrystalArmor()
    {

        CrystalHelmet = new ItemCrystalArmor(CrystalArmorMaterial, 0, "CrystalHelmet");
        RegisterHelper.registerItem(CrystalHelmet);

        CrystalChestplate = new ItemCrystalArmor(CrystalArmorMaterial, 1, "CrystalChestplate");
        RegisterHelper.registerItem(CrystalChestplate);

        CrystalPants = new ItemCrystalArmor(CrystalArmorMaterial, 2, "CrystalPants");
        RegisterHelper.registerItem(CrystalPants);

        CrystalBoots = new ItemCrystalArmor(CrystalArmorMaterial, 3, "CrystalBoots");
        RegisterHelper.registerItem(CrystalBoots);
    }
}