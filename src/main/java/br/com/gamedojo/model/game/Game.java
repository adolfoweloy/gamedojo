package br.com.gamedojo.model.game;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Game implements Iterable<Match> {
    private List<Match> matches = new ArrayList<>();
    private Match currentMatch = null;

    public Match newMatch(Date time, String id) {
        currentMatch = new Match(time, id);
        return currentMatch;
    }

    public void endMatch(Date time) {
        if (currentMatch == null) {
            throw new IllegalStateException("should create a new match first");
        }

        currentMatch.finish(time);
        matches.add(currentMatch);
        currentMatch = null;
    }

    public int matchers() {
        return matches.size();
    }

    @Override
    public Iterator<Match> iterator() {
        return matches.iterator();
    }

}
