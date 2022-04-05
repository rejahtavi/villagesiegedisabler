package com.rejahtavi.villagesiegedisabler;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(VillageSiegeDisabler.MODID)
public class VillageSiegeDisabler {

    // Mod identification data
    public static final String MODID = "villagesiegedisabler";
    public static final String MODNAME = "Village Siege Disabler";
    public static final String VERSION = "0.5";

    // Constructor & initialization
    public VillageSiegeDisabler() {
        MinecraftForge.EVENT_BUS.register(SiegeEventHandler.class);
    }
}
