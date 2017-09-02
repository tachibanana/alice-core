package com.remswork.projecct.alice.v1.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.remswork.project.alice.model.support.Link;

@XmlRootElement
public class Schedule {

    private long id;
    private String day;
    private String time;
    private String period;
    private String room;
    
    private List<Link> links;

    public Schedule() {
        links = new ArrayList<Link>();
    }

    public Schedule(String day, String time, String period, String room) {
        this();
        this.day = day;
        this.time = time;
        this.period = period;
        this.room = room;
    }
    
    public Schedule(long id, String day, String time, String period, String room) {
        this(day, time, period, room);
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public void addLink(Link link) {
        links.add(link);
    }
}