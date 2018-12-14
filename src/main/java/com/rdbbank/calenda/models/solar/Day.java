package com.rdbbank.calenda.models.solar;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.models.base.BaseProThree;
import com.rdbbank.calenda.models.secusers.SecUser;

import javax.persistence.*;
import java.util.Set;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Entity
@Table(name = "td_day")
public class Day extends BaseProThree{

    private Set<DateNumberDayDetail> dateNumberDayDetails;

    @OneToMany(mappedBy = "day", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<DateNumberDayDetail> getDateNumberDayDetails() {
        return dateNumberDayDetails;
    }

    public void setDateNumberDayDetails(Set<DateNumberDayDetail> dateNumberDayDetails) {
        this.dateNumberDayDetails = dateNumberDayDetails;
    }

    private Set<Month> months;

    public Day(String num, Integer numEn, String des, String desEn, SecUser secUser) {
        super(num, numEn, des, desEn, secUser);
    }

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "td_day_month_detail", joinColumns = @JoinColumn(name = "day_id"), inverseJoinColumns = @JoinColumn(name = "month_id"))
    public Set<Month> getMonths() {
        return months;
    }

    public void setMonths(Set<Month> months) {
        this.months = months;
    }

    public Day(){

    }
}
