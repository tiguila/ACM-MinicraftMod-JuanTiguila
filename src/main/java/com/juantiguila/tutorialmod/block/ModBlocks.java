package com.juantiguila.tutorialmod.block;

import com.juantiguila.tutorialmod.TutorialMod;
import com.juantiguila.tutorialmod.init.TabInit;
import com.juantiguila.tutorialmod.item.ModItems;
import com.google.common.base.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MODID);
	
	 public static final RegistryObject<Block> ACM_BLOCK = register("acm_block",
	            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()),
	                  new Item.Properties().tab(TabInit.TUTORIAL_TAB));
	 
    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }


}
