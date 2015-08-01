package br.com.gamedojo.model.player;

import br.com.gamedojo.model.KillWithWeapon;
import br.com.gamedojo.model.game.Agent;

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
    public KillWithWeapon kill(Player other) {
        killings++;
        other.deaths++;

        return new PlayerKillWithWeapon(this, other);
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



}
