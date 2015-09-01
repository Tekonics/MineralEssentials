package io.github.mecorp.mineralessentials.steel.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SteelTools {

		public static Item SteelPickaxe;
		public static Item SteelAxe;
		public static Item SteelHoe;
		public static Item SteelShovel;
		public static Item SteelSword;
		static ToolMaterial SteelToolMaterial = EnumHelper.addToolMaterial("SteelToolMaterial", 4, 2000, 7.0F, 10.0F, 50);
		
	    
		public static void RegisterSteelTools(){
			
			SteelPickaxe = new ItemSteelPickaxe(SteelToolMaterial);
	    	RegisterHelper.registerItem(SteelPickaxe);
	    	
	    	SteelAxe = new ItemSteelAxe(SteelToolMaterial);
	    	RegisterHelper.registerItem(SteelAxe);
	    	
	    	SteelHoe = new ItemSteelHoe(SteelToolMaterial);
	    	RegisterHelper.registerItem(SteelHoe);
	    	
	    	SteelShovel = new ItemSteelShovel(SteelToolMaterial);
	    	RegisterHelper.registerItem(SteelShovel);
	    	
	    	SteelSword = new ItemSteelSword(SteelToolMaterial);
	    	RegisterHelper.registerItem(SteelSword);
		}
}
