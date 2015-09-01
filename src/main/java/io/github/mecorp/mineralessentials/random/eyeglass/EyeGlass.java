package io.github.mecorp.mineralessentials.random.eyeglass;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Sam on 8/25/2014.
 */
public class EyeGlass
{
    static ItemArmor.ArmorMaterial EyeGlassMaterial = EnumHelper.addArmorMaterial("EyeGlassMaterial", 1, new int[]{5, 0, 0, 0}, 0);

    public static Item EyeGlass;

    public static void RegisterEyeGlass()
    {
        EyeGlass = new ItemEyeGlass(EyeGlassMaterial, 0, "EyeGlass");
        RegisterHelper.registerItem(EyeGlass);
    }
}
