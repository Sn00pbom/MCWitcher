package com.sn00pbom.mcwitcher;

import com.sn00pbom.mcwitcher.proxy.CommonProxy;
import com.sn00pbom.mcwitcher.tab.CreativeTabWitcher;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = MCWitcher.MODID, name = MCWitcher.NAME, version = MCWitcher.VERSION)
public class MCWitcher
{
    public static final String MODID = "mcwitcher";
    public static final String NAME = "MCWitcher";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @SidedProxy(clientSide = "com.sn00pbom.mcwitcher.proxy.ClientProxy", serverSide = "com.sn00pbom.mcwitcher.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MCWitcher instance;

    public static CreativeTabWitcher tabWitcher;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tabWitcher = new CreativeTabWitcher(CreativeTabs.getNextID(),"tab_mcwitcher");
        proxy.preInit(event);
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        proxy.init(event);
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);

    }
}
