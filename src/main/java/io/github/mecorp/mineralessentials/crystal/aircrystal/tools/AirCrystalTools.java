package io.github.mecorp.mineralessentials.crystal.aircrystal.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class AirCrystalTools {

		public static Item AirCrystalPickaxe;
		public static Item AirCrystalAxe;
		public static Item AirCrystalHoe;
		public static Item AirCrystalShovel;
		public static Item AirCrystalSword;
		static ToolMaterial AirCrystalToolMaterial = EnumHelper.addToolMaterial("AirCrystalToolMaterial", 4, 1500, 8.0F, 20.0F, 29);
		
	    
		public static void RegisterAirCrystalTools(){
			
			AirCrystalPickaxe = new ItemAirCrystalPickaxe(AirCrystalToolMaterial);
	    	RegisterHelper.registerItem(AirCrystalPickaxe);
	    	
	    	AirCrystalAxe = new ItemAirCrystalAxe(AirCrystalToolMaterial);
	    	RegisterHelper.registerItem(AirCrystalAxe);
	    	
	    	AirCrystalHoe = new ItemAirCrystalHoe(AirCrystalToolMaterial);
	    	RegisterHelper.registerItem(AirCrystalHoe);
	    	
	    	AirCrystalShovel = new ItemAirCrystalShovel(AirCrystalToolMaterial);
	    	RegisterHelper.registerItem(AirCrystalShovel);
	    	
	    	AirCrystalSword = new ItemAirCrystalSword(AirCrystalToolMaterial);
	    	RegisterHelper.registerItem(AirCrystalSword);
		}
}
