package com.bbang.frostmod.objects;

import com.bbang.frostmod.FrostMod;
import com.bbang.frostmod.init.ItemInit;
import com.bbang.frostmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemBase extends Item implements IHasModel {
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels()
    {
        FrostMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll();
    }
}
