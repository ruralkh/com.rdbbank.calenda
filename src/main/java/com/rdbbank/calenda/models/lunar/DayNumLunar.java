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
@Table(name = "td_day_num_lunar")
public class DayNumLunar extends BaseProThree{
    //day_kh_lunar (kert,roch)
    private DayNumLunarType dayNumLunarType;

    private Set<MonthLunar> monthLunars;

    private Set<DateNumberDayDetail> dateNumberDayDetails;

    @OneToMany(mappedBy = "dayNumLunar",cascade = CascadeType.ALL,orphanRemoval = true)
    public Set<DateNumberDayDetail> getDateNumberDayDetails() {
        return dateNumberDayDetails;
    }

    public void setDateNumberDayDetails(Set<DateNumberDayDetail> dateNumberDayDetails) {
        this.dateNumberDayDetails = dateNumberDayDetails;
    }

    public DayNumLunar(String num, Integer numEn, String des, String desEn, SecUser secUser, DayNumLunarType dayNumLunarType, Set<MonthLunar> monthLunars, Set<DateNumberDayDetail> dateNumberDayDetails) {
        super(num, numEn, des, desEn, secUser);
        this.dayNumLunarType = dayNumLunarType;
        this.monthLunars = monthLunars;
        this.dateNumberDayDetails = dateNumberDayDetails;
    }

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "td_day_num_lunar_month_detail", joinColumns = @JoinColumn(name = "day_num_lunar_id"), inverseJoinColumns = @JoinColumn(name = "month_lunar_id"))
    public Set<MonthLunar> getMonthLunars() {
        return monthLunars;
    }

    public void setMonthLunars(Set<MonthLunar> monthLunars) {
        this.monthLunars = monthLunars;
    }

    @Column(name = "dn_lunar_type")
    @Enumerated(EnumType.STRING)
    public DayNumLunarType getDayNumLunarType() {
        return dayNumLunarType;
    }

    public void setDayNumLunarType(DayNumLunarType dayNumLunarType) {
        this.dayNumLunarType = dayNumLunarType;
    }

    public DayNumLunar(){
    }

}
