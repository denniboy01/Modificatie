package com.drago2809.ModNaam.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Bootstrap;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	// materials
	// public static ToolMaterial Tutorial = EnumHelper.addToolMaterial("Naam materiaal van gereedschap", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	public static ToolMaterial Tutorial = EnumHelper.addToolMaterial("TUTORIAL", 2, 1561, 8.0F, 7.0F, 10);
	public static ToolMaterial Max = EnumHelper.addToolMaterial("MAX", 999999999, 999999999, 99999999999999999999999999999999999999F, 99999999999999999999999999999999999999F, 999999999);
	
	// minerals
	public static Item copperIngot;// copper ingot
	public static Item silicon;//silicon
	public static Item steelIngot;// steel ingot
	public static Item aluminum;// aluminum
	public static Item lithiumIngot;// lithium ingot
	
	// plates
	public static Item ironPlate;// iron plate
	public static Item diamondPlate;// diamond plate
	public static Item woodenPlate;// wooden Plate
	public static Item steelPlate;// steel plate
	public static Item copperPlate;// copper plate
	public static Item aluminumPlate;// aluminum plate
	public static Item siliconPlate; // silicon plate
	
	// gears
	public static Item ironGear;// iron gear
	public static Item diamondGear;// diamond gear
	public static Item steelGear;// steel gear
	
	// electric parts
	public static Item battery;// battery
	public static Item electricity;// electricity  
	
	// compressor
	public static Item compressorBottom;// compressor part bottom
	public static Item compressorTop;// compressor part top
	public static Item compressorBasisDiamondGear;// compressor basis met diamond gear
	public static Item compressorBasisIronGear;// compressor basis met iron gear
	public static Item compressorBasisSteelGear;// compressor basis met steel gear

	// tools
	public static Item hammer;// hammer
	public static Item wrench;// wrench
	
	// handleiding
	public static Item naamVoorwerp;// naam van het voorwerp
	
	// tutorial
	public static Item tutorialSword;// tutorial sword
	public static Item tutorialSpade;// tutorial spade
	public static Item tutorialHoe;// tutorial hoe
	public static Item tutorialAxe;// tutorial axe
	public static Item chainsaw;// chainsaw
	public static Item tutorialPickaxe;// tutorial pickaxe
	public static Item momSword;// mom sword
	public static Item tutorialItem;// tutorial item
	
	public static void createItems() {
		
		// minerals
		GameRegistry.registerItem(copperIngot = new BasicItem("copper_ingot"), "copper_ingot");// copper ingot
		GameRegistry.registerItem(silicon = new BasicItem("silicon"), "silicon");// silicon
		GameRegistry.registerItem(steelIngot = new BasicItem("steel_ingot"), "steel_ingot");// steel ingot
		GameRegistry.registerItem(aluminum = new BasicItem("aluminum"), "aluminum");// aluminum
		GameRegistry.registerItem(lithiumIngot = new BasicItem("lithium_ingot"), "lithium_ingot");// lithium ingot

		// plates
		GameRegistry.registerItem(ironPlate = new BasicItem("iron_plate"), "iron_plate");// iron plate
		GameRegistry.registerItem(diamondPlate = new BasicItem("diamond_plate"), "diamond_plate");// diamond plate
		GameRegistry.registerItem(woodenPlate = new BasicItem("wooden_plate"), "wooden_plate");// wooden plate
		GameRegistry.registerItem(steelPlate = new BasicItem("steel_plate"), "steel_plate");// steel plate
		GameRegistry.registerItem(copperPlate = new BasicItem("copper_plate"), "copper_plate");// copper plate
		GameRegistry.registerItem(aluminumPlate = new BasicItem("aluminum_plate"), "aluminum_plate");// aluminum plate
		GameRegistry.registerItem(siliconPlate = new BasicItem("silicon_plate"), "silicon_plate");// silicon plate
		
		// gears
		GameRegistry.registerItem(ironGear = new BasicItem("iron_gear"), "iron_gear");// iron gear
		GameRegistry.registerItem(diamondGear = new BasicItem("diamond_gear"), "diamond_gear");// diamond gear
		GameRegistry.registerItem(steelGear = new BasicItem("steel_gear"), "steel_gear");// steel gear
		
		// electric parts
		GameRegistry.registerItem(battery = new BasicItem("battery"), "battery");// battery 
		GameRegistry.registerItem(electricity = new ItemElectricity("electricity"), "electricity");// electricity
		
		// compressor
		GameRegistry.registerItem(compressorBottom = new BasicItem("compressor_bottom"), "compressor_bottom");// compressor part bottom
		GameRegistry.registerItem(compressorTop = new BasicItem("compressor_top"), "compressor_top");// compressor part top
		GameRegistry.registerItem(compressorBasisDiamondGear = new BasicItem("compressor_basis_diamond_gear"), "compressor_basis_diamond_gear");// compressor basis met diamond gear
		GameRegistry.registerItem(compressorBasisIronGear = new BasicItem("compressor_basis_iron_gear"), "compressor_basis_iron_gear");// compressor basis met iron gear
		GameRegistry.registerItem(compressorBasisSteelGear = new BasicItem("compressor_basis_steel_gear"), "compressor_basis_steel_gear");// compressor basis met steel gear

		// tools
		GameRegistry.registerItem(hammer = new BasicItem("hammer"), "hammer");// hammer
		GameRegistry.registerItem(wrench = new BasicItem("wrench"), "wrench");// wrench


		
		//handleiding
		GameRegistry.registerItem(naamVoorwerp = new BasicItemHandleiding("naam_voorwerp"), "naam_voorwerp");// naam van het voorwerp

		
		//tutorial
		GameRegistry.registerItem(tutorialItem = new BasicItemHandleiding("tutorial_item"), "tutorial_item");// tutorial item
		GameRegistry.registerItem(tutorialSword = new ItemModSword("tutorial_sword", Tutorial), "tutorial_sword");// tutorial sword
		GameRegistry.registerItem(tutorialSpade = new ItemModSpade("tutorial_spade", Tutorial), "tutorial_spade");// tutorial spade
		GameRegistry.registerItem(tutorialHoe = new ItemModHoe("tutorial_hoe", Tutorial), "tutorial_hoe");// tutorial hoe
		//GameRegistry.registerItem(tutorialAxe = new ItemModChainsaw("tutorial_axe", Tutorial), "tutorial_axe");// tutorial axe
		//GameRegistry.registerItem(tutorialAxe = new ItemModAxe(Tutorial), "tutorial_axe");// tutorial axe
		GameRegistry.registerItem(tutorialPickaxe = new ItemModPickaxe("tutorial_pickaxe", Tutorial), "tutorial_pickaxe");// tutorial pickaxe
		GameRegistry.registerItem(momSword = new ItemModSword("mom_sword", Tutorial), "mom_sword");// mom sword
		//GameRegistry.registerItem(tutorialAxe = new BasicItem("tutorial_axe"), "tutorial_axe");// tutorial axe
		
			
		}
	//creative tab picture
	public static final CreativeTabs tabModNaam = new CreativeTabs("EnergyTech") {
		@Override public Item getTabIconItem() {
			return ModItems.electricity;
		}
	};
}
	/* private static Item getRegisteredItem(String name)
	    {
	  Item item = (Item)Item.REGISTRY.getObject(new ResourceLocation(name));

      if (item == null)
      {
          throw new IllegalStateException("Invalid Item requested: " + name);
      }
      else
      {
          return item;
      }
  }

  static
  {
      if (!Bootstrap.isRegistered())
      {
          throw new RuntimeException("Accessed Items before Bootstrap!");
      }
      else
      {
    	  ELECTRICITY = getRegisteredItem("electricity");  
      }
  }}
*/

