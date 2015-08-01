package br.com.gamedojo.model;

import java.util.Date;

public class Game {

    public Match newMatch(Date time, String id) {
        return new Match(time, id);
    }

}
