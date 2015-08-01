package br.com.gamedojo.model;

public class Player implements Agent {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
