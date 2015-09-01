package io.github.mecorp.mineralessentials.crystal.watercrystal.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class WaterCrystalTools {

		public static Item WaterCrystalPickaxe;
		public static Item WaterCrystalAxe;
		public static Item WaterCrystalHoe;
		public static Item WaterCrystalShovel;
		public static Item WaterCrystalSword;
		static ToolMaterial WaterCrystalToolMaterial = EnumHelper.addToolMaterial("WaterCrystalToolMaterial", 4, 1500, 8.0F, 20.0F, 29);
		
	    
		public static void RegisterWaterCrystalTools(){

            WaterCrystalPickaxe = new ItemWaterCrystalPickaxe(WaterCrystalToolMaterial);
	    	RegisterHelper.registerItem(WaterCrystalPickaxe);

            WaterCrystalAxe = new ItemWaterCrystalAxe(WaterCrystalToolMaterial);
	    	RegisterHelper.registerItem(WaterCrystalAxe);

            WaterCrystalHoe = new ItemWaterCrystalHoe(WaterCrystalToolMaterial);
	    	RegisterHelper.registerItem(WaterCrystalHoe);

            WaterCrystalShovel = new ItemWaterCrystalShovel(WaterCrystalToolMaterial);
	    	RegisterHelper.registerItem(WaterCrystalShovel);

            WaterCrystalSword = new ItemWaterCrystalSword(WaterCrystalToolMaterial);
	    	RegisterHelper.registerItem(WaterCrystalSword);
		}
}
