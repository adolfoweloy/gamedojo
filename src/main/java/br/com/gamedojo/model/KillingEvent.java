package br.com.gamedojo.model;

import java.util.Date;

public interface KillingEvent {

    public abstract Agent getKiller();

    public abstract Agent getKilled();

    public abstract Date getTime();

}