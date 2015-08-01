package br.com.gamedojo.model.world;

import java.util.Date;

import br.com.gamedojo.model.KillWithWeapon;
import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.game.Weapon;
import br.com.gamedojo.model.player.Player;
import br.com.gamedojo.model.player.PlayerKillingEvent;

class KillByDrown implements KillWithWeapon {

    private World killer;
    private Player killed;

    KillByDrown(World killer, Player killed) {
        this.killer = killer;
        this.killed = killed;
    }

    @Override
    public KillingEvent withWeaponAt(Weapon weapon, Date time) {
        KillingEvent event = new PlayerKillingEvent(killer, killed, time);
        return event;
    }

}
