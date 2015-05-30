package com.jbuijssen.letsmodreboot.handler;


import com.jbuijssen.letsmodreboot.reference.Reference;
import com.jbuijssen.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;


    public static void init( File configFile){

        // Create the configuration object from the given configuration file
        if (configuration == null) {

            configuration = new Configuration(configFile);
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent (ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
    public void loadConfiguration()
    {

        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}

