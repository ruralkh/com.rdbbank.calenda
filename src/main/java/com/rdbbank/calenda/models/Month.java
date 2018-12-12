package com.rdbbank.calenda.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rdbbank.calenda.models.base.BaseProThree;
import com.rdbbank.calenda.models.secusers.SecUser;

import javax.persistence.*;
import java.util.Set;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Entity
@Table(name = "td_month")
public class Month extends BaseProThree{

    private Set<Year> years;

    public Month(String num, Integer numEn, String des, String desEn, SecUser secUser) {
        super(num, numEn, des, desEn, secUser);
    }

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "td_month_year_detail", joinColumns = @JoinColumn(name = "month_id"), inverseJoinColumns = @JoinColumn(name = "year_id"))
    public Set<Year> getYears() {
        return years;
    }

    public void setYears(Set<Year> years) {
        this.years = years;
    }
}
