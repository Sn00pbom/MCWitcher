package com.sn00pbom.mcwitcher.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


/**
 * Created by Zach on 2/24/2018.
 */
public class CreativeTabWitcher extends CreativeTabs {

    public CreativeTabWitcher(int index, String label){
        super(index,label);
    }

    @Override
    public ItemStack getTabIconItem(){
        return new ItemStack(Items.IRON_SWORD);
    }

}
