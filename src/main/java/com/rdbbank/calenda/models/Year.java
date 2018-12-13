package com.rdbbank.calenda.models;

import com.rdbbank.calenda.models.base.BaseProThree;
import com.rdbbank.calenda.models.secusers.SecUser;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Entity
@Table(name = "td_year")
public class Year extends BaseProThree{

    private Set<DateNumberDayDetail> dateNumberDayDetails;

    public Year(String num, Integer numEn, String des, String desEn, SecUser secUser) {
        super(num, numEn, des, desEn, secUser);
    }

    @OneToMany(mappedBy = "year", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<DateNumberDayDetail> getDateNumberDayDetails() {
        return dateNumberDayDetails;
    }

    public void setDateNumberDayDetails(Set<DateNumberDayDetail> dateNumberDayDetails) {
        this.dateNumberDayDetails = dateNumberDayDetails;
    }

    public Year(){
        super();
    }
}
