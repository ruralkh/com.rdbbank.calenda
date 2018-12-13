package com.rdbbank.calenda.models;

import javax.persistence.*;
import java.io.Serializable;

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
