package br.com.gamedojo.model.world;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.game.Agent;
import br.com.gamedojo.model.game.Weapon;
import br.com.gamedojo.model.player.Player;

public class World implements Agent {

    @Override
    public String getName() {
        return "<WORLD>";
    }

    @Override
    public boolean saveStats() {
        return false;
    }

    @Override
    public KillingEvent kill(Player player, Weapon withWeapon, Date time) {
        player.die();
        return new WorldKillingEvent(this, player, time);
    }

}
