package br.com.gamedojo.model;

public enum Weapon {

    SWORD("Sword"),
    MAGIC("Weapon"),
    M16("M-16"),
    INVALID("");


    private String name;

    private Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
