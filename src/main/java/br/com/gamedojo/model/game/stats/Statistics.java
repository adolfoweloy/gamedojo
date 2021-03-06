package br.com.gamedojo.model.game.stats;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import br.com.gamedojo.model.game.Agent;
import br.com.gamedojo.model.game.weapon.Weapon;
import br.com.gamedojo.model.player.Player;

public class Statistics implements Iterable<Agent> {

    private Map<Agent, KillerStats> stats = new HashMap<>();

    public void add(Agent agent, Weapon weapon) {

        if (stats.get(agent) == null) {
            stats.put(agent, new KillerStats());
        }

        stats.get(agent).hit(weapon);
    }

    public void add(Agent agent) {

        if (stats.get(agent) == null) {
            stats.put(agent, new KillerStats());
        }

    }

    public Weapon getPreferredWeaponFor(Player player) {
        KillerStats killerStats = stats.get(player);
        return killerStats.getMostUsedWeapon();
    }

    @Override
    public Iterator<Agent> iterator() {
        return stats.keySet().iterator();
    }

}
