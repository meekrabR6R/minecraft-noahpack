package com.meekrab.noahpack;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by nmiano on 9/11/14.
 */
@Mod(modid = NoahPack.MODID, version = NoahPack.VERSION)
public class NoahPack {
    public static final String MODID = "noahpack";
    public static final String VERSION = "1.0";

    //Items
    public static Item iceCreamItem;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        //System.out.println("DIRT BLOCK >> "+ Blocks.dirt.getUnlocalizedName());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInitEvent) {
        iceCreamItem = new IceCreamItem(1, 4);

        ItemStack snowballStack = new ItemStack(Items.snowball);
        ItemStack sugarStack    = new ItemStack(Items.sugar);
        ItemStack milkStack     = new ItemStack(Items.milk_bucket);
        ItemStack bowlStack     = new ItemStack(Items.bowl);

        GameRegistry.addShapelessRecipe(new ItemStack(iceCreamItem, 16),
                snowballStack, sugarStack, milkStack, bowlStack);

        // The second parameter is an unique registry identifier (not the displayed name)
        // Please don't use item1.getUnlocalizedName(), or you will make Lex sad
        GameRegistry.registerItem(iceCreamItem, "iceCreamItem");
    }

    @Mod.EventHandler
    public void load (FMLInitializationEvent event) {
    }
}