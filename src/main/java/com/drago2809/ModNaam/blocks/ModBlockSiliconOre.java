package com.drago2809.ModNaam.blocks;

import java.util.ArrayList;


import com.drago2809.ModNaam.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class ModBlockSiliconOre extends Block {

    public ModBlockSiliconOre(String unlocalizedName, Material material) {
        super(material); 
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ModItems.tabModNaam);
        this.setHardness(10.0f);
        this.setResistance(20.0f);
        this.setHarvestLevel("pickaxe", 1);
    }

    @Override
    public ArrayList getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
        ArrayList drops = new ArrayList();
        drops.add(new ItemStack(ModBlocks.copperOre));
        return drops;
    }
}