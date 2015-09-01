package io.github.mecorp.mineralessentials.copper.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CopperTools {

		public static Item CopperPickaxe;
		public static Item CopperAxe;
		public static Item CopperHoe;
		public static Item CopperShovel;
		public static Item CopperSword;
		static ToolMaterial CopperToolMaterial = EnumHelper.addToolMaterial("CopperToolMaterial", 4, 2000, 7.0F, 10.0F, 50);
		
	    
		public static void RegisterCopperTools(){
			
			CopperPickaxe = new ItemCopperPickaxe (CopperToolMaterial);
	    	RegisterHelper.registerItem(CopperPickaxe);
	    	
	    	CopperAxe = new ItemCopperAxe(CopperToolMaterial);
	    	RegisterHelper.registerItem(CopperAxe);
	    	
	    	CopperHoe = new ItemCopperHoe(CopperToolMaterial);
	    	RegisterHelper.registerItem(CopperHoe);
	    	
	    	CopperShovel = new ItemCopperShovel(CopperToolMaterial);
	    	RegisterHelper.registerItem(CopperShovel);
	    	
	    	CopperSword = new ItemCopperSword(CopperToolMaterial);
	    	RegisterHelper.registerItem(CopperSword);
		}
}
