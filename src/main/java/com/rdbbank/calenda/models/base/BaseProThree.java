package com.rdbbank.calenda.models.base;

import com.rdbbank.calenda.models.secusers.SecUser;

import javax.persistence.*;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@MappedSuperclass
public class BaseProThree extends BaseEntity{
    private String num;

    private Integer numEn;

    private String des;

    private String desEn;

    private SecUser secUser;

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

    public BaseProThree(String num, Integer numEn, String des, String desEn, SecUser secUser) {
        this.num = num;
        this.numEn = numEn;
        this.des = des;
        this.desEn = desEn;
        this.secUser = secUser;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Column(name = "num_en")
    public Integer getNumEn() {
        return numEn;
    }

    public void setNumEn(Integer numEn) {
        this.numEn = numEn;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sec_user_id")
    public SecUser getSecUser() {
        return secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }
}
