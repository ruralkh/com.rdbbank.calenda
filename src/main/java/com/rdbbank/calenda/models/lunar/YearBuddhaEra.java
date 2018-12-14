package com.rdbbank.calenda.models.lunar;

import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.models.base.BaseProThree;
import com.rdbbank.calenda.models.secusers.SecUser;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

/**
 * Create By: Ron Rith
 * Create Date on: 12/14/2018.
 */
@Entity
@Table(name = "td_year_buddha_era")
public class YearBuddhaEra extends BaseProThree{
    //year_buddha_era (Ex: 2562,..) ; year_buddha_era
    private Set<DateNumberDayDetail> dateNumberDayDetails;

    @OneToMany(mappedBy = "yearBuddhaEra",cascade = CascadeType.ALL,orphanRemoval = true)
    public Set<DateNumberDayDetail> getDateNumberDayDetails() {
        return dateNumberDayDetails;
    }

    public void setDateNumberDayDetails(Set<DateNumberDayDetail> dateNumberDayDetails) {
        this.dateNumberDayDetails = dateNumberDayDetails;
    }

    public YearBuddhaEra(String num, Integer numEn, String des, String desEn, SecUser secUser, Set<DateNumberDayDetail> dateNumberDayDetails) {
        super(num, numEn, des, desEn, secUser);
        this.dateNumberDayDetails = dateNumberDayDetails;
    }
    public YearBuddhaEra(){

    }
}
