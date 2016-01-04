package io.github.mecorp.mineralessentials.random.wings;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import io.github.mecorp.mineralessentials.random.labcoat.ItemLabcoat;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by untamemadman on 28/10/2015.
 */

public class Wings
{

    static ItemArmor.ArmorMaterial WingsMaterial = EnumHelper.addArmorMaterial("WingsArmorMaterial", 50, new int[]{5, 10, 8, 5}, 50);
    public static Item WingsChestplate;

    public static void RegisterWings()
    {
        WingsChestplate = new ItemLabcoat(WingsMaterial, 1, "WingsChestplate");
        RegisterHelper.registerItem(WingsChestplate);
    }
}
