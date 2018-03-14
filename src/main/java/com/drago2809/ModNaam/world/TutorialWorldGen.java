package com.drago2809.ModNaam.world;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

import com.drago2809.ModNaam.blocks.ModBlocks;

public class TutorialWorldGen implements IWorldGenerator {
	
	@Override
	public void generate(Random rnd, int chunk_X, int chunk_Z, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
	
		switch (world.provider.getDimension()) {
		case 0: // Overworld
			
			// ores
			this.runGenerator(this.gen_copper_ore, world, rnd, chunk_X, chunk_Z, 80, 0, 64); //80=%, 0=minHeight, 64=maxHeight
			this.runGenerator(this.gen_silicon_ore, world, rnd, chunk_X, chunk_Z, 80, 0, 64); //80=%, 0=minHeight, 64=maxHeight
			this.runGenerator(this.gen_aluminum_ore, world, rnd, chunk_X, chunk_Z, 80, 0, 64); //80=%, 0=minHeight, 64=maxHeight
			this.runGenerator(this.gen_lithium_ore, world, rnd, chunk_X, chunk_Z, 80, 0, 64); //80=%, 0=minHeight, 64=maxHeight
			
			// handleiding
			this.runGenerator(this.gen_naam_blok, world, rnd, chunk_X, chunk_Z, 80, 0, 64); //80=%, 0=minHeight, 64=maxHeight

			break;
		
		case 1: // End
			
			break;
			
		case -1: // Nether
		
			break;
		}
	
	}
	
	// ores
	private WorldGenerator gen_copper_ore;
	private WorldGenerator gen_silicon_ore;
	private WorldGenerator gen_aluminum_ore;
	private WorldGenerator gen_lithium_ore;
	
	// naam blok
	private WorldGenerator gen_naam_blok;
	
	public TutorialWorldGen() {
		
		// ores
		this.gen_copper_ore = new WorldGenMinable(ModBlocks.copperOre.getDefaultState(), 10); //copper ore, max vein = 10
		this.gen_silicon_ore = new WorldGenMinable(ModBlocks.siliconOre.getDefaultState(), 10); //silicon ore, max vein = 10
		this.gen_aluminum_ore = new WorldGenMinable(ModBlocks.aluminumOre.getDefaultState(), 10); //aluminum ore, max vein = 10
		this.gen_lithium_ore = new WorldGenMinable(ModBlocks.lithiumOre.getDefaultState(), 10); // lithium ore, max vein = 10
		
		// handleiding
		this.gen_naam_blok = new WorldGenMinable(ModBlocks.naamBlok.getDefaultState(), 10); // naam van het blok dat je natuurlijk gegenereerd wilt hebben, max vein = 10
	}

	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
		
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i <chancesToSpawn; i ++) {
			int x = chunk_X * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z * 16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y, z));
		}
	}
	
}
