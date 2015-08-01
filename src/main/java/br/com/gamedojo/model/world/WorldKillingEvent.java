package br.com.gamedojo.model.world;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.player.Player;

public class WorldKillingEvent extends KillingEvent {

    public WorldKillingEvent(World killer, Player killed, Date time) {
        super(killer, killed, time);
    }

}
