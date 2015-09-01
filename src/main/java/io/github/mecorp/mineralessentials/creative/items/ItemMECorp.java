package io.github.mecorp.mineralessentials.creative.items;

import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.item.Item;

/**
 * Created by untamemadman on 13/11/2014.
 */

public class ItemMECorp extends Item
{
    public ItemMECorp()
    {
        super();
        setUnlocalizedName("MECorp");
        setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }
}
