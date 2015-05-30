package com.jbuijssen.letsmodreboot.init;


import com.jbuijssen.letsmodreboot.item.ItemLMRB;
import com.jbuijssen.letsmodreboot.item.ItemMapleLeaf;
import com.jbuijssen.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();


    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
