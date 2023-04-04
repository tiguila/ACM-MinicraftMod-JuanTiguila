package com.juantiguila.tutorialmod.init;

import com.juantiguila.tutorialmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TabInit {
	public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab("my_tab") {

		@Override
		public ItemStack makeIcon() {

			return new ItemStack(ModBlocks.ACM_BLOCK.get());
		}
	};
}