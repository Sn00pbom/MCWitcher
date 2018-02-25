package com.sn00pbom.mcwitcher.item;

import com.sn00pbom.mcwitcher.MCWitcher;
import net.minecraft.item.Item;

/**
 * Created by Zach on 2/24/2018.
 */
public class ItemModItem extends Item {
    public ItemModItem(String name) {
        setRegistryName(MCWitcher.MODID,name);
        setUnlocalizedName(name);
        setCreativeTab(MCWitcher.tabWitcher);
    }

}
