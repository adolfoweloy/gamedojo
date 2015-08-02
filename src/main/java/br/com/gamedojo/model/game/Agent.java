package br.com.gamedojo.model.game;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.game.weapon.Weapon;
import br.com.gamedojo.model.player.Player;

public interface Agent {

    String getName();

    boolean saveStats();

    KillingEvent kill(Player player, Weapon withWeapon, Date time);

}
