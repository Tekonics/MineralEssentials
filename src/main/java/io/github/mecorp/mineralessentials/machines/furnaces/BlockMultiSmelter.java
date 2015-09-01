package io.github.mecorp.mineralessentials.machines.furnaces;

import io.github.mecorp.mineralessentials.MineralEssentials;
import io.github.mecorp.mineralessentials.client.gui.GUIs;
import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

/**
 * Created by untamemadman on 23/11/2014.
 */

public class BlockMultiSmelter extends BlockContainer implements ITileEntityProvider
{
    public IIcon[] icons = new IIcon[6];

    public BlockMultiSmelter()
    {
        super(Material.rock);
		setBlockName("MultiSmelterBlock");
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabMECorp.MECorp);
        setStepSound(soundTypePiston);
        setHardness(3.5F);
        setResistance(10.0F);
        setHarvestLevel("pickaxe", 1);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg)
    {
        for (int i = 0; i < 6; i ++) {
            //this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
            if (i == 3)
            {
                this.icons[i] = reg.registerIcon(this.textureName);
            }
            else
            {
                this.icons[i] = reg.registerIcon(this.textureName + "_side");
            }
        }
    }

    @Override
    public IIcon getIcon(int side, int meta)
    {
        return this.icons[side];
    }

    @Override
    public TileEntity createNewTileEntity(World world, int meta)
    {
        return new TileEntityMultiSmelterBlock();
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ) {
        if(world.isRemote) {
            if (world.getTileEntity(x, y, z) != null)
                player.openGui(MineralEssentials.instances, GUIs.MultiSmelter.ordinal(), world, x, y, z);
            return true;
        }
        return true;
    }
}
