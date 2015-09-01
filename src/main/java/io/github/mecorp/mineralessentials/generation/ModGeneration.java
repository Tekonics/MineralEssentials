package io.github.mecorp.mineralessentials.generation;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModGeneration
{
	public static OreGeneration OreGen = new OreGeneration();

	public static void loadGeneration(){
	GameRegistry.registerWorldGenerator(OreGen, 1);
	}
}
