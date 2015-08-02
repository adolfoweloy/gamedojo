package br.com.gamedojo.model.game;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import br.com.gamedojo.model.game.weapon.Weapon;
import br.com.gamedojo.model.player.Player;

public class Game implements Iterable<Match> {
    private List<Match> matches = new ArrayList<>();
    private Match currentMatch = null;

    public Match newMatch(Date time, String id) {
        currentMatch = new Match(time, id);
        return currentMatch;
    }

    public void kill(Agent a1, Player p, Weapon w, Date time) {
        currentMatch.addEvent(a1.kill(p, w, time));
    }

    public void endMatch(Date time) {
        if (currentMatch == null) {
            throw new IllegalStateException("should create a new match first");
        }

        currentMatch.finish(time);
        matches.add(currentMatch);
        currentMatch = null;
    }

    public int matches() {
        return matches.size();
    }

    @Override
    public Iterator<Match> iterator() {
        return matches.iterator();
    }

}
