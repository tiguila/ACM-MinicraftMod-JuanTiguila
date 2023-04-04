package com.juantiguila.tutorialmod.item;

import com.juantiguila.tutorialmod.TutorialMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);

    public static final RegistryObject<Item> ACMIUM = ITEMS.register("acmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));


    public static final RegistryObject<Item> EXAMPLE_HELMET = ITEMS.register("example_helmet",
            () -> new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, new
                    Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));

}