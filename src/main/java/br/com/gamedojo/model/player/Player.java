package br.com.gamedojo.model.player;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.game.Agent;
import br.com.gamedojo.model.game.Weapon;

import com.google.common.base.MoreObjects;

public class Player implements Agent {

    /** nome do jogador */
    private String name;

    /** quantidade de assassinatos */
    private int killings;

    /** quantidade de vezes que morreu */
    private int deaths;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public KillingEvent kill(Player other, Weapon withWeapon, Date time) {
        killings++;
        other.die();

        PlayerKillingEvent event = new PlayerKillingEvent(this, other, time);
        event.setWeapon(withWeapon);
        return event;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("killings", killings)
                .add("deaths", deaths)
                .add("saveStats", saveStats())
                .toString();
    }

    @Override
    public boolean saveStats() {
        return true;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getKillings() {
        return killings;
    }

    public void die() {
        deaths++;
    }



}
