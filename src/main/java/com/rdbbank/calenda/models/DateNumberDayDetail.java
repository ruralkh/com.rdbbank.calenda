package com.rdbbank.calenda.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rdbbank.calenda.models.lunar.*;
import com.rdbbank.calenda.models.solar.DateNumber;
import com.rdbbank.calenda.models.solar.Day;
import com.rdbbank.calenda.models.solar.Month;
import com.rdbbank.calenda.models.solar.Year;

import javax.persistence.*;
import java.util.Set;

/**
 * Create By: Ron Rith
 * Create Date on: 12/12/2018.
 */
@Entity
@Table(name = "td_date_day_detail")
public class DateNumberDayDetail{

    private Long id;

    private String monthReference;

    private DateNumber dateNumber;

    private Day day;

    private Month month;

    private Year year;

    private MonthLunar monthLunar;

    private YearLunar yearLunar;

    private YearBuddhaEra yearBuddhaEra;

    private DayNumLunar dayNumLunar;

    private MoonNumber moonNumber;

    private Set<Event> event;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "td_dn_event_detail", joinColumns = @JoinColumn(name = "dnd_id"), inverseJoinColumns = @JoinColumn(name = "event_id"))
    public Set<Event> getEvent() {
        return event;
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }


    @ManyToOne
    @JoinColumn(name = "moon_id")
    public MoonNumber getMoonNumber() {
        return moonNumber;
    }

    public void setMoonNumber(MoonNumber moonNumber) {
        this.moonNumber = moonNumber;
    }

    @ManyToOne
    @JoinColumn(name = "day_num_lunar_id")
    public DayNumLunar getDayNumLunar() {
        return dayNumLunar;
    }

    public void setDayNumLunar(DayNumLunar dayNumLunar) {
        this.dayNumLunar = dayNumLunar;
    }

    @ManyToOne
    @JoinColumn(name = "year_buddha_id")
    public YearBuddhaEra getYearBuddhaEra() {
        return yearBuddhaEra;
    }

    public void setYearBuddhaEra(YearBuddhaEra yearBuddhaEra) {
        this.yearBuddhaEra = yearBuddhaEra;
    }

    @ManyToOne
    @JoinColumn(name = "year_lunar_id")
    public YearLunar getYearLunar() {
        return yearLunar;
    }

    public void setYearLunar(YearLunar yearLunar) {
        this.yearLunar = yearLunar;
    }

    @ManyToOne
    @JoinColumn(name = "month_lunar_id")
    public MonthLunar getMonthLunar() {
        return monthLunar;
    }

    public void setMonthLunar(MonthLunar monthLunar) {
        this.monthLunar = monthLunar;
    }

    @Column(name = "month_reference")
    public String getMonthReference() {
        return monthReference;
    }

    public void setMonthReference(String monthReference) {
        this.monthReference = monthReference;
    }

    @ManyToOne
    @JoinColumn(name = "date_number_id")
    public DateNumber getDateNumber() {
        return dateNumber;
    }

    public void setDateNumber(DateNumber dateNumber) {
        this.dateNumber = dateNumber;
    }

    @ManyToOne
    @JoinColumn(name = "date_id")
    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    @ManyToOne
    @JoinColumn(name = "month_id")
    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    @ManyToOne
    @JoinColumn(name = "year_id")
    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
