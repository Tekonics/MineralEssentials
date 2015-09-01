package io.github.mecorp.mineralessentials.random.labcoat;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class Labcoat
{
	static ArmorMaterial LabcoatMaterial = EnumHelper.addArmorMaterial("LabcoatArmorMaterial", 50, new int[]{5, 10, 8, 5}, 50);
    public static Item LabcoatChestplate;
    public static Item LabcoatPants;

	public static void RegisterLabcoat(){

		LabcoatChestplate = new ItemLabcoat(LabcoatMaterial, 1, "LabcoatChestplate");
	    RegisterHelper.registerItem(LabcoatChestplate);

		LabcoatPants = new ItemLabcoat(LabcoatMaterial, 2, "LabcoatPants");
	    RegisterHelper.registerItem(LabcoatPants);
	}
}
