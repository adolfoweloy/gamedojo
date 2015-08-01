package br.com.gamedojo.model.game;

import java.util.Date;

import br.com.gamedojo.model.event.KillingEvent;
import br.com.gamedojo.model.game.stats.Statistics;
import br.com.gamedojo.model.player.PlayerKillingEvent;

public class Match {

    private String id;
    private Date startTime;
    private Date endTime;
    private Statistics statistics = new Statistics();

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

    public void addEvent(KillingEvent event) {

        if (event.getKiller().saveStats()) {
            PlayerKillingEvent playerEvent = (PlayerKillingEvent) event;
            statistics.add(playerEvent.getKiller(), playerEvent.getWeapon());
        }

        statistics.add(event.getKilled());
    }

    public Statistics getStatistics() {
        return statistics;
    }

}