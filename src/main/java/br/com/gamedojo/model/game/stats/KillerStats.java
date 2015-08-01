package br.com.gamedojo.model.game.stats;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import br.com.gamedojo.model.game.Weapon;

/**
 * Essa classe, mantém estatísticas de utilização de armas.
 * @author aeloy
 */
public class KillerStats {

    private Map<Weapon, Integer> stats = new HashMap<>();

    public void hit(Weapon weapon) {
        Integer hits = stats.get(weapon);

        if (hits == null) {
            hits = 0;
        }

        stats.put(weapon, ++hits);
    }

    public Map<Weapon, Integer> getWeaponUsage() {
        return Collections.unmodifiableMap(stats);
    }

    public Weapon getMostUsedWeapon() {
        int max = 0;
        Weapon mostUsed = Weapon.INVALID;

        for (Weapon key : stats.keySet()) {
            if (stats.get(key) > max) {
                max = stats.get(key);
                mostUsed = key;
            }
        }

        return mostUsed;
    }

}