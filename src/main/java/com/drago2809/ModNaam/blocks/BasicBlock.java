package com.drago2809.ModNaam.blocks;

import com.drago2809.ModNaam.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BasicBlock extends Block {

    public BasicBlock(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ModItems.tabModNaam); // placing the block in creative tab
        this.setHardness(hardness); // setting the hardness of the block
        this.setResistance(resistance);// setting the hardness of the block
    }

    public BasicBlock(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.ROCK, hardness, resistance);
    }

    public BasicBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }
}