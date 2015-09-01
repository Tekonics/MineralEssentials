package io.github.mecorp.mineralessentials.cobalt.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CobaltTools {

		public static Item CobaltPickaxe;
		public static Item CobaltAxe;
		public static Item CobaltHoe;
		public static Item CobaltShovel;
		public static Item CobaltSword;
		static ToolMaterial CobaltToolMaterial = EnumHelper.addToolMaterial("CobaltToolMaterial", 4, 2000, 7.0F, 10.0F, 50);
		
	    
		public static void RegisterCobaltTools(){
			
			CobaltPickaxe = new ItemCobaltPickaxe (CobaltToolMaterial);
	    	RegisterHelper.registerItem(CobaltPickaxe);
	    	
	    	CobaltAxe = new ItemCobaltAxe(CobaltToolMaterial);
	    	RegisterHelper.registerItem(CobaltAxe);
	    	
	    	CobaltHoe = new ItemCobaltHoe(CobaltToolMaterial);
	    	RegisterHelper.registerItem(CobaltHoe);
	    	
	    	CobaltShovel = new ItemCobaltShovel(CobaltToolMaterial);
	    	RegisterHelper.registerItem(CobaltShovel);
	    	
	    	CobaltSword = new ItemCobaltSword(CobaltToolMaterial);
	    	RegisterHelper.registerItem(CobaltSword);
		}
}
