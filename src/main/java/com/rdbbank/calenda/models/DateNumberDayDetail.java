package com.rdbbank.calenda.models;

import com.rdbbank.calenda.models.lunar.DayNumLunar;
import com.rdbbank.calenda.models.lunar.MonthLunar;
import com.rdbbank.calenda.models.lunar.YearBuddhaEra;
import com.rdbbank.calenda.models.lunar.YearLunar;
import com.rdbbank.calenda.models.solar.DateNumber;
import com.rdbbank.calenda.models.solar.Day;
import com.rdbbank.calenda.models.solar.Month;
import com.rdbbank.calenda.models.solar.Year;

import javax.persistence.*;

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
