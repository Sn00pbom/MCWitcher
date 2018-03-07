package com.sn00pbom.mcwitcher.item;

import com.sn00pbom.mcwitcher.MCWitcher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class ModItemsSkinner {


    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        //this method loads all textures for all item values in the ModItem enum
        for (Item item : ModItem.getModItems()) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));

        }

//        ModelLoader.setCustomModelResourceLocation(ModItem.SILVER_SWORD1, 0, new ModelResourceLocation( ModItem.SILVER_SWORD1.getRegistryName(),"inventory"));
//        ModelLoader.setCustomModelResourceLocation(ModItem.SILVER_INGOT, 0, new ModelResourceLocation( silverIngot.getRegistryName(),"inventory"));
        MCWitcher.db();
    }
}
