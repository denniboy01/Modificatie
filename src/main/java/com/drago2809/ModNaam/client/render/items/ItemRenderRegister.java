package com.drago2809.ModNaam.client.render.items;

import com.drago2809.ModNaam.items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public final class ItemRenderRegister {
	
	public static void registerItemRenderer() {
		
		// minerals
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperIngot, 0, new ModelResourceLocation("dmm:copper_ingot", "inventory"));// tutorial item
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.silicon, 0, new ModelResourceLocation("dmm:silicon", "inventory"));// silicon
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.steelIngot, 0, new ModelResourceLocation("dmm:steel_ingot", "inventory"));// steel ingot
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.aluminum, 0, new ModelResourceLocation("dmm:aluminum", "inventory"));// aluminum
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.lithiumIngot, 0, new ModelResourceLocation("dmm:lithium_ingot", "inventory"));// lithium ingot
		
		// plates
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironPlate, 0, new ModelResourceLocation("dmm:iron_plate", "inventory"));// iron plate
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.diamondPlate, 0, new ModelResourceLocation("dmm:diamond_plate", "inventory"));// diamond plate
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.woodenPlate, 0, new ModelResourceLocation("dmm:wooden_plate", "inventory"));// wooden plate
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.steelPlate, 0, new ModelResourceLocation("dmm:steel_plate", "inventory"));// steel plate
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.copperPlate, 0, new ModelResourceLocation("dmm:copper_plate", "inventory"));// copper plate
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.aluminumPlate, 0, new ModelResourceLocation("dmm:aluminum_plate", "inventory"));// aluminum plate
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.siliconPlate, 0, new ModelResourceLocation("dmm:silicon_plate", "inventory"));// silicon plate
		
		// gears
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.ironGear, 0, new ModelResourceLocation("dmm:iron_gear", "inventory"));// iron gear
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.diamondGear, 0, new ModelResourceLocation("dmm:diamond_gear", "inventory"));// diamond gear
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.steelGear, 0, new ModelResourceLocation("dmm:steel_gear", "inventory"));// steel gear
	
		// electric parts
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.battery, 0, new ModelResourceLocation("dmm:battery", "inventory"));// battery		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.electricity, 0, new ModelResourceLocation("dmm:electricity", "inventory"));// electricity		
		
		// compressor
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.compressorBottom,  0, new ModelResourceLocation("dmm:compressor_bottom", "inventory"));// compressor bottom
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.compressorTop,  0, new ModelResourceLocation("dmm:compressor_top", "inventory"));// compressor top
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.compressorBasisDiamondGear,  0, new ModelResourceLocation("dmm:compressor_basis_diamond_gear", "inventory"));// compressor basis met diamond gear
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.compressorBasisIronGear,  0, new ModelResourceLocation("dmm:compressor_basis_iron_gear", "inventory"));// compressor basis met iron gear
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.compressorBasisSteelGear,  0, new ModelResourceLocation("dmm:compressor_basis_steel_gear", "inventory"));// compressor basis met steel gear
		
		// tools
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.hammer, 0, new ModelResourceLocation("dmm:hammer", "inventory"));// hammer
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.wrench,  0, new ModelResourceLocation("dmm:wrench", "inventory"));// wrench
			
		// handleiding
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.naamVoorwerp, 0, new ModelResourceLocation("dmm:naam_voorwerp", "inventory"));// naam van het voorwerp invullen
			
		// tutorial
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialItem, 0, new ModelResourceLocation("dmm:tutorial_item", "inventory"));// tutorial item
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialSword, 0, new ModelResourceLocation("dmm:tutorial_sword", "inventory"));// tutorial sword
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialSpade, 0, new ModelResourceLocation("dmm:tutorial_spade", "inventory"));// tutorial spade
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialHoe, 0, new ModelResourceLocation("dmm:tutorial_hoe", "inventory"));// tutorial hoe
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialAxe, 0, new ModelResourceLocation("dmm:tutorial_axe", "inventory"));// tutorial axe
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.tutorialPickaxe, 0, new ModelResourceLocation("dmm:tutorial_pickaxe", "inventory"));// tutorial pickaxe
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ModItems.momSword, 0, new ModelResourceLocation("dmm:mom_sword", "inventory"));// mom sword
	
	}
}
	
	

