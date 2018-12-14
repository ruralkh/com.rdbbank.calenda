package com.rdbbank.calenda.models.lunar;

/**
 * Create By: Ron Rith
 * Create Date on: 12/14/2018.
 */
public enum DayNumLunarType {
    SM("Start Moon"),
    BM("Back Moon");

    String des;

    DayNumLunarType(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }
}