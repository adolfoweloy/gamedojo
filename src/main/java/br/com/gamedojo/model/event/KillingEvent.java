package br.com.gamedojo.model.event;

import java.util.Date;

import br.com.gamedojo.model.game.Agent;

public class KillingEvent {

    private Agent killer;
    private Agent killed;
    private Date time;

    public KillingEvent(Agent killer, Agent killed, Date time) {
        super();
        this.killer = killer;
        this.killed = killed;
        this.time = time;
    }

    public Agent getKiller() {
        return killer;
    }

    public Agent getKilled() {
        return killed;
    }

    public Date getTime() {
        return time;
    }

}