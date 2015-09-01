package io.github.mecorp.mineralessentials.creative.tools;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class CreativeTools {

	public static Item CreativePickaxe;
	public static Item CreativeAxe;
	public static Item CreativeHoe;
	public static Item CreativeShovel;
	public static Item CreativeSword;
	static ToolMaterial CreativeToolMaterial = EnumHelper.addToolMaterial("CreativeToolMaterial", 100, -1, 1000.0F, 1000.0F, 50);
		
	    
	public static void RegisterCreativeTools()
	{

		CreativePickaxe = new ItemCreativePickaxe (CreativeToolMaterial);
		RegisterHelper.registerItem(CreativePickaxe);

		CreativeAxe = new ItemCreativeAxe(CreativeToolMaterial);
		RegisterHelper.registerItem(CreativeAxe);

		CreativeHoe = new ItemCreativeHoe(CreativeToolMaterial);
		RegisterHelper.registerItem(CreativeHoe);

		CreativeShovel = new ItemCreativeShovel(CreativeToolMaterial);
		RegisterHelper.registerItem(CreativeShovel);

		CreativeSword = new ItemCreativeSword(CreativeToolMaterial);
		RegisterHelper.registerItem(CreativeSword);
	}
}
