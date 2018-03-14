package com.drago2809.ModNaam.items;

import com.drago2809.ModNaam.Main;
import com.drago2809.ModNaam.blocks.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemModPickaxe extends ItemPickaxe{

	public ItemModPickaxe(String unlocalizedName, ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setTextureName(Main.MODID + ":" + unlocalizedName);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS); // placing the item in creative tab
	}

	private void setTextureName(String string) {
		
		
	}
}
