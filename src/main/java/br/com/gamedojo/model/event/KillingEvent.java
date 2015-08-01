package br.com.gamedojo.model.event;

import java.util.Date;

import br.com.gamedojo.model.game.Agent;

public interface KillingEvent {

    public abstract Agent getKiller();

    public abstract Agent getKilled();

    public abstract Date getTime();

}