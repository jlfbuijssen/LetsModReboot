package com.jbuijssen.letsmodreboot.proxy;


import com.jbuijssen.letsmodreboot.client.Settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{

    @Override
    public void registerKeyBindings() {
        ClientRegistry.registerKeyBinding(KeyBindings.charge);
        ClientRegistry.registerKeyBinding((KeyBindings.release));
    }
}
