package br.com.gamedojo.model.world;

import br.com.gamedojo.model.KillWithWeapon;
import br.com.gamedojo.model.game.Agent;
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
    public KillWithWeapon kill(Player player) {

        //        return new KillByDrown();
        return null;
    }

}
