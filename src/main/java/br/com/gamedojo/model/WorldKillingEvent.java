package br.com.gamedojo.model;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;

public class WorldKillingEvent implements KillingEvent {

    @Override
    public Agent getKiller() {
        return null;
    }

    @Override
    public Agent getKilled() {
        return null;
    }

    @Override
    public Date getTime() {
        return null;
    }

}
