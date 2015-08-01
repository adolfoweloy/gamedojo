package br.com.gamedojo.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Match implements Iterable<Agent> {

    private String id;
    private Date startTime;
    private Date endTime;
    private Set<Agent> agents = new HashSet<>();

    public Match(Date startTime, String id) {
        this.startTime = startTime;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void finish(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void notifyKilling(KillingEvent killingEvent) {
        agents.add(killingEvent.getKiller());
        agents.add(killingEvent.getKilled());
    }

    @Override
    public Iterator<Agent> iterator() {
        return agents.iterator();
    }

}