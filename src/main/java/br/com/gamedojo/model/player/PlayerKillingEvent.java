package br.com.gamedojo.model.player;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.game.Agent;
import br.com.gamedojo.model.game.weapon.Weapon;

public class PlayerKillingEvent extends KillingEvent {

    private Weapon weapon;

    public PlayerKillingEvent(Agent killer, Agent killed, Date time) {
        super(killer, killed, time);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

}
