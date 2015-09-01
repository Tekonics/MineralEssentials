package io.github.mecorp.mineralessentials.crystal.earthcrystal.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class EarthCrystalTools {

		public static Item EarthCrystalPickaxe;
		public static Item EarthCrystalAxe;
		public static Item EarthCrystalHoe;
		public static Item EarthCrystalShovel;
		public static Item EarthCrystalSword;
		static ToolMaterial EarthCrystalToolMaterial = EnumHelper.addToolMaterial("EarthCrystalToolMaterial", 4, 1500, 8.0F, 20.0F, 29);
		
	    
		public static void RegisterEarthCrystalTools(){

            EarthCrystalPickaxe = new ItemEarthCrystalPickaxe(EarthCrystalToolMaterial);
	    	RegisterHelper.registerItem(EarthCrystalPickaxe);

            EarthCrystalAxe = new ItemEarthCrystalAxe(EarthCrystalToolMaterial);
	    	RegisterHelper.registerItem(EarthCrystalAxe);

            EarthCrystalHoe = new ItemEarthCrystalHoe(EarthCrystalToolMaterial);
	    	RegisterHelper.registerItem(EarthCrystalHoe);

            EarthCrystalShovel = new ItemEarthCrystalShovel(EarthCrystalToolMaterial);
	    	RegisterHelper.registerItem(EarthCrystalShovel);

            EarthCrystalSword = new ItemEarthCrystalSword(EarthCrystalToolMaterial);
	    	RegisterHelper.registerItem(EarthCrystalSword);
		}
}
