package com.rdbbank.calenda.models;

import com.rdbbank.calenda.models.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Create By: Ron Rith
 * Create Date on: 12/26/2018.
 */
@Entity
@Table(name = "td_data_month_master")
public class DataMonthMaster extends BaseEntity {
    private String mondaySolarNum;

    private String tuesdaySolarNum;

    private String wednesdaySolarNum;

    private String thursdaySolarNum;

    private String fridaySolarNum;

    private String saturdaySolarNum;

    private String sundaySolarNum;

    private String mondayTOPRightCO;

    private String tuesdayTOPRightCO;

    private String wednesdayTOPRightCO;

    private String thursdayTOPRightCO;

    private String fridayTOPRightCO;

    private String saturdayTOPRightCO;

    private String sundayTOPRightCO;

    private String mondayMidRightCO;

    private String tuesdayMidRightCO;

    private String wednesdayMidRightCO;

    private String thursdayMidRightCO;

    private String fridayMidRightCO;

    private String saturdayMidRightCO;

    private String sundayMidRightCO;

    private String mondayUnderRightCO;

    private String tuesdayUnderRightCO;

    private String wednesdayUnderRightCO;

    private String thursdayUnderRightCO;

    private String fridayUnderRightCO;

    private String saturdayUnderRightCO;

    private String sundayUnderRightCO;

    private String mondayTOPURL;

    private String tuesdayTOPURL;

    private String wednesdayTOPURL;

    private String thursdayTOPURL;

    private String fridayTOPURL;

    private String saturdayTOPURL;

    private String sundayTOPURL;

    private String holiday1;

    private String holiday2;

    private String holiday3;

    private String holiday4;

    private String holiday5;

    private String month;

    private String monthEn;

    private String year;

    private String yearLunar;

    private String yearBuddhaEra;

    private String numMonth;

    @Column(name = "monday_solar_num",length = 30)
    public String getMondaySolarNum() {
        return mondaySolarNum;
    }

    public void setMondaySolarNum(String mondaySolarNum) {
        this.mondaySolarNum = mondaySolarNum;
    }

    @Column(name = "tuesday_solar_num",length = 30)
    public String getTuesdaySolarNum() {
        return tuesdaySolarNum;
    }

    public void setTuesdaySolarNum(String tuesdaySolarNum) {
        this.tuesdaySolarNum = tuesdaySolarNum;
    }

    @Column(name = "wednesday_solar_num",length = 30)
    public String getWednesdaySolarNum() {
        return wednesdaySolarNum;
    }

    public void setWednesdaySolarNum(String wednesdaySolarNum) {
        this.wednesdaySolarNum = wednesdaySolarNum;
    }

    @Column(name = "thursday_solar_num",length = 30)
    public String getThursdaySolarNum() {
        return thursdaySolarNum;
    }

    public void setThursdaySolarNum(String thursdaySolarNum) {
        this.thursdaySolarNum = thursdaySolarNum;
    }

    @Column(name = "friday_solar_num",length = 30)
    public String getFridaySolarNum() {
        return fridaySolarNum;
    }

    public void setFridaySolarNum(String fridaySolarNum) {
        this.fridaySolarNum = fridaySolarNum;
    }

    @Column(name = "saturday_solar_num",length = 30)
    public String getSaturdaySolarNum() {
        return saturdaySolarNum;
    }

    public void setSaturdaySolarNum(String saturdaySolarNum) {
        this.saturdaySolarNum = saturdaySolarNum;
    }

    @Column(name = "sunday_solar_num",length = 30)
    public String getSundaySolarNum() {
        return sundaySolarNum;
    }

    public void setSundaySolarNum(String sundaySolarNum) {
        this.sundaySolarNum = sundaySolarNum;
    }

    @Column(name = "monday_topright_co",length = 30)
    public String getMondayTOPRightCO() {
        return mondayTOPRightCO;
    }

    public void setMondayTOPRightCO(String mondayTOPRightCO) {
        this.mondayTOPRightCO = mondayTOPRightCO;
    }

    @Column(name = "tuesday_topright_co",length = 30)
    public String getTuesdayTOPRightCO() {
        return tuesdayTOPRightCO;
    }

    public void setTuesdayTOPRightCO(String tuesdayTOPRightCO) {
        this.tuesdayTOPRightCO = tuesdayTOPRightCO;
    }

    @Column(name = "wednesday_topright_co",length = 30)
    public String getWednesdayTOPRightCO() {
        return wednesdayTOPRightCO;
    }

    public void setWednesdayTOPRightCO(String wednesdayTOPRightCO) {
        this.wednesdayTOPRightCO = wednesdayTOPRightCO;
    }

    @Column(name = "thursday_topright_co",length = 30)
    public String getThursdayTOPRightCO() {
        return thursdayTOPRightCO;
    }

    public void setThursdayTOPRightCO(String thursdayTOPRightCO) {
        this.thursdayTOPRightCO = thursdayTOPRightCO;
    }

    @Column(name = "friday_topright_co",length = 30)
    public String getFridayTOPRightCO() {
        return fridayTOPRightCO;
    }

    public void setFridayTOPRightCO(String fridayTOPRightCO) {
        this.fridayTOPRightCO = fridayTOPRightCO;
    }

    @Column(name = "saturday_topright_co",length = 30)
    public String getSaturdayTOPRightCO() {
        return saturdayTOPRightCO;
    }

    public void setSaturdayTOPRightCO(String saturdayTOPRightCO) {
        this.saturdayTOPRightCO = saturdayTOPRightCO;
    }

    @Column(name = "sunday_topright_co",length = 30)
    public String getSundayTOPRightCO() {
        return sundayTOPRightCO;
    }

    public void setSundayTOPRightCO(String sundayTOPRightCO) {
        this.sundayTOPRightCO = sundayTOPRightCO;
    }

    @Column(name = "monday_midpright_co",length = 30)
    public String getMondayMidRightCO() {
        return mondayMidRightCO;
    }

    public void setMondayMidRightCO(String mondayMidRightCO) {
        this.mondayMidRightCO = mondayMidRightCO;
    }

    @Column(name = "tuesday_midpright_co",length = 30)
    public String getTuesdayMidRightCO() {
        return tuesdayMidRightCO;
    }

    public void setTuesdayMidRightCO(String tuesdayMidRightCO) {
        this.tuesdayMidRightCO = tuesdayMidRightCO;
    }

    @Column(name = "wednesday_midpright_co",length = 30)
    public String getWednesdayMidRightCO() {
        return wednesdayMidRightCO;
    }

    public void setWednesdayMidRightCO(String wednesdayMidRightCO) {
        this.wednesdayMidRightCO = wednesdayMidRightCO;
    }

    @Column(name = "thursday_midpright_co",length = 30)
    public String getThursdayMidRightCO() {
        return thursdayMidRightCO;
    }

    public void setThursdayMidRightCO(String thursdayMidRightCO) {
        this.thursdayMidRightCO = thursdayMidRightCO;
    }

    @Column(name = "friday_midpright_co",length = 30)
    public String getFridayMidRightCO() {
        return fridayMidRightCO;
    }

    public void setFridayMidRightCO(String fridayMidRightCO) {
        this.fridayMidRightCO = fridayMidRightCO;
    }

    @Column(name = "saturday_midpright_co",length = 30)
    public String getSaturdayMidRightCO() {
        return saturdayMidRightCO;
    }

    public void setSaturdayMidRightCO(String saturdayMidRightCO) {
        this.saturdayMidRightCO = saturdayMidRightCO;
    }

    @Column(name = "sunday_midpright_co",length = 30)
    public String getSundayMidRightCO() {
        return sundayMidRightCO;
    }

    public void setSundayMidRightCO(String sundayMidRightCO) {
        this.sundayMidRightCO = sundayMidRightCO;
    }

    @Column(name = "monday_underpright_co",length = 30)
    public String getMondayUnderRightCO() {
        return mondayUnderRightCO;
    }

    public void setMondayUnderRightCO(String mondayUnderRightCO) {
        this.mondayUnderRightCO = mondayUnderRightCO;
    }

    @Column(name = "tuesday_underpright_co",length = 30)
    public String getTuesdayUnderRightCO() {
        return tuesdayUnderRightCO;
    }

    public void setTuesdayUnderRightCO(String tuesdayUnderRightCO) {
        this.tuesdayUnderRightCO = tuesdayUnderRightCO;
    }

    @Column(name = "wednesday_underpright_co",length = 30)
    public String getWednesdayUnderRightCO() {
        return wednesdayUnderRightCO;
    }

    public void setWednesdayUnderRightCO(String wednesdayUnderRightCO) {
        this.wednesdayUnderRightCO = wednesdayUnderRightCO;
    }

    @Column(name = "thursday_underpright_co",length = 30)
    public String getThursdayUnderRightCO() {
        return thursdayUnderRightCO;
    }

    public void setThursdayUnderRightCO(String thursdayUnderRightCO) {
        this.thursdayUnderRightCO = thursdayUnderRightCO;
    }

    @Column(name = "friday_underpright_co",length = 30)
    public String getFridayUnderRightCO() {
        return fridayUnderRightCO;
    }

    public void setFridayUnderRightCO(String fridayUnderRightCO) {
        this.fridayUnderRightCO = fridayUnderRightCO;
    }

    @Column(name = "saturday_underpright_co",length = 30)
    public String getSaturdayUnderRightCO() {
        return saturdayUnderRightCO;
    }

    public void setSaturdayUnderRightCO(String saturdayUnderRightCO) {
        this.saturdayUnderRightCO = saturdayUnderRightCO;
    }

    @Column(name = "sunday_underpright_co",length = 30)
    public String getSundayUnderRightCO() {
        return sundayUnderRightCO;
    }

    public void setSundayUnderRightCO(String sundayUnderRightCO) {
        this.sundayUnderRightCO = sundayUnderRightCO;
    }

    @Column(name = "monday_top_url",length = 30)
    public String getMondayTOPURL() {
        return mondayTOPURL;
    }

    public void setMondayTOPURL(String mondayTOPURL) {
        this.mondayTOPURL = mondayTOPURL;
    }

    @Column(name = "tuesday_top_url",length = 30)
    public String getTuesdayTOPURL() {
        return tuesdayTOPURL;
    }

    public void setTuesdayTOPURL(String tuesdayTOPURL) {
        this.tuesdayTOPURL = tuesdayTOPURL;
    }

    @Column(name = "wednesday_top_url",length = 30)
    public String getWednesdayTOPURL() {
        return wednesdayTOPURL;
    }

    public void setWednesdayTOPURL(String wednesdayTOPURL) {
        this.wednesdayTOPURL = wednesdayTOPURL;
    }

    @Column(name = "thursday_top_url",length = 30)
    public String getThursdayTOPURL() {
        return thursdayTOPURL;
    }

    public void setThursdayTOPURL(String thursdayTOPURL) {
        this.thursdayTOPURL = thursdayTOPURL;
    }

    @Column(name = "friday_top_url",length = 30)
    public String getFridayTOPURL() {
        return fridayTOPURL;
    }

    public void setFridayTOPURL(String fridayTOPURL) {
        this.fridayTOPURL = fridayTOPURL;
    }

    @Column(name = "saturday_top_url",length = 30)
    public String getSaturdayTOPURL() {
        return saturdayTOPURL;
    }

    public void setSaturdayTOPURL(String saturdayTOPURL) {
        this.saturdayTOPURL = saturdayTOPURL;
    }

    @Column(name = "sunday_top_url",length = 30)
    public String getSundayTOPURL() {
        return sundayTOPURL;
    }

    public void setSundayTOPURL(String sundayTOPURL) {
        this.sundayTOPURL = sundayTOPURL;
    }

    @Column(name = "holiday1",length = 30)
    public String getHoliday1() {
        return holiday1;
    }

    public void setHoliday1(String holiday1) {
        this.holiday1 = holiday1;
    }

    @Column(name = "holiday2",length = 30)
    public String getHoliday2() {
        return holiday2;
    }

    public void setHoliday2(String holiday2) {
        this.holiday2 = holiday2;
    }

    @Column(name = "holiday3",length = 30)
    public String getHoliday3() {
        return holiday3;
    }

    public void setHoliday3(String holiday3) {
        this.holiday3 = holiday3;
    }

    @Column(name = "holiday4",length = 30)
    public String getHoliday4() {
        return holiday4;
    }

    public void setHoliday4(String holiday4) {
        this.holiday4 = holiday4;
    }

    @Column(name = "holiday5",length = 30)
    public String getHoliday5() {
        return holiday5;
    }

    public void setHoliday5(String holiday5) {
        this.holiday5 = holiday5;
    }

    @Column(name = "month",length = 30)
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Column(name = "month_en",length = 30)
    public String getMonthEn() {
        return monthEn;
    }

    public void setMonthEn(String monthEn) {
        this.monthEn = monthEn;
    }

    @Column(name = "year",length = 30)
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Column(name = "year_lunar",length = 30)
    public String getYearLunar() {
        return yearLunar;
    }

    public void setYearLunar(String yearLunar) {
        this.yearLunar = yearLunar;
    }

    @Column(name = "year_buddha_era",length = 30)
    public String getYearBuddhaEra() {
        return yearBuddhaEra;
    }

    public void setYearBuddhaEra(String yearBuddhaEra) {
        this.yearBuddhaEra = yearBuddhaEra;
    }

    @Column(name = "num_month",length = 20)
    public String getNumMonth() {
        return numMonth;
    }

    public void setNumMonth(String numMonth) {
        this.numMonth = numMonth;
    }
}
