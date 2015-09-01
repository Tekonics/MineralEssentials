package io.github.mecorp.mineralessentials.generation;

import java.util.Random;

import cpw.mods.fml.common.Loader;
import io.github.mecorp.mineralessentials.cobalt.ore.CobaltOres;
import io.github.mecorp.mineralessentials.copper.ore.CopperOre;
import io.github.mecorp.mineralessentials.fakediamond.FakeDiamond;
import io.github.mecorp.mineralessentials.fakediamond.ore.FakeDiamondOre;
import io.github.mecorp.mineralessentials.iridium.ore.IridiumOres;
//import io.github.mecorp.mineralessentials.tin.ore.TinOre;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class OreGeneration implements IWorldGenerator
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, random, chunkX*16, chunkZ*16);
		break;
		case 0:
			generateSurface(world, random, chunkX*16, chunkZ*16);
		break;
		case 1:
			generateEnd(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}

	private void generateNether(World world, Random random, int i, int j)
	{
		for (int k = 0; k < 50; k++)
		{
			int chunkX = i + random.nextInt(16);
			int chunkY = random.nextInt(100);
			int chunkZ = j + random.nextInt(16);
			(new WorldGenMinable(IridiumOres.IridiumOre, 15)).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}

	private void generateSurface(World world, Random random, int i, int j)
	{
		for (int k = 0; k < 3; k++)
		{
			int chunkX = i + random.nextInt(16);
			int chunkY = random.nextInt(14);
			int chunkZ = j + random.nextInt(16);
			(new WorldGenMinable(CobaltOres.CobaltOre, 5)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		
		/*for (int k = 0; k < 20; k++)
		{
			int chunkX = i + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = j + random.nextInt(16);
			(new WorldGenMinable(TinOre.TinOre, 10)).generate(world, random, chunkX, chunkY, chunkZ);
		}
		*/
		
		for (int k = 0; k < 20; k++)
		{
			int chunkX = i + random.nextInt(16);
			int chunkY = random.nextInt(64);
			int chunkZ = j + random.nextInt(16);
			(new WorldGenMinable(CopperOre.CopperOre, 10)).generate(world, random, chunkX, chunkY, chunkZ);
		}

		if (Loader.isModLoaded("SolderCraft"))
		{

		}
		else
		{
			for (int k = 0; k < 3; k++)
			{
				int chunkX = i + random.nextInt(16);
				int chunkY = random.nextInt(15);
				int chunkZ = j + random.nextInt(16);
				(new WorldGenMinable(FakeDiamondOre.FakeDiamondOre, 5)).generate(world, random, chunkX, chunkY, chunkZ);
			}
		}
	}
	

	private void generateEnd(World world, Random random, int i, int j)
	{
		
	}

}
