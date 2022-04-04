package com.rejahtavi.villagesiegedisabler.common;


import com.rejahtavi.villagesiegedisabler.VillageSiegeDisabler;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.village.VillageSiegeEvent;

@Mod.EventBusSubscriber(modid = VillageSiegeDisabler.MODID, value = Dist.DEDICATED_SERVER)
public class ServerLogic {

    @SubscribeEvent
    public static void onVillageSiege(VillageSiegeEvent event) {
        event.setCanceled(true);
        System.out.println("Village siege spawn attempt canceled.");
    }
}
