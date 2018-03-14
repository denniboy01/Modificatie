package com.drago2809.ModNaam.blocks;

import com.drago2809.ModNaam.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	// ores
	public static Block aluminumOre;// aluminum ore
	public static Block lithiumOre;// lithium ore
	public static Block copperOre;// copper ore
	public static Block siliconOre;// silicon ore
	// blocks
	
	public static Block tutorialBlock;// tutorial block
	public static Block copperBlock;// copper block
	public static Block siliconBlock;// silicon block
	public static Block steelBlock;// steel block
	public static Block aluminumBlock;// aluminum block
	public static Block lithiumBlock;// lithium block

	
	
	// handleiding
	public static Block naamBlok;// naamBlok = naam van het blok invullen
	
	// tutorial
	public static Block tutorialMultiOre;// tutorial multi ore
	
	
	public static void createBlocks() {
		
		// ores
		GameRegistry.registerBlock(copperOre = new ModBlockCopperOre("copper_ore", Material.IRON), "copper_ore");// copper ore
		GameRegistry.registerBlock(siliconOre = new ModBlockAluminumOre("silicon_ore", Material.IRON), "silicon_ore"); // silicon ore
		GameRegistry.registerBlock(aluminumOre = new ModBlockAluminumOre("aluminum_ore", Material.IRON), "aluminum_ore"); // aluminium ore
		GameRegistry.registerBlock(lithiumOre = new ModBlockLithiumOre("lithium_ore", Material.IRON), "lithium_ore"); // lithium ore
	
		// blocks
		GameRegistry.registerBlock(copperBlock = new BasicBlock("copper_block"), "copper_block"); // copper block
		GameRegistry.registerBlock(siliconBlock = new BasicBlock("silicon_block"), "silicon_block"); // silicon block
		GameRegistry.registerBlock(steelBlock = new BasicBlock("steel_block"), "steel_block");// steel block
		GameRegistry.registerBlock(aluminumBlock = new BasicBlock("aluminum_block"), "aluminum_block"); // aluminium block
		GameRegistry.registerBlock(lithiumBlock = new BasicBlock( "lithium_block"), "lithium_block");// lithium block

		
		// handleiding
		GameRegistry.registerBlock(naamBlok = new BasicBlockHandleiding("naam_blok"), "naam_blok");// naam_blok =naam van het blok invullen
		
		// tutorial
		GameRegistry.registerBlock(tutorialBlock = new BasicBlockHandleiding("tutorial_block").setLightLevel(1.0f), "tutorial_block");// tutorial block
		GameRegistry.registerBlock(tutorialMultiOre = new ModBlockMultiOre("tutorial_multi_ore", Material.IRON), "tutorial_multi_ore");// tutorial multi ore
	}
	/*public static final CreativeTabs tabHandleiding = new CreativeTabs("handleiding") {
		@Override public Item getTabIconItem() {
			return ModItems.naamVoorwerp;
		}
	};*/
}
