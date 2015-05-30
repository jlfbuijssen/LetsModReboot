package com.jbuijssen.letsmodreboot.init;


import com.jbuijssen.letsmodreboot.block.BlockFlag;
import com.jbuijssen.letsmodreboot.block.BlockLMRB;
import com.jbuijssen.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
