package com.rdbbank.calenda.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rdbbank.calenda.models.base.BaseEntity;
import com.rdbbank.calenda.models.base.BaseProThree;
import com.rdbbank.calenda.models.secusers.SecUser;

import javax.persistence.*;
import java.util.Set;

/**
 * Create By: Ron Rith
 * Create Date on: 12/12/2018.
 */
@Entity
@Table(name = "td_date_number")
public class DateNumber extends BaseProThree {

    private Set<Day> days;

    public DateNumber(String num, Integer numEn, String des, String desEn, SecUser secUser) {
        super(num, numEn, des, desEn, secUser);
    }

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "td_date_number_day_detail", joinColumns = @JoinColumn(name = "date_number_id"), inverseJoinColumns = @JoinColumn(name = "day_id"))
    public Set<Day> getDays() {
        return days;
    }

    public void setDays(Set<Day> days) {
        this.days = days;
    }
}
