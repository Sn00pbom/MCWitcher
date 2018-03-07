package com.sn00pbom.mcwitcher.item;

import com.sn00pbom.mcwitcher.MCWitcher;
import com.sn00pbom.mcwitcher.proxy.ClientProxy;
import net.minecraft.item.ItemSword;

/**
 * Created by Zach on 2/24/2018.
 */
public class ItemModItemSword extends ItemSword{
    public ItemModItemSword(String name,ToolMaterial material){
        super(material);
        setRegistryName(MCWitcher.MODID,name);
        setUnlocalizedName(name);
        setCreativeTab(ClientProxy.tabWitcher);

    }

}
