package br.com.gamedojo.model.game.weapon;

public enum Weapons {

    SWORD(new Weapon("Sword")),
    MAGIC(new Weapon("Weapon")),
    M16(new Weapon("M-16")),
    INVALID(new Weapon(""));


    private Weapon w;

    private Weapons(Weapon w) {
        this.w = w;
    }

    public String getName() {
        return w.getName();
    }

    public Weapon getWeapon() {
        return w;
    }
}
