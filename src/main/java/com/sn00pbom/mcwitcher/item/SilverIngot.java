package com.sn00pbom.mcwitcher.item;

import com.sn00pbom.mcwitcher.MCWitcher;
import net.minecraft.item.Item;

/**
 * Created by Zach on 2/24/2018.
 */
public class SilverIngot extends Item {
    public SilverIngot(String name){
        setRegistryName(MCWitcher.MODID,name);
        setUnlocalizedName(name);
        setCreativeTab(MCWitcher.tabWitcher);
    }
}
