package com.jbuijssen.letsmodreboot.block;

import com.jbuijssen.letsmodreboot.creativetab.CreativeTabLMRB;
import com.jbuijssen.letsmodreboot.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockLMRB extends Block {

    public BlockLMRB(Material material)
    {
        super(material);

        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }

    public BlockLMRB()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }

    @Override
    public String getUnlocalizedName()
    {


        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        // tile.modid:blockname.name
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+ 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
