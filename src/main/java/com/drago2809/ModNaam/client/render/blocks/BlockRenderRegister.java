package com.drago2809.ModNaam.client.render.blocks;

import com.drago2809.ModNaam.blocks.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	public static void registerBlockRenderer() {
		
		// ores
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.copperOre), 0, new ModelResourceLocation("dmm:copper_ore", "inventory"));// copper ore
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.siliconOre), 0, new ModelResourceLocation("dmm:silicon_ore", "inventory"));// silicon ore
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.aluminumOre), 0, new ModelResourceLocation("dmm:aluminum_ore", "inventory"));// aluminum ore
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.lithiumOre), 0, new ModelResourceLocation("dmm:lithium_ore", "inventory"));// lithium ore

		// blocks
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.copperBlock), 0, new ModelResourceLocation("dmm:copper_block", "inventory"));// copper block
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.siliconBlock), 0, new ModelResourceLocation("dmm:silicon_block", "inventory"));// silicon block
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.steelBlock), 0, new ModelResourceLocation("dmm:steel_block", "inventory"));// steel block
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.aluminumBlock), 0, new ModelResourceLocation("dmm:aluminum_block", "inventory"));// aluminum block
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.lithiumBlock), 0, new ModelResourceLocation("dmm:lithium_block", "inventory"));// lithium block
		
		// handleiding
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.naamBlok), 0, new ModelResourceLocation("dmm:naam_blok", "inventory"));// naam van het blok invullen
	
		// tutorial
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.tutorialMultiOre), 0, new ModelResourceLocation("dmm:tutorial_multi_ore", "inventory"));// tutorial multi ore
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.tutorialBlock), 0, new ModelResourceLocation("dmm:tutorial_block", "inventory"));// tutorial block
	
	}
	
}
