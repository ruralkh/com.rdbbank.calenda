package com.rdbbank.calenda.models.lunar;

import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.models.base.BaseProThree;

import javax.persistence.*;
import java.util.Set;

/**
 * Create By: Ron Rith
 * Create Date on: 12/18/2018.
 */
@Entity
@Table(name = "td_moon_number")
public class MoonNumber extends BaseProThree {
    private DayNumLunarType dayNumLunarType;

    private Set<DateNumberDayDetail> dateNumberDayDetails;

    private String desSecond;

    @Column(name = "des_second")
    public String getDesSecond() {
        return desSecond;
    }

    public void setDesSecond(String desSecond) {
        this.desSecond = desSecond;
    }

    @Column(name = "dn_lunar_type")
    @Enumerated(EnumType.STRING)
    public DayNumLunarType getDayNumLunarType() {
        return dayNumLunarType;
    }

    public void setDayNumLunarType(DayNumLunarType dayNumLunarType) {
        this.dayNumLunarType = dayNumLunarType;
    }

    @OneToMany(mappedBy = "moonNumber",cascade = CascadeType.ALL,orphanRemoval = true)
    public Set<DateNumberDayDetail> getDateNumberDayDetails() {
        return dateNumberDayDetails;
    }

    public void setDateNumberDayDetails(Set<DateNumberDayDetail> dateNumberDayDetails) {
        this.dateNumberDayDetails = dateNumberDayDetails;
    }
}
