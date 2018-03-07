package com.sn00pbom.mcwitcher.item;

import com.sn00pbom.mcwitcher.MCWitcher;
import com.sn00pbom.mcwitcher.proxy.ClientProxy;
import net.minecraft.item.Item;

/**
 * Created by Zach on 2/24/2018.
 */
public class ItemModItem extends Item {
    public ItemModItem(String name) {
        setRegistryName(MCWitcher.MODID,name);
        setUnlocalizedName(name);
        setCreativeTab(ClientProxy.tabWitcher);
    }

    //creativetab vs no creative tab overloaded const
    public ItemModItem(String name,boolean crea) {
        setRegistryName(MCWitcher.MODID,name);
        setUnlocalizedName(name);
        if(crea){setCreativeTab(ClientProxy.tabWitcher);}
    }
}
