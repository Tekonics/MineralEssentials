package io.github.mecorp.mineralessentials.tin.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TinTools {

		public static Item TinPickaxe;
		public static Item TinAxe;
		public static Item TinHoe;
		public static Item TinShovel;
		public static Item TinSword;
		static ToolMaterial TinToolMaterial = EnumHelper.addToolMaterial("TinToolMaterial", 4, 2000, 7.0F, 10.0F, 50);
		
	    
		public static void RegisterTinTools(){
			
			TinPickaxe = new ItemTinPickaxe(TinToolMaterial);
	    	RegisterHelper.registerItem(TinPickaxe);
	    	
	    	TinAxe = new ItemTinAxe(TinToolMaterial);
	    	RegisterHelper.registerItem(TinAxe);
	    	
	    	TinHoe = new ItemTinHoe(TinToolMaterial);
	    	RegisterHelper.registerItem(TinHoe);
	    	
	    	TinShovel = new ItemTinShovel(TinToolMaterial);
	    	RegisterHelper.registerItem(TinShovel);
	    	
	    	TinSword = new ItemTinSword(TinToolMaterial);
	    	RegisterHelper.registerItem(TinSword);
		}
}
