package io.github.mecorp.mineralessentials.random.glasses;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Sam on 8/25/2014.
 */
public class Glasses
{
    static ItemArmor.ArmorMaterial GlassesArmorMaterial = EnumHelper.addArmorMaterial("GlassesArmorMaterial", 1, new int[]{5, 0, 0, 0}, 0);

    public static Item Glasses;

    public static void RegisterGlasses()
    {
        Glasses = new ItemGlasses(GlassesArmorMaterial, 0, "Glasses");
        RegisterHelper.registerItem(Glasses);
    }
}
