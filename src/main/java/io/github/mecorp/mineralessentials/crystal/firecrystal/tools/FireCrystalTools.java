package io.github.mecorp.mineralessentials.crystal.firecrystal.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class FireCrystalTools {

		public static Item FireCrystalPickaxe;
		public static Item FireCrystalAxe;
		public static Item FireCrystalHoe;
		public static Item FireCrystalShovel;
		public static Item FireCrystalSword;
		static ToolMaterial FireCrystalToolMaterial = EnumHelper.addToolMaterial("FireCrystalToolMaterial", 4, 1500, 8.0F, 20.0F, 29);
		
	    
		public static void RegisterFireCrystalTools(){
			
			FireCrystalPickaxe = new ItemFireCrystalPickaxe(FireCrystalToolMaterial);
	    	RegisterHelper.registerItem(FireCrystalPickaxe);
	    	
	    	FireCrystalAxe = new ItemFireCrystalAxe(FireCrystalToolMaterial);
	    	RegisterHelper.registerItem(FireCrystalAxe);
	    	
	    	FireCrystalHoe = new ItemFireCrystalHoe(FireCrystalToolMaterial);
	    	RegisterHelper.registerItem(FireCrystalHoe);
	    	
	    	FireCrystalShovel = new ItemFireCrystalShovel(FireCrystalToolMaterial);
	    	RegisterHelper.registerItem(FireCrystalShovel);
	    	
	    	FireCrystalSword = new ItemFireCrystalSword(FireCrystalToolMaterial);
	    	RegisterHelper.registerItem(FireCrystalSword);
		}
}
