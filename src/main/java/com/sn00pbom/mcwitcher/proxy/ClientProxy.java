package com.sn00pbom.mcwitcher.proxy;

import com.sn00pbom.mcwitcher.tab.CreativeTabWitcher;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Zach on 2/24/2018.
 */
public class ClientProxy extends CommonProxy {

    public static CreativeTabWitcher tabWitcher;

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);


        tabWitcher = new CreativeTabWitcher(CreativeTabs.getNextID(),"tab_mcwitcher");

//        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("mcwitcher:silver_sword", "inventory");
//        ModelLoader.setCustomModelResourceLocation(ModItems.basicSilverSword, 0, itemModelResourceLocation);

    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
