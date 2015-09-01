package io.github.mecorp.mineralessentials.creative.items;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;

/**
 * Created by untamemadman on 13/11/2014.
 */

public class CreativeItems
{
    public static Item MECorp;

    public static void RegisterCreativeItems()
    {
        MECorp = new ItemMECorp();
        RegisterHelper.registerItem(MECorp);
    }
}
