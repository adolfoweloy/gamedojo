package br.com.gamedojo.model.player;

import java.util.Date;

import br.com.gamedojo.model.KillWithWeapon;
import br.com.gamedojo.model.game.Weapon;

class PlayerKillWithWeapon implements KillWithWeapon {
    private Player killer;
    private Player killed;


    PlayerKillWithWeapon(Player killer, Player killed) {
        this.killer = killer;
        this.killed = killed;
    }

    @Override
    public PlayerKillingEvent withWeaponAt(Weapon weapon, Date time) {
        PlayerKillingEvent event = new PlayerKillingEvent(killer, killed, time);
        event.setWeapon(weapon);
        return event;
    }
}