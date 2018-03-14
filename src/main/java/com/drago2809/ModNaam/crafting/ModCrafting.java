package com.drago2809.ModNaam.crafting;

import com.drago2809.ModNaam.blocks.ModBlocks;
import com.drago2809.ModNaam.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModCrafting {
 
public static void addRecipes() {
	
	// shaped crafting
	// blocks
	GameRegistry.addRecipe(new ItemStack(ModBlocks.copperBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.copperIngot});// 9 copper ingots -> copper block
	GameRegistry.addRecipe(new ItemStack(ModBlocks.siliconBlock, 1), new Object[] {"###", "# #", "###", '#', ModItems.silicon});// 8 silicon -> silicon block
	GameRegistry.addRecipe(new ItemStack(ModBlocks.steelBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.steelIngot});// 9 steel ingots -> steel block
	GameRegistry.addRecipe(new ItemStack(ModBlocks.aluminumBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.aluminum});// 9 aluminum -> aluminum block
	GameRegistry.addRecipe(new ItemStack(ModBlocks.lithiumBlock, 1), new Object[] {"###", "###", "###", '#', ModItems.lithiumIngot});// 9 lithium ingots -> lithium block
	
	// gears
	GameRegistry.addRecipe(new ItemStack(ModItems.ironGear, 1), new Object[] {"# #", " $ ", "# #", '#', ModItems.ironPlate, '$', Items.IRON_INGOT});// 4 iron plates + iron ingot -> iron gear
	GameRegistry.addRecipe(new ItemStack(ModItems.diamondGear, 1), new Object[] {"# #", " $ ", "# #", '#', ModItems.diamondPlate, '$', ModItems.steelGear});// 4 diamond plates + steel gear -> diamond gear
	GameRegistry.addRecipe(new ItemStack(ModItems.steelGear, 1), new Object[] {"# #", " $ ", "# #", '#', ModItems.steelPlate, '$', ModItems.ironGear});// 4 steel plates + iron gear -> steel gear
	
	// electric parts
	GameRegistry.addRecipe(new ItemStack(ModItems.battery, 1), new Object[] {" $ ", "%#%", "%%%", '#', ModItems.lithiumIngot, '$', ModItems.copperPlate, '%', Items.IRON_INGOT});// 5 iron ingots + lithium ingot + copper ingot -> battery
	GameRegistry.addRecipe(new ItemStack(ModItems.compressorBasisIronGear, 1), new Object[] {" # ", "!@$", " & ", '#', ModItems.compressorTop, '!', ModItems.battery, '@', ModItems.ironGear, '$', Items.REDSTONE, '&', ModItems.compressorBottom});
	GameRegistry.addRecipe(new ItemStack(ModItems.compressorBasisSteelGear, 1), new Object[] {" # ", "!@$", " & ", '#', ModItems.compressorTop, '!', ModItems.battery, '@', ModItems.steelGear, '$', Items.REDSTONE, '&', ModItems.compressorBottom});
	GameRegistry.addRecipe(new ItemStack(ModItems.compressorBasisDiamondGear, 1), new Object[] {" # ", "!@$", " & ", '#', ModItems.compressorTop, '!', ModItems.battery, '@', ModItems.diamondGear, '$', Items.REDSTONE, '&', ModItems.compressorBottom});
	
	// compressor
	GameRegistry.addRecipe(new ItemStack(ModItems.compressorBottom, 1), new Object[] {"   ", "   ", "###", '#', ModItems.steelPlate});// 3 iron plate -> compressor bottom
	GameRegistry.addRecipe(new ItemStack(ModItems.compressorBottom, 1), new Object[] {"   ", "###", "   ", '#', ModItems.steelPlate});// 3 iron plate -> compressor bottom
	GameRegistry.addRecipe(new ItemStack(ModItems.compressorBottom, 1), new Object[] {"###", "   ", "   ", '#', ModItems.steelPlate});// 3 iron plate -> compressor bottom
	GameRegistry.addRecipe(new ItemStack(ModItems.compressorTop, 1), new Object[] {" # ", "###", "   ", '#', ModItems.steelPlate});// 4 iron plates -> compressor top
	GameRegistry.addRecipe(new ItemStack(ModItems.compressorTop, 1), new Object[] {"   ", " # ", "###", '#', ModItems.steelPlate});// 4 iron plates -> compressor top
	
	// tools
	GameRegistry.addRecipe(new ItemStack(ModItems.hammer, 1), new Object[] {" # ", " $#", "$  ", '#', ModItems.steelIngot, '$', Items.STICK});// 2 sticks + 2 steel ingots-> hammer
	GameRegistry.addRecipe(new ItemStack(ModItems.wrench, 1), new Object[] {" # ", " ##", "$  ", '#', ModItems.ironPlate, '$', ModItems.copperIngot});
	
	//SOLAR PANEL
	GameRegistry.addRecipe(new ItemStack(Blocks.SOLAR_PANEL, 1), new Object[] {"###", "$%$", "@@@", '#', ModItems.siliconPlate, '$', Items.REDSTONE, '%', ModItems.battery, '@', ModItems.aluminumPlate});
	
	
	// handleiding
	GameRegistry.addRecipe(new ItemStack(ModBlocks.naamBlok, 1), new Object[] {"###", "###", "###", '#', ModItems.naamVoorwerp});// naam van het voorwerp -> naam van het blok (tussen{} staat het recept)
	
	// tutorial
	GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock, 1), new Object[] {"##", "##", '#', ModItems.tutorialItem});// 4 tutorial item -> tutorial block

	
	// shapeless crafting
	// minerals
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperIngot, 9), new Object[] { ModBlocks.copperBlock});// copper block -> 9 copper ingots
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.silicon, 8), new Object[] { ModBlocks.siliconBlock});// silicon block -> 8 silicon
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steelIngot, 9), new Object[] { ModBlocks.steelBlock});// steel block-> 9 steel ingots
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steelIngot, 1), new Object[] { Items.COAL, Items.IRON_INGOT});// coal + iron ingot-> steel ingot
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aluminum, 9), new Object[] { ModBlocks.aluminumBlock});// aluminum block-> 9 aluminum 
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.lithiumIngot, 9), new Object[] { ModBlocks.lithiumBlock});// lithium block -> 9 lithium ingots
	
	// plates
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironPlate, 1), new Object[] { ModItems.hammer, Items.IRON_INGOT});// hammer + iron ingot -> iron plate
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diamondPlate, 1), new Object[] { ModItems.hammer, Items.DIAMOND});// hammer + diamond -> diamond plate
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.woodenPlate, 1), new Object[] { ModItems.hammer, Blocks.PLANKS});// hammer + planks -> wooden plate
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.copperPlate, 1), new Object[] { ModItems.hammer, ModItems.copperIngot});// hammer + copper ingot -> copper plate
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.steelPlate, 1), new Object[] { ModItems.hammer, ModItems.steelIngot});// hammer + steel ingot -> steel plate
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.siliconPlate, 1), new Object[] { ModItems.hammer, ModItems.silicon});// hammer + silicon -> silicon plate
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aluminumPlate, 1), new Object[] { ModItems.hammer, ModItems.aluminum});// hammer + aluminum -> aluminum plate
	
	
	// handleiding
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.naamVoorwerp, 9), new Object[] {ModBlocks.naamBlok});// naam van het blok -> 9 naam van het voorwerp (9 is het aantal eenheden van het voorwerp)
	
	// tutorial
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem, 4), new Object[] { ModBlocks.tutorialBlock});// tutorial block -> 4 tutorial item
	
	
	// smelting recipes
	// ores
	GameRegistry.addSmelting(ModBlocks.copperOre, new ItemStack(ModItems.copperIngot, 1), 0.7F);// copper ore -> copper ingot
	GameRegistry.addSmelting(ModBlocks.siliconOre, new ItemStack(ModItems.silicon, 1), 0.7F);// silicon ore -> silicon
	GameRegistry.addSmelting(ModBlocks.aluminumOre, new ItemStack(ModItems.aluminum, 1), 0.7F);// aluminum ore -> aluminum
	GameRegistry.addSmelting(ModBlocks.lithiumOre, new ItemStack(ModItems.lithiumIngot, 1), 0.7F);// lithium ore -> lithium ingot
	
	
	//handleiding	
	GameRegistry.addSmelting(ModBlocks.naamBlok, new ItemStack(ModItems.naamVoorwerp, 1), 1F);// naam van het blok dat gesmolten moet worden -> naam voorwerp als output
	}

}