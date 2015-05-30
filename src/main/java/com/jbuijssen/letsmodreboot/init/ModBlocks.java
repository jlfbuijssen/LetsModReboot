package com.jbuijssen.letsmodreboot.init;


import com.jbuijssen.letsmodreboot.block.BlockFlag;
import com.jbuijssen.letsmodreboot.block.BlockLMRB;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
