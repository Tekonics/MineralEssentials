package io.github.mecorp.mineralessentials.glass.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.helper.ConnectedTextures;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

/**
 * Created by untamemadman on 12/10/2014.
 */
public class BlockGlassBlock extends ConnectedTextures
{

    public BlockGlassBlock(String name, String path)
    {
        super(Material.glass, path, Reference.MOD_ID);
		setBlockName(name);
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabMECorp.MECorp);
        setStepSound(soundTypeGlass);
        setHardness(5.0F);
        setResistance(10.0F);
        this.FblockConnectionAllowed = new Block[]{this, Blocks.glass};
        this.Falone=0;
        this.Fjust1=1;
        this.Fcorner=5;
        this.FinLine=9;
        /*this.Falone=0;
        this.Fsurrounded=1;
        this.FinLine=8;
        this.Fedge3=2;
        this.Fcorner=12;
        this.Fjust1=13;
        */
        // 1) Fsurrounded and Falone
        // 2) Fedge3
        // 3) FinLine
        // 4) Fcorner
        // 5) Fjust1
    }
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }

    public boolean isOpaqueCube ()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
}