package com.rdbbank.calenda.models;

import com.rdbbank.calenda.models.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Create By: Ron Rith
 * Create Date on: 12/25/2018.
 */
@Entity
@Table(name = "td_month_master")
public class MonthMaster extends BaseEntity{
    private String monday;

    private String tuesday;

    private String wednesday;

    private String thursday;

    private String friday;

    private String saturday;

    private String sunday;

    private String mondayDayNumLunar;

    private String tuesdayDayNumLunar;

    private String wednesdayDayNumLunar;

    private String thursdayDayNumLunar;

    private String fridayDayNumLunar;

    private String saturdayDayNumLunar;

    private String sundayDayNumLunar;

    private String mondayMoonNumber;

    private String tuesdayMoonNumber;

    private String wednesdayMoonNumber;

    private String thursdayMoonNumber;

    private String fridayMoonNumber;

    private String saturdayMoonNumber;

    private String sundayMoonNumber;

    private String mondayMonthLunar;

    private String tuesdayMonthLunar;

    private String wednesdayMonthLunar;

    private String thursdayMonthLunar;

    private String fridayMonthLunar;

    private String saturdayMonthLunar;

    private String sundayMonthLunar;

    private String yearBuddhaEra;

    private String yearLunar;

    private String mondayHoliday;

    private String tuesdayHoliday;

    private String wednesdayHoliday;

    private String thursdayHoliday;

    private String fridayHoliday;

    private String saturdayHoliday;

    private String sundayHoliday;

    private String mondayEvent;

    private String tuesdayEvent;

    private String wednesdayEvent;

    private String thursdayEvent;

    private String fridayEvent;

    private String saturdayEvent;

    private String sundayEvent;

    private String year;

    private String month;

    @Column(name = "monday_day_lum_lunar")
    public String getMondayDayNumLunar() {
        return mondayDayNumLunar;
    }

    public void setMondayDayNumLunar(String mondayDayNumLunar) {
        this.mondayDayNumLunar = mondayDayNumLunar;
    }

    @Column(name = "tuesday_day_lum_lunar")
    public String getTuesdayDayNumLunar() {
        return tuesdayDayNumLunar;
    }

    public void setTuesdayDayNumLunar(String tuesdayDayNumLunar) {
        this.tuesdayDayNumLunar = tuesdayDayNumLunar;
    }

    @Column(name = "wednesday_day_lum_lunar")
    public String getWednesdayDayNumLunar() {
        return wednesdayDayNumLunar;
    }

    public void setWednesdayDayNumLunar(String wednesdayDayNumLunar) {
        this.wednesdayDayNumLunar = wednesdayDayNumLunar;
    }

    @Column(name = "thursday_day_lum_lunar")
    public String getThursdayDayNumLunar() {
        return thursdayDayNumLunar;
    }

    public void setThursdayDayNumLunar(String thursdayDayNumLunar) {
        this.thursdayDayNumLunar = thursdayDayNumLunar;
    }

    @Column(name = "friday_day_lum_lunar")
    public String getFridayDayNumLunar() {
        return fridayDayNumLunar;
    }

    public void setFridayDayNumLunar(String fridayDayNumLunar) {
        this.fridayDayNumLunar = fridayDayNumLunar;
    }

    @Column(name = "saturday_day_lum_lunar")
    public String getSaturdayDayNumLunar() {
        return saturdayDayNumLunar;
    }

    public void setSaturdayDayNumLunar(String saturdayDayNumLunar) {
        this.saturdayDayNumLunar = saturdayDayNumLunar;
    }

    @Column(name = "sunday_day_lum_lunar")
    public String getSundayDayNumLunar() {
        return sundayDayNumLunar;
    }

    public void setSundayDayNumLunar(String sundayDayNumLunar) {
        this.sundayDayNumLunar = sundayDayNumLunar;
    }

    @Column(name = "monday_moon_number")
    public String getMondayMoonNumber() {
        return mondayMoonNumber;
    }

    public void setMondayMoonNumber(String mondayMoonNumber) {
        this.mondayMoonNumber = mondayMoonNumber;
    }

    @Column(name = "tuesday_moon_number")
    public String getTuesdayMoonNumber() {
        return tuesdayMoonNumber;
    }

    public void setTuesdayMoonNumber(String tuesdayMoonNumber) {
        this.tuesdayMoonNumber = tuesdayMoonNumber;
    }

    @Column(name = "wednesday_moon_number")
    public String getWednesdayMoonNumber() {
        return wednesdayMoonNumber;
    }

    public void setWednesdayMoonNumber(String wednesdayMoonNumber) {
        this.wednesdayMoonNumber = wednesdayMoonNumber;
    }

    @Column(name = "thursday_moon_number")
    public String getThursdayMoonNumber() {
        return thursdayMoonNumber;
    }

    public void setThursdayMoonNumber(String thursdayMoonNumber) {
        this.thursdayMoonNumber = thursdayMoonNumber;
    }

    @Column(name = "friday_moon_number")
    public String getFridayMoonNumber() {
        return fridayMoonNumber;
    }

    public void setFridayMoonNumber(String fridayMoonNumber) {
        this.fridayMoonNumber = fridayMoonNumber;
    }

    @Column(name = "saturday_moon_number")
    public String getSaturdayMoonNumber() {
        return saturdayMoonNumber;
    }

    public void setSaturdayMoonNumber(String saturdayMoonNumber) {
        this.saturdayMoonNumber = saturdayMoonNumber;
    }

    @Column(name = "sunday_moon_number")
    public String getSundayMoonNumber() {
        return sundayMoonNumber;
    }

    public void setSundayMoonNumber(String sundayMoonNumber) {
        this.sundayMoonNumber = sundayMoonNumber;
    }

    @Column(name = "monday_month_lunar")
    public String getMondayMonthLunar() {
        return mondayMonthLunar;
    }

    public void setMondayMonthLunar(String mondayMonthLunar) {
        this.mondayMonthLunar = mondayMonthLunar;
    }

    @Column(name = "tuesday_month_lunar")
    public String getTuesdayMonthLunar() {
        return tuesdayMonthLunar;
    }

    public void setTuesdayMonthLunar(String tuesdayMonthLunar) {
        this.tuesdayMonthLunar = tuesdayMonthLunar;
    }

    @Column(name = "wednesday_month_lunar")
    public String getWednesdayMonthLunar() {
        return wednesdayMonthLunar;
    }

    public void setWednesdayMonthLunar(String wednesdayMonthLunar) {
        this.wednesdayMonthLunar = wednesdayMonthLunar;
    }

    @Column(name = "thursday_month_lunar")
    public String getThursdayMonthLunar() {
        return thursdayMonthLunar;
    }

    public void setThursdayMonthLunar(String thursdayMonthLunar) {
        this.thursdayMonthLunar = thursdayMonthLunar;
    }

    @Column(name = "friday_month_lunar")
    public String getFridayMonthLunar() {
        return fridayMonthLunar;
    }

    public void setFridayMonthLunar(String fridayMonthLunar) {
        this.fridayMonthLunar = fridayMonthLunar;
    }

    @Column(name = "saturday_month_lunar")
    public String getSaturdayMonthLunar() {
        return saturdayMonthLunar;
    }

    public void setSaturdayMonthLunar(String saturdayMonthLunar) {
        this.saturdayMonthLunar = saturdayMonthLunar;
    }

    @Column(name = "sunday_month_lunar")
    public String getSundayMonthLunar() {
        return sundayMonthLunar;
    }

    public void setSundayMonthLunar(String sundayMonthLunar) {
        this.sundayMonthLunar = sundayMonthLunar;
    }

    @Column(name = "year_buddha_era")
    public String getYearBuddhaEra() {
        return yearBuddhaEra;
    }

    public void setYearBuddhaEra(String yearBuddhaEra) {
        this.yearBuddhaEra = yearBuddhaEra;
    }

    @Column(name = "year_lunar")
    public String getYearLunar() {
        return yearLunar;
    }

    public void setYearLunar(String yearLunar) {
        this.yearLunar = yearLunar;
    }

    @Column(name = "monday_holiday")
    public String getMondayHoliday() {
        return mondayHoliday;
    }

    public void setMondayHoliday(String mondayHoliday) {
        this.mondayHoliday = mondayHoliday;
    }

    @Column(name = "tuesday_holiday")
    public String getTuesdayHoliday() {
        return tuesdayHoliday;
    }

    public void setTuesdayHoliday(String tuesdayHoliday) {
        this.tuesdayHoliday = tuesdayHoliday;
    }

    @Column(name = "wednesday_holiday")
    public String getWednesdayHoliday() {
        return wednesdayHoliday;
    }

    public void setWednesdayHoliday(String wednesdayHoliday) {
        this.wednesdayHoliday = wednesdayHoliday;
    }

    @Column(name = "thursday_holiday")
    public String getThursdayHoliday() {
        return thursdayHoliday;
    }

    public void setThursdayHoliday(String thursdayHoliday) {
        this.thursdayHoliday = thursdayHoliday;
    }

    @Column(name = "friday_holiday")
    public String getFridayHoliday() {
        return fridayHoliday;
    }

    public void setFridayHoliday(String fridayHoliday) {
        this.fridayHoliday = fridayHoliday;
    }

    @Column(name = "saturday_holiday")
    public String getSaturdayHoliday() {
        return saturdayHoliday;
    }

    public void setSaturdayHoliday(String saturdayHoliday) {
        this.saturdayHoliday = saturdayHoliday;
    }

    @Column(name = "sunday_holiday")
    public String getSundayHoliday() {
        return sundayHoliday;
    }

    public void setSundayHoliday(String sundayHoliday) {
        this.sundayHoliday = sundayHoliday;
    }

    @Column(name = "monday_event")
    public String getMondayEvent() {
        return mondayEvent;
    }

    public void setMondayEvent(String mondayEvent) {
        this.mondayEvent = mondayEvent;
    }

    @Column(name = "tuesday_event")
    public String getTuesdayEvent() {
        return tuesdayEvent;
    }

    public void setTuesdayEvent(String tuesdayEvent) {
        this.tuesdayEvent = tuesdayEvent;
    }

    @Column(name = "wednesday_event")
    public String getWednesdayEvent() {
        return wednesdayEvent;
    }

    public void setWednesdayEvent(String wednesdayEvent) {
        this.wednesdayEvent = wednesdayEvent;
    }

    @Column(name = "thursday_event")
    public String getThursdayEvent() {
        return thursdayEvent;
    }

    public void setThursdayEvent(String thursdayEvent) {
        this.thursdayEvent = thursdayEvent;
    }

    @Column(name = "friday_event")
    public String getFridayEvent() {
        return fridayEvent;
    }

    public void setFridayEvent(String fridayEvent) {
        this.fridayEvent = fridayEvent;
    }

    @Column(name = "saturday_event")
    public String getSaturdayEvent() {
        return saturdayEvent;
    }

    public void setSaturdayEvent(String saturdayEvent) {
        this.saturdayEvent = saturdayEvent;
    }

    @Column(name = "sunday_event")
    public String getSundayEvent() {
        return sundayEvent;
    }

    public void setSundayEvent(String sundayEvent) {
        this.sundayEvent = sundayEvent;
    }

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

    public MonthMaster() {
    }

    public MonthMaster(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday, String mondayDayNumLunar, String tuesdayDayNumLunar, String wednesdayDayNumLunar, String thursdayDayNumLunar, String fridayDayNumLunar, String saturdayDayNumLunar, String sundayDayNumLunar, String mondayMoonNumber, String tuesdayMoonNumber, String wednesdayMoonNumber, String thursdayMoonNumber, String fridayMoonNumber, String saturdayMoonNumber, String sundayMoonNumber, String mondayMonthLunar, String tuesdayMonthLunar, String wednesdayMonthLunar, String thursdayMonthLunar, String fridayMonthLunar, String saturdayMonthLunar, String sundayMonthLunar, String yearBuddhaEra, String yearLunar, String mondayHoliday, String tuesdayHoliday, String wednesdayHoliday, String thursdayHoliday, String fridayHoliday, String saturdayHoliday, String sundayHoliday, String mondayEvent, String tuesdayEvent, String wednesdayEvent, String thursdayEvent, String fridayEvent, String saturdayEvent, String sundayEvent, String year, String month) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.mondayDayNumLunar = mondayDayNumLunar;
        this.tuesdayDayNumLunar = tuesdayDayNumLunar;
        this.wednesdayDayNumLunar = wednesdayDayNumLunar;
        this.thursdayDayNumLunar = thursdayDayNumLunar;
        this.fridayDayNumLunar = fridayDayNumLunar;
        this.saturdayDayNumLunar = saturdayDayNumLunar;
        this.sundayDayNumLunar = sundayDayNumLunar;
        this.mondayMoonNumber = mondayMoonNumber;
        this.tuesdayMoonNumber = tuesdayMoonNumber;
        this.wednesdayMoonNumber = wednesdayMoonNumber;
        this.thursdayMoonNumber = thursdayMoonNumber;
        this.fridayMoonNumber = fridayMoonNumber;
        this.saturdayMoonNumber = saturdayMoonNumber;
        this.sundayMoonNumber = sundayMoonNumber;
        this.mondayMonthLunar = mondayMonthLunar;
        this.tuesdayMonthLunar = tuesdayMonthLunar;
        this.wednesdayMonthLunar = wednesdayMonthLunar;
        this.thursdayMonthLunar = thursdayMonthLunar;
        this.fridayMonthLunar = fridayMonthLunar;
        this.saturdayMonthLunar = saturdayMonthLunar;
        this.sundayMonthLunar = sundayMonthLunar;
        this.yearBuddhaEra = yearBuddhaEra;
        this.yearLunar = yearLunar;
        this.mondayHoliday = mondayHoliday;
        this.tuesdayHoliday = tuesdayHoliday;
        this.wednesdayHoliday = wednesdayHoliday;
        this.thursdayHoliday = thursdayHoliday;
        this.fridayHoliday = fridayHoliday;
        this.saturdayHoliday = saturdayHoliday;
        this.sundayHoliday = sundayHoliday;
        this.mondayEvent = mondayEvent;
        this.tuesdayEvent = tuesdayEvent;
        this.wednesdayEvent = wednesdayEvent;
        this.thursdayEvent = thursdayEvent;
        this.fridayEvent = fridayEvent;
        this.saturdayEvent = saturdayEvent;
        this.sundayEvent = sundayEvent;
        this.year = year;
        this.month = month;
    }
}
