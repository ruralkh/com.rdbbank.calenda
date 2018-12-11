package com.rdbbank.calenda.models;

import com.rdbbank.calenda.models.base.BaseProThree;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Entity
@Table(name = "td_day")
public class Day extends BaseProThree{
    public Day(String des, String desEn) {
        super(des, desEn);
    }
}
