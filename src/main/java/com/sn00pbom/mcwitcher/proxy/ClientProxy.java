package com.sn00pbom.mcwitcher.proxy;

import com.sn00pbom.mcwitcher.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Zach on 2/24/2018.
 */
public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation("mcwitcher:silver_sword", "inventory");
        ModelLoader.setCustomModelResourceLocation(ModItems.basicSilverSword, 0, itemModelResourceLocation);
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
        ModItems.registerRenders();

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}
