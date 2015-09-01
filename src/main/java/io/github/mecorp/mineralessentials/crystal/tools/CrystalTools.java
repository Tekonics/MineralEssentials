package io.github.mecorp.mineralessentials.crystal.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CrystalTools {

		public static Item CrystalPickaxe;
		public static Item CrystalAxe;
		public static Item CrystalHoe;
		public static Item CrystalShovel;
		public static Item CrystalSword;
		static ToolMaterial CrystalToolMaterial = EnumHelper.addToolMaterial("CrystalToolMaterial", 4, 1500, 8.0F, 20.0F, 29);
		
	    
		public static void RegisterCrystalTools(){
			
			CrystalPickaxe = new ItemCrystalPickaxe (CrystalToolMaterial);
	    	RegisterHelper.registerItem(CrystalPickaxe);
	    	
	    	CrystalAxe = new ItemCrystalAxe(CrystalToolMaterial);
	    	RegisterHelper.registerItem(CrystalAxe);
	    	
	    	CrystalHoe = new ItemCrystalHoe(CrystalToolMaterial);
	    	RegisterHelper.registerItem(CrystalHoe);
	    	
	    	CrystalShovel = new ItemCrystalShovel(CrystalToolMaterial);
	    	RegisterHelper.registerItem(CrystalShovel);
	    	
	    	CrystalSword = new ItemCrystalSword(CrystalToolMaterial);
	    	RegisterHelper.registerItem(CrystalSword);
		}
}
