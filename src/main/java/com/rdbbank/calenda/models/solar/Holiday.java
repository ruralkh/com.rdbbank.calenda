package com.rdbbank.calenda.models.solar;

import com.rdbbank.calenda.models.base.BaseEntity;
import com.rdbbank.calenda.models.base.BaseProThree;
import com.rdbbank.calenda.models.secusers.SecUser;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Create By: Ron Rith
 * Create Date on: 12/12/2018.
 */
@Entity
@Table(name = "td_holiday")
public class Holiday extends BaseProThree{
    public Holiday(String num, Integer numEn, String des, String desEn, SecUser secUser) {
        super(num, numEn, des, desEn, secUser);
    }
    public Holiday(){

    }
}
