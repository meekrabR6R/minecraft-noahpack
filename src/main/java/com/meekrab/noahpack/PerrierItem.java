package com.meekrab.noahpack;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by nmiano on 9/20/14.
 */
public class PerrierItem extends ItemFood {

    public PerrierItem(int id, int healAmount) {
        super(id, healAmount, false);

        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("perrierItem");
        setTextureName("noahpack:perrier");
    }
}
