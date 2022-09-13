package com.rejahtavi.villagesiegedisabler;

import net.minecraft.world.entity.ai.village.VillageSiege;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.village.VillageSiegeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VillageSiegeDisabler.MODID, value = Dist.DEDICATED_SERVER)
public class SiegeEventHandler {

    @SubscribeEvent
    public static void onVillageSiege(VillageSiegeEvent event) {
        event.getSiege().siegeState = VillageSiege.State.SIEGE_DONE;
        event.setCanceled(true);
        //System.err.println("===== VILLAGE SIEGE CANCELED =====");
    }
}
