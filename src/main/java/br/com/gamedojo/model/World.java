package br.com.gamedojo.model;

public class World implements Agent {

    @Override
    public String getName() {
        return "<WORLD>";
    }

    @Override
    public boolean saveStats() {
        return false;
    }

    @Override
    public KillWithWeapon kill(Player player) {

        //        return new KillByDrown();
        return null;
    }

}
