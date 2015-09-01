package io.github.mecorp.mineralessentials.iridium.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class IridiumTools {

		public static Item IridiumPickaxe;
		public static Item IridiumAxe;
		public static Item IridiumHoe;
		public static Item IridiumShovel;
		public static Item IridiumSword;
		static ToolMaterial IridiumToolMaterial = EnumHelper.addToolMaterial("IridiumToolMaterial", 4, 2000, 7.0F, 10.0F, 50);
		
	    
		public static void RegisterIridiumTools(){
			
			IridiumPickaxe = new ItemIridiumPickaxe(IridiumToolMaterial);
	    	RegisterHelper.registerItem(IridiumPickaxe);
	    	
	    	IridiumAxe = new ItemIridiumAxe(IridiumToolMaterial);
	    	RegisterHelper.registerItem(IridiumAxe);
	    	
	    	IridiumHoe = new ItemIridiumHoe(IridiumToolMaterial);
	    	RegisterHelper.registerItem(IridiumHoe);
	    	
	    	IridiumShovel = new ItemIridiumShovel(IridiumToolMaterial);
	    	RegisterHelper.registerItem(IridiumShovel);
	    	
	    	IridiumSword = new ItemIridiumSword(IridiumToolMaterial);
	    	RegisterHelper.registerItem(IridiumSword);
		}
}
