package com.rdbbank.calenda.models;

import com.rdbbank.calenda.models.base.BaseProThree;
import com.rdbbank.calenda.models.secusers.SecUser;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Entity
@Table(name = "td_month")
public class Month extends BaseProThree{

    public Month(String num, Integer numEn, String des, String desEn, SecUser secUser) {
        super(num, numEn, des, desEn, secUser);
    }
}
