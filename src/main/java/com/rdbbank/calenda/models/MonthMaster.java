package com.rdbbank.calenda.models;

import com.rdbbank.calenda.models.base.BaseEntity;

import javax.persistence.*;

/**
 * Create By: Ron Rith
 * Create Date on: 12/12/2018.
 */
@Entity
@Table(name = "td_month_master")
public class MonthMaster extends BaseEntity {

    private String monday;

    private String tuesday;

    private String wednesday;

    private String thursday;

    private String friday;

    private String saturday;

    private String sunday;

    private String year;

    private String month;

    private Holiday holiday;

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "holiday_id")
    public Holiday getHoliday() {
        return holiday;
    }

    public void setHoliday(Holiday holiday) {
        this.holiday = holiday;
    }

    public MonthMaster() {
    }

    public MonthMaster(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday, String year, String month, Holiday holiday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.year = year;
        this.month = month;
        this.holiday = holiday;
    }

}
