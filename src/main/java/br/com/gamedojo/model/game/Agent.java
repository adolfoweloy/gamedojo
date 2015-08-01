package br.com.gamedojo.model.game;

import br.com.gamedojo.model.KillWithWeapon;
import br.com.gamedojo.model.player.Player;

public interface Agent {

    String getName();

    boolean saveStats();

    KillWithWeapon kill(Player player);

}
