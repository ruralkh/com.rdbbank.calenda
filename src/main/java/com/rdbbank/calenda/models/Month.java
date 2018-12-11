package com.rdbbank.calenda.models;

import com.rdbbank.calenda.models.base.BaseProThree;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Entity
@Table(name = "td_month")
public class Month extends BaseProThree{
    public Month(String des, String desEn) {
        super(des, desEn);
    }
}
