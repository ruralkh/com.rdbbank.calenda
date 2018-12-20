package com.rdbbank.calenda.models;

/**
 * Create By: Ron Rith
 * Create Date on: 12/19/2018.
 */
public enum EventType {
    H("Holiday"),
    E("Event");

    String des;

    EventType(String des){
        this.des = des;
    }

    public String getDes(){
        return des;
    }
}
