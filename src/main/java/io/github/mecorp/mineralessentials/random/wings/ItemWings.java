package io.github.mecorp.mineralessentials.random.wings;

import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;


/**
 * Created by untamemadman on 28/10/2015.
 */

public class ItemWings extends ItemArmor
{
        public ItemWings(ArmorMaterial material, int armorType, String name)
        {
            super(material, 0, armorType);
            setUnlocalizedName(name);
            setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
        {
            if(stack.getItem() == Wings.WingsChestplate)
            {
                return Reference.MOD_ID + ":models/armor/Wings1.png";
            }
            else
            {
                System.out.println("Invalid Item ItemWings");
                return null;
            }
        }
        @Override
        public CreativeTabs getCreativeTab()
        {
            return CreativeTabMECorp.MECorp;
        }
    }