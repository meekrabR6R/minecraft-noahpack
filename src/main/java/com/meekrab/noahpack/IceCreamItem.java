package com.meekrab.noahpack;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by nmiano on 9/11/14.
 */
public class IceCreamItem extends Item {

    public IceCreamItem() {
        setMaxStackSize(64);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("IceCreamItem");
    }
}
