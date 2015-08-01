package br.com.gamedojo.model;

public interface Agent {

    String getName();

    boolean saveStats();

    KillWithWeapon kill(Player player);

}
