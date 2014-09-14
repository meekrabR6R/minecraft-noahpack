package com.meekrab.noahpack;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

/**
 * Created by nmiano on 9/11/14.
 */
public class IceCreamItem extends ItemFood {

    public IceCreamItem(int id, int healAmount) {
        super(id, healAmount, false);

        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabFood);
        setUnlocalizedName("iceCreamItem");
        setTextureName("noahpack:icecream");
    }
}
