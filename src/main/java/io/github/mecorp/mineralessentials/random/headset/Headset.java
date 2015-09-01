package io.github.mecorp.mineralessentials.random.headset;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Sam on 8/25/2014.
 */
public class Headset
{
    static ItemArmor.ArmorMaterial HeadsetArmorMaterial = EnumHelper.addArmorMaterial("HeadsetArmorMaterial", 1, new int[]{5, 0, 0, 0}, 0);

    public static Item Headset;

    public static void RegisterHeadset()
    {
        Headset = new ItemHeadset(HeadsetArmorMaterial, 0, "Headset");
        RegisterHelper.registerItem(Headset);
    }
}
