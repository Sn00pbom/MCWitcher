package com.sn00pbom.mcwitcher.item;

import com.sn00pbom.mcwitcher.MCWitcher;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


/**
 * Created by Zach on 2/24/2018.
 */
@Mod.EventBusSubscriber
public class ModItems {

    public static ItemSilverSword basicSilverSword =  new ItemSilverSword("silver_sword",13F,10F);
    public static SilverIngot silverIngot = new SilverIngot("silver_ingot");

    public static void preInit() {
//        basicSilverSword = ;


//        System.out.println("db");
//        registerItems();
    }


    public static void registerItems(){
//        ForgeRegistries.ITEMS.register(basicSilverSword);


    }

    public static void registerRenders(){
//        registerRender(basicSilverSword);
    }

    public static void registerRender(Item item){
        //newer load version


//        MCWitcher.db();MCWitcher.MODID + ":" + item.getUnlocalizedName().substring(5)
//        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        MCWitcher.db();
        event.getRegistry().register(basicSilverSword);
        event.getRegistry().register(silverIngot);
        MCWitcher.db();

    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {



        ModelLoader.setCustomModelResourceLocation(basicSilverSword, 0, new ModelResourceLocation( Item.REGISTRY.getNameForObject(basicSilverSword),"inventory"));
        ModelLoader.setCustomModelResourceLocation(silverIngot, 0, new ModelResourceLocation( "minecraft:items/iron_sword","inventory"));
        MCWitcher.db();
    }
//    private void registerItemModel(final Item item, final String modelLocation) {
//        final ModelResourceLocation fullModelLocation = new ModelResourceLocation(modelLocation, "inventory");
//        registerItemModel(item, fullModelLocation);
//    }
//    private void registerItemModel(final Item item, final ModelResourceLocation fullModelLocation) {
//        ModelBakery.registerItemVariants(item, fullModelLocation); // Ensure the custom model is loaded and prevent the default model from being loaded
//        registerItemModel(item, MeshDefinitionFix.create(stack -> fullModelLocation));
//    }
//    private void registerItemModel(final Item item, final ItemMeshDefinition meshDefinition) {
//        ItemMeshDefinition
//        ModelLoader.setCustomMeshDefinition(item, meshDefinition);
//    }

}
