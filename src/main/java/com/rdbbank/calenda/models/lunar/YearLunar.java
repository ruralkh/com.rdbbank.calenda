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
@Table(name = "td_year_lunar")
public class YearLunar extends BaseProThree{
    //year_kh_lunar (Ex: Jut,chrol,..)
    private Set<YearBuddhaEra> yearBuddhaEras;

    private Set<DateNumberDayDetail> dateNumberDayDetails;

    @OneToMany(mappedBy = "yearLunar",cascade = CascadeType.ALL,orphanRemoval = true)
    public Set<DateNumberDayDetail> getDateNumberDayDetails() {
        return dateNumberDayDetails;
    }

    public void setDateNumberDayDetails(Set<DateNumberDayDetail> dateNumberDayDetails) {
        this.dateNumberDayDetails = dateNumberDayDetails;
    }

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "td_year_lunar_buddha_detail", joinColumns = @JoinColumn(name = "year_lunar_id"), inverseJoinColumns = @JoinColumn(name = "year_buddha_id"))
    public Set<YearBuddhaEra> getYearBuddhaEras() {
        return yearBuddhaEras;
    }

    public void setYearBuddhaEras(Set<YearBuddhaEra> yearBuddhaEras) {
        this.yearBuddhaEras = yearBuddhaEras;
    }

    public YearLunar() {
    }

    public YearLunar(String num, Integer numEn, String des, String desEn, SecUser secUser, Set<YearBuddhaEra> yearBuddhaEras, Set<DateNumberDayDetail> dateNumberDayDetails) {
        super(num, numEn, des, desEn, secUser);
        this.yearBuddhaEras = yearBuddhaEras;
        this.dateNumberDayDetails = dateNumberDayDetails;
    }
}
