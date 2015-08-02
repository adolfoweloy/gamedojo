package br.com.gamedojo.model.game;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import br.com.gamedojo.model.game.weapon.Weapon;
import br.com.gamedojo.model.player.Player;

public class Game implements Iterable<Match> {
    private List<Match> matches = new ArrayList<>();
    private Match currentMatch = null;
    private Map<String, Agent> players = new HashMap<>();

    public Match newMatch(Date time, String id) {
        currentMatch = new Match(time, id);
        return currentMatch;
    }

    public void kill(Agent a1, Player p, Weapon w, Date time) {

        String p1Name = a1.getName();
        String p2Name = p.getName();

        if (!players.containsKey(p1Name)) {
            players.put(p1Name, a1);
        }

        if (!players.containsKey(p2Name)) {
            players.put(p2Name, p);
        }

        currentMatch.addEvent(players.get(p1Name).kill((Player) players.get(p2Name), w, time));
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

    public Match getCurrentMatch() {
        return currentMatch;
    }
}
