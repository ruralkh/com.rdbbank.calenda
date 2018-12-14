package com.rdbbank.calenda.models.solar;

import com.rdbbank.calenda.models.DateNumberDayDetail;
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

    private Set<DateNumberDayDetail> dateNumberDayDetails;

    @OneToMany(mappedBy = "dateNumber", cascade = CascadeType.ALL, orphanRemoval = true)
    public Set<DateNumberDayDetail> getDateNumberDayDetails() {
        return dateNumberDayDetails;
    }

    public void setDateNumberDayDetails(Set<DateNumberDayDetail> dateNumberDayDetails) {
        this.dateNumberDayDetails = dateNumberDayDetails;
    }

    public DateNumber(String num, Integer numEn, String des, String desEn, SecUser secUser) {
        super(num, numEn, des, desEn, secUser);
    }

    public DateNumber() {
        super();
    }
}
