package br.com.gamedojo.model;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.event.PlayerKillingEvent;

public class KillByDrown implements KillWithWeapon {

    private World killer;
    private Player killed;

    public KillByDrown(World killer, Player killed) {
        this.killer = killer;
        this.killed = killed;
    }

    @Override
    public KillingEvent withWeaponAt(Weapon weapon, Date time) {
        KillingEvent event = new PlayerKillingEvent(killer, killed, time);
        return event;
    }

}
