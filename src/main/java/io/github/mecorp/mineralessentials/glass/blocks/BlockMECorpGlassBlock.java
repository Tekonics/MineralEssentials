package io.github.mecorp.mineralessentials.glass.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.mecorp.mineralessentials.creativetabs.CreativeTabMECorp;
import io.github.mecorp.mineralessentials.helper.ConnectedTextures;
import io.github.mecorp.mineralessentials.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by untamemadman on 12/10/2014.
 */
public class BlockMECorpGlassBlock extends ConnectedTextures
{

    public BlockMECorpGlassBlock(String name, String path)
    {
        super(Material.glass, path, Reference.MOD_ID);
        setBlockName(name);
		setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabMECorp.MECorp);
        setStepSound(soundTypeGlass);
        setHardness(5.0F);
        setResistance(10.0F);
        this.FblockConnectionAllowed = new Block[]{this, GlassBlock.ClearGlassBlock};
        this.Falone=0;
        this.Fjust1=1;
        this.Fcorner=5;
        this.FinLine=9;
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