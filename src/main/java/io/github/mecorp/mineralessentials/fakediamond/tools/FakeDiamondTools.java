package io.github.mecorp.mineralessentials.fakediamond.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class FakeDiamondTools {

		public static Item FakeDiamondPickaxe;
		public static Item FakeDiamondAxe;
		public static Item FakeDiamondHoe;
		public static Item FakeDiamondShovel;
		public static Item FakeDiamondSword;
		static ToolMaterial FakeDiamondToolMaterial = EnumHelper.addToolMaterial("FakeDiamondToolMaterial", 3, 1561, 8.0F, 3.0F, 10);
		
	    
		public static void RegisterFakeDiamondTools(){
			
			FakeDiamondPickaxe = new ItemFakeDiamondPickaxe(FakeDiamondToolMaterial);
	    	RegisterHelper.registerItem(FakeDiamondPickaxe);
	    	
	    	FakeDiamondAxe = new ItemFakeDiamondAxe(FakeDiamondToolMaterial);
	    	RegisterHelper.registerItem(FakeDiamondAxe);
	    	
	    	FakeDiamondHoe = new ItemFakeDiamondHoe(FakeDiamondToolMaterial);
	    	RegisterHelper.registerItem(FakeDiamondHoe);
	    	
	    	FakeDiamondShovel = new ItemFakeDiamondShovel(FakeDiamondToolMaterial);
	    	RegisterHelper.registerItem(FakeDiamondShovel);
	    	
	    	FakeDiamondSword = new ItemFakeDiamondSword(FakeDiamondToolMaterial);
	    	RegisterHelper.registerItem(FakeDiamondSword);
		}
}
