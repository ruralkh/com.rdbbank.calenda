package com.rdbbank.calenda.models.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@MappedSuperclass
public class BaseProThree extends BaseEntity{
    private String des;

    private String desEn;

    public BaseProThree(String des, String desEn) {
        this.des = des;
        this.desEn = desEn;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Column(name = "des_en")
    public String getDesEn() {
        return desEn;
    }

    public void setDesEn(String desEn) {
        this.desEn = desEn;
    }
}
