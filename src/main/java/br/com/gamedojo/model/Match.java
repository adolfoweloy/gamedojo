package br.com.gamedojo.model;

import java.util.Date;

public class Match {

    private String id;
    private Date startTime;
    private Date endTime;

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

}