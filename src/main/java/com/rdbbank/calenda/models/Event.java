package com.rdbbank.calenda.models;

import com.rdbbank.calenda.models.base.BaseProThree;

import javax.persistence.*;

/**
 * Create By: Ron Rith
 * Create Date on: 12/19/2018.
 */
@Entity
@Table(name = "td_event")
public class Event extends BaseProThree {
    private EventType eventType;

    @Column(name = "event_type")
    @Enumerated(EnumType.STRING)
    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
