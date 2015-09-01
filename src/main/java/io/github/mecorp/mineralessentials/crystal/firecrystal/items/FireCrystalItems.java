package io.github.mecorp.mineralessentials.crystal.firecrystal.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class FireCrystalItems
{
	public static Item FireCrystalCrystal;
	public static Item BlazeBlob;
	
	public static void RegisterFireCrystalItems()
	{
		FireCrystalCrystal = new ItemFireCrystalCrystal();
    	RegisterHelper.registerItem(FireCrystalCrystal);
        OreDictionary.registerOre("gemFireCrystal", new ItemStack(FireCrystalCrystal));
    	
    	BlazeBlob = new ItemBlazeBlob();
    	RegisterHelper.registerItem(BlazeBlob);
	}
}
