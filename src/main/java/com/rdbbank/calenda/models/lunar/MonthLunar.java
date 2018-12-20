package com.rdbbank.calenda.models.lunar;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.models.base.BaseProThree;
import com.rdbbank.calenda.models.secusers.SecUser;

import javax.persistence.*;
import java.util.Set;

/**
 * Create By: Ron Rith
 * Create Date on: 12/14/2018.
 */
@Entity
@Table(name = "td_month_lunar")
public class MonthLunar extends BaseProThree{
    //month_kh_lunar (Meak,Bus) ; lunar_onth
    private Set<YearLunar> yearLunars;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "td_month_lunar_detail", joinColumns = @JoinColumn(name = "month_lunar_id"), inverseJoinColumns = @JoinColumn(name = "year_lunar_id"))
    public Set<YearLunar> getYearLunars() {
        return yearLunars;
    }

    public void setYearLunars(Set<YearLunar> yearLunars) {
        this.yearLunars = yearLunars;
    }

    public MonthLunar(Set<YearLunar> yearLunars) {
        this.yearLunars = yearLunars;
    }

    public MonthLunar(String num, Integer numEn, String des, String desEn, SecUser secUser, Set<YearLunar> yearLunars) {
        super(num, numEn, des, desEn, secUser);
        this.yearLunars = yearLunars;
    }

    public MonthLunar(){

    }
}
