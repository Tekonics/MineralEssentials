package io.github.mecorp.mineralessentials.creative;

import io.github.mecorp.mineralessentials.creative.blocks.CreativeModBlocks;
import io.github.mecorp.mineralessentials.creative.items.CreativeItems;
import io.github.mecorp.mineralessentials.creative.tools.CreativeTools;

public class Creative {
	public static void RegisterCreative(){
		CreativeModBlocks.loadCreativeBlocks();
        CreativeItems.RegisterCreativeItems();
		CreativeTools.RegisterCreativeTools();
	}
}