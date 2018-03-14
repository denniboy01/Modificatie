package com.drago2809.ModNaam;

import com.drago2809.ModNaam.blocks.ModBlocks;
import com.drago2809.ModNaam.crafting.ModCrafting;
import com.drago2809.ModNaam.items.ModItems;
import com.drago2809.ModNaam.world.TutorialWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.createItems(); // item
    	ModBlocks.createBlocks(); //block

    }

    public void init(FMLInitializationEvent e) {
    	
    	ModCrafting.addRecipes();
    	
    	GameRegistry.registerWorldGenerator(new TutorialWorldGen(), 0);

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}