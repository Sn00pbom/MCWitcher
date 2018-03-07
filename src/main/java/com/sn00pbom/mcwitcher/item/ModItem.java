package com.sn00pbom.mcwitcher.item;

import com.sn00pbom.mcwitcher.MCWitcher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.ArrayList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public enum ModItem {

    W_ICON(new ItemModItem("w_icon",false)),
    SILVER_SWORD1(new ItemSilverSword("silver_sword1",13F,10F)),
    SILVER_SWORD2(new ItemSilverSword("silver_sword2",15F,12F)),
    SILVER_SWORD3(new ItemSilverSword("silver_sword3",17F,14F)),
    SILVER_SWORD4(new ItemSilverSword("silver_sword4",19F,16F)),
    SILVER_SWORD5(new ItemSilverSword("silver_sword5",21F,18F)),
    SILVER_INGOT(new ItemSilverIngot("silver_ingot"));

    private Item item;


    ModItem(Item item){
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }

    //____________STATIC METHODS



    public static ArrayList<Item> getModItems() {
        ArrayList<Item> modItems = new ArrayList<>();
        for (ModItem modItem : ModItem.values()) {
            modItems.add(modItem.getItem());
        }
        return modItems;
    }

    @SubscribeEvent //to be used with registry event and register enum items to server
    public static void registerItems(RegistryEvent.Register<Item> event) {
        MCWitcher.db();
        for(Item item : ModItem.getModItems()){
            event.getRegistry().register(item);
        }

        MCWitcher.db();

    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        //this method loads all textures for all item values in the ModItem enum
        for (Item item : ModItem.getModItems()) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));

        }

        MCWitcher.db();
    }


}
