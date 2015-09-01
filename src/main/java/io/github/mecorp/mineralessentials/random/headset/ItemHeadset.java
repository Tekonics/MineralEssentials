package io.github.mecorp.mineralessentials.random.headset;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by Sam on 8/25/2014.
 */
public class ItemHeadset extends ItemArmor
{
    public ItemHeadset(ArmorMaterial material, int armorType, String name)
    {
        super(material, 0, armorType);
        setUnlocalizedName(name);
        setTextureName(Reference.MOD_ID.toLowerCase() + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabMECorp.MECorp);
    }

    /*
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack armor)
    {
        if(!world.isRemote)
        {
            player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 2, 1, true));
        }
    }
    */
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return false;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem()== Headset.Headset)
        {
            return Reference.MOD_ID + ":models/armor/Headset.png";
        }
        else
        {
            return null;
        }
    }
}