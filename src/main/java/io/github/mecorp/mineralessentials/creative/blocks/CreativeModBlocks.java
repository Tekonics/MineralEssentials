package io.github.mecorp.mineralessentials.creative.blocks;

import io.github.mecorp.mineralessentials.helper.RegisterHelper;
import net.minecraft.block.Block;

public class CreativeModBlocks
{
	public static Block GreenScreen;
	public static Block BlueScreen;
	public static Block RedScreen;
    public static Block RandomBlock;


	public static void loadCreativeBlocks()
	{		
		GreenScreen = new BlockGreenScreen().setBlockName("GreenScreen");
		RegisterHelper.registerBlock(GreenScreen);
		
		BlueScreen = new BlockBlueScreen().setBlockName("BlueScreen");
		RegisterHelper.registerBlock(BlueScreen);
		
		RedScreen = new BlockRedScreen().setBlockName("RedScreen");
		RegisterHelper.registerBlock(RedScreen);

        RandomBlock = new BlockRandomBlock().setBlockName("RandomBlock");
        RegisterHelper.registerBlock(RandomBlock);

	}

}
