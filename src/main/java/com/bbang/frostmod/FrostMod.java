package com.bbang.frostmod;

import com.bbang.frostmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FrostMod.MODID, name = FrostMod.NAME, version = FrostMod.VERSION)
public class FrostMod
{
    public static final String MODID = "frost";
    public static final String NAME = "Frost";
    public static final String VERSION = "0.0.1";

    @Mod.Instance
    public static FrostMod instance;

    @SidedProxy(
            clientSide = "com.bbang.frostmod.proxy.ClientProxy",
            serverSide = "com.bbang.frostmod.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {}
    @EventHandler
    public void init(FMLInitializationEvent event) {}
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}
