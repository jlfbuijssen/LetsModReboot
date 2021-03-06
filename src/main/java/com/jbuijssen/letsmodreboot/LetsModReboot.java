package com.jbuijssen.letsmodreboot;


import com.jbuijssen.letsmodreboot.client.handler.KeyInputEventHandler;
import com.jbuijssen.letsmodreboot.handler.ConfigurationHandler;
import com.jbuijssen.letsmodreboot.init.ModItems;
import com.jbuijssen.letsmodreboot.init.ModBlocks;
import com.jbuijssen.letsmodreboot.init.Recipes;
import com.jbuijssen.letsmodreboot.proxy.IProxy;
import com.jbuijssen.letsmodreboot.reference.Reference;
import com.jbuijssen.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        Recipes.init();

        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization Complete!");

    }
}
