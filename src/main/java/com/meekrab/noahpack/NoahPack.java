package com.meekrab.noahpack;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Blocks;

/**
 * Created by nmiano on 9/11/14.
 */
@Mod(modid = NoahPack.MODID, version = NoahPack.VERSION)
public class NoahPack {
    public static final String MODID = "noahpack";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+ Blocks.dirt.getUnlocalizedName());
    }
}