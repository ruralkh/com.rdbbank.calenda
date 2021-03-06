package com.rdbbank.calenda.services.monthmaster.impl;

import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.models.MonthMaster;
import com.rdbbank.calenda.models.base.BaseDays;
import com.rdbbank.calenda.repositories.monthmaster.MonthMasterRepository;
import com.rdbbank.calenda.services.monthmaster.MonthMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create By: Ron Rith
 * Create Date on: 12/13/2018.
 */
@Service
@Transactional
public class MonthMasterServiceImpl implements MonthMasterService{

    @Autowired
    private MonthMasterRepository monthMasterRepository;

    @Override
    public void save(MonthMaster monthMaster) {
        monthMasterRepository.save(monthMaster);
    }

    @Override
    public List<MonthMaster> getMonthMasters(List<String> numSundays,
                                             List<String> numMondays,
                                             List<String> numTuesday,
                                             List<String> numWednesday,
                                             List<String> numThursday,
                                             List<String> numFriday,
                                             List<String> numSaturday,
                                             List<String> numSundaysMonthLunar,
                                             List<String> numMondaysMonthLunar,
                                             List<String> numTuesdayMonthLunar,
                                             List<String> numWednesdayMonthLunar,
                                             List<String> numThursdayMonthLunar,
                                             List<String> numFridayMonthLunar,
                                             List<String> numSaturdayMonthLunar,
                                             List<String> numSundaysDayNumLunar,
                                             List<String> numMondaysDayNumLunar,
                                             List<String> numTuesdayDayNumLunar,
                                             List<String> numWednesdayDayNumLunar,
                                             List<String> numThursdayDayNumLunar,
                                             List<String> numFridayDayNumLunar,
                                             List<String> numSaturdayDayNumLunar,
                                             Integer numMonth
    ){
        MonthMaster monthMaster = new MonthMaster();
        MonthMaster monthMasterFiveSunday = new MonthMaster();
        MonthMaster monthMasterFiveMonday = new MonthMaster();
        MonthMaster monthMasterFiveTuesday = new MonthMaster();
        MonthMaster monthMasterFiveWednesday = new MonthMaster();
        MonthMaster monthMasterFiveThursday = new MonthMaster();
        MonthMaster monthMasterFiveFriday = new MonthMaster();
        MonthMaster monthMasterFiveSaturday = new MonthMaster();
        /*MonthLunar*/
        MonthMaster monthMasterFiveSundayMonthLunar = new MonthMaster();
        MonthMaster monthMasterFiveMondayMonthLunar = new MonthMaster();
        MonthMaster monthMasterFiveTuesdayMonthLunar = new MonthMaster();
        MonthMaster monthMasterFiveWednesdayMonthLunar = new MonthMaster();
        MonthMaster monthMasterFiveThursdayMonthLunar = new MonthMaster();
        MonthMaster monthMasterFiveFridayMonthLunar = new MonthMaster();
        MonthMaster monthMasterFiveSaturdayMonthLunar = new MonthMaster();
        MonthMaster monthMasterHelper = new MonthMaster();
        /*MonthLunar*/
        MonthMaster monthMasterFiveSundayDayNLunar = new MonthMaster();
        MonthMaster monthMasterFiveMondayDayNLunar = new MonthMaster();
        MonthMaster monthMasterFiveTuesdayDayNLunar = new MonthMaster();
        MonthMaster monthMasterFiveWednesdayDayNLunar = new MonthMaster();
        MonthMaster monthMasterFiveThursdayDayNLunar = new MonthMaster();
        MonthMaster monthMasterFiveFridayDayNLunar = new MonthMaster();
        MonthMaster monthMasterFiveSaturdayDayNLunar = new MonthMaster();

        List<MonthMaster> monthMasters = new ArrayList<>();
        if (numSundays.size() == 5 || numMondays.size() == 5 || numTuesday.size() == 5 || numWednesday.size() == 5 || numThursday.size() == 5 || numFriday.size() == 5 || numSaturday.size() == 5) {
            if (numSundays.size() == 5) {
                monthMasterFiveSunday = getMonthMasterFive(numSundays, BaseDays.SUNDAY);
            }
            if (numMondays.size() == 5) {
                monthMasterFiveMonday = getMonthMasterFive(numMondays, BaseDays.MONDAY);
            }
            if (numTuesday.size() == 5) {
                monthMasterFiveTuesday = getMonthMasterFive(numTuesday, BaseDays.TUESDAY);
            }
            if (numWednesday.size() == 5) {
                monthMasterFiveWednesday = getMonthMasterFive(numWednesday, BaseDays.WEDNESDAY);
            }
            if (numThursday.size() == 5) {
                monthMasterFiveThursday = getMonthMasterFive(numThursday, BaseDays.THURSDAY);
            }
            if (numFriday.size() == 5) {
                monthMasterFiveFriday = getMonthMasterFive(numFriday, BaseDays.FRIDAY);
            }
            if (numSaturday.size() == 5) {
                monthMasterFiveSaturday = getMonthMasterFive(numSaturday, BaseDays.SATURDAY);
            }
            /*MonthLunar*/
            if (numSundaysMonthLunar.size() == 5) {
                monthMasterFiveSundayMonthLunar = getMonthMasterFive(numSundaysMonthLunar, BaseDays.SUNDAY_MONTHLUNAR);
            }
            if (numMondaysMonthLunar.size() == 5) {
                monthMasterFiveMondayMonthLunar = getMonthMasterFive(numMondaysMonthLunar, BaseDays.MONDAY_MONTHLUNAR);
            }
            if (numTuesdayMonthLunar.size() == 5) {
                monthMasterFiveTuesdayMonthLunar = getMonthMasterFive(numTuesdayMonthLunar, BaseDays.TUESDAY_MONTHLUNAR);
            }
            if (numWednesdayMonthLunar.size() == 5) {
                monthMasterFiveWednesdayMonthLunar = getMonthMasterFive(numWednesdayMonthLunar, BaseDays.WEDNESDAY_MONTHLUNAR);
            }
            if (numThursdayMonthLunar.size() == 5) {
                monthMasterFiveThursdayMonthLunar = getMonthMasterFive(numThursdayMonthLunar, BaseDays.THURSDAY_MONTHLUNAR);
            }
            if (numFridayMonthLunar.size() == 5) {
                monthMasterFiveFridayMonthLunar = getMonthMasterFive(numFridayMonthLunar, BaseDays.FRIDAY_MONTHLUNAR);
            }
            if (numSaturdayMonthLunar.size() == 5) {
                monthMasterFiveSaturdayMonthLunar = getMonthMasterFive(numSaturdayMonthLunar, BaseDays.SATURDAY_MONTHLUNAR);
            }
            /*DayNumLunar*/
            if (numSundaysDayNumLunar.size() == 5) {
                monthMasterFiveSundayDayNLunar = getMonthMasterFive(numSundaysDayNumLunar, BaseDays.SUNDAY_DAYNUMLUNAR);
            }
            if (numMondaysDayNumLunar.size() == 5) {
                monthMasterFiveMondayDayNLunar = getMonthMasterFive(numMondaysDayNumLunar, BaseDays.MONDAY_DAYNUMLUNAR);
            }
            if (numTuesdayDayNumLunar.size() == 5) {
                monthMasterFiveTuesdayDayNLunar = getMonthMasterFive(numTuesdayDayNumLunar, BaseDays.TUESDAY_DAYNUMLUNAR);
            }
            if (numWednesdayDayNumLunar.size() == 5) {
                monthMasterFiveWednesdayDayNLunar = getMonthMasterFive(numWednesdayDayNumLunar, BaseDays.WEDNESDAY_DAYNUMLUNAR);
            }
            if (numThursdayDayNumLunar.size() == 5) {
                monthMasterFiveThursdayDayNLunar = getMonthMasterFive(numThursdayDayNumLunar, BaseDays.THURSDAY_DAYNUMLUNAR);
            }
            if (numFridayDayNumLunar.size() == 5) {
                monthMasterFiveFridayDayNLunar = getMonthMasterFive(numFridayDayNumLunar, BaseDays.FRIDAY_DAYNUMLUNAR);
            }
            if (numSaturdayDayNumLunar.size() == 5) {
                monthMasterFiveSaturdayDayNLunar = getMonthMasterFive(numSaturdayDayNumLunar, BaseDays.SATURDAY_DAYNUMLUNAR);
            }
        }

        monthMasterHelper.setMonday(monthMasterFiveMonday.getMonday());
        monthMasterHelper.setTuesday(monthMasterFiveTuesday.getTuesday());
        monthMasterHelper.setWednesday(monthMasterFiveWednesday.getWednesday());
        monthMasterHelper.setThursday(monthMasterFiveThursday.getThursday());
        monthMasterHelper.setFriday(monthMasterFiveFriday.getFriday());
        monthMasterHelper.setSaturday(monthMasterFiveSaturday.getSaturday());
        monthMasterHelper.setSunday(monthMasterFiveSunday.getSunday());
        /*MonthLunar*/
        monthMasterHelper.setMondayMonthLunar(monthMasterFiveMondayMonthLunar.getMonday());
        monthMasterHelper.setTuesdayMonthLunar((monthMasterFiveTuesdayMonthLunar.getTuesday()));
        monthMasterHelper.setWednesdayMonthLunar((monthMasterFiveWednesdayMonthLunar.getWednesday()));
        monthMasterHelper.setThursdayMonthLunar((monthMasterFiveThursdayMonthLunar.getThursday()));
        monthMasterHelper.setFridayMonthLunar((monthMasterFiveFridayMonthLunar.getFriday()));
        monthMasterHelper.setSaturdayMonthLunar((monthMasterFiveSaturdayMonthLunar.getSaturday()));
        monthMasterHelper.setSundayMonthLunar((monthMasterFiveSundayMonthLunar.getSunday()));
        /*DayNumLunar*/
        monthMasterHelper.setMondayDayNumLunar(monthMasterFiveMondayDayNLunar.getMonday());
        monthMasterHelper.setTuesdayDayNumLunar(monthMasterFiveTuesdayDayNLunar.getTuesday());
        monthMasterHelper.setWednesdayDayNumLunar(monthMasterFiveWednesdayDayNLunar.getWednesday());
        monthMasterHelper.setThursdayDayNumLunar(monthMasterFiveThursdayDayNLunar.getThursday());
        monthMasterHelper.setFridayDayNumLunar(monthMasterFiveFridayDayNLunar.getFriday());
        monthMasterHelper.setSaturdayDayNumLunar(monthMasterFiveSaturdayDayNLunar.getSaturday());
        monthMasterHelper.setSundayDayNumLunar(monthMasterFiveSundayDayNLunar.getSunday());

        for (int i = 0; i < 4; i++) {
            monthMaster = getMonthMaster(numSundays, numMondays, numTuesday, numWednesday, numThursday, numFriday, numSaturday,
                    numSundaysMonthLunar, numMondaysMonthLunar, numTuesdayMonthLunar, numWednesdayMonthLunar, numThursdayMonthLunar, numFridayMonthLunar, numSaturdayMonthLunar,
                    numSundaysDayNumLunar, numMondaysDayNumLunar, numTuesdayDayNumLunar, numWednesdayDayNumLunar, numThursdayDayNumLunar, numFridayDayNumLunar, numSaturdayDayNumLunar,
                    i);
            monthMasters.add(monthMaster);
        }

        monthMasters.add(monthMasterHelper);
        return monthMasters;
    }

    @Override
    public MonthMaster getMonthMaster(List<String> numSundays,
                                      List<String> numMondays,
                                      List<String> numTuesday,
                                      List<String> numWednesday,
                                      List<String> numThursday,
                                      List<String> numFriday,
                                      List<String> numSaturday,
                                      List<String> numSundaysMonthLunar,
                                      List<String> numMondaysMonthLunar,
                                      List<String> numTuesdayMonthLunar,
                                      List<String> numWednesdayMonthLunar,
                                      List<String> numThursdayMonthLunar,
                                      List<String> numFridayMonthLunar,
                                      List<String> numSaturdayMonthLunar,
                                      List<String> numSundaysDayNumLunar,
                                      List<String> numMondaysDayNumLunar,
                                      List<String> numTuesdayDayNumLunar,
                                      List<String> numWednesdayDayNumLunar,
                                      List<String> numThursdayDayNumLunar,
                                      List<String> numFridayDayNumLunar,
                                      List<String> numSaturdayDayNumLunar,
                                      int i) {

        MonthMaster monthMaster = new MonthMaster();
        if (numSundays.get(i) != null) {
            monthMaster.setSunday(numSundays.get(i).toString());
        }
        if (numMondays.get(i) != null) {
            monthMaster.setMonday(numMondays.get(i).toString());
        }
        if (numTuesday.get(i) != null) {
            monthMaster.setTuesday(numTuesday.get(i) .toString());
        }
        if (numWednesday.get(i) != null) {
            monthMaster.setWednesday(numWednesday.get(i).toString());
        }
        if (numThursday.get(i) != null) {
            monthMaster.setThursday(numThursday.get(i) .toString());
        }
        if (numFriday.get(i) != null) {
            monthMaster.setFriday(numFriday.get(i) .toString());
        }
        if (numSaturday.get(i) != null) {
            monthMaster.setSaturday(numSaturday.get(i) .toString());
        }
        /*MonthLunar*/
        if (numSundaysMonthLunar.get(i) != null) {
            monthMaster.setSundayMonthLunar(numSundaysMonthLunar.get(i).toString());
        }
        if (numMondaysMonthLunar.get(i) != null) {
            monthMaster.setMondayMonthLunar(numMondays.get(i).toString());
        }
        if (numTuesdayMonthLunar.get(i) != null) {
            monthMaster.setTuesdayMonthLunar(numTuesday.get(i) .toString());
        }
        if (numWednesdayMonthLunar.get(i) != null) {
            monthMaster.setWednesdayMonthLunar(numWednesday.get(i).toString());
        }
        if (numThursdayMonthLunar.get(i) != null) {
            monthMaster.setThursdayMonthLunar(numThursday.get(i) .toString());
        }
        if (numFridayMonthLunar.get(i) != null) {
            monthMaster.setFridayMonthLunar(numFriday.get(i) .toString());
        }
        if (numSaturdayMonthLunar.get(i) != null) {
            monthMaster.setSaturdayMonthLunar(numSaturday.get(i) .toString());
        }
         /*DayNumberLunar*/
        if (numSundaysMonthLunar.get(i) != null) {
            monthMaster.setSundayMonthLunar(numSundaysDayNumLunar.get(i).toString());
        }
        if (numMondaysDayNumLunar.get(i) != null) {
            monthMaster.setMondayDayNumLunar(numMondaysDayNumLunar.get(i).toString());
        }
        if (numTuesdayDayNumLunar.get(i) != null) {
            monthMaster.setTuesdayDayNumLunar(numTuesdayDayNumLunar.get(i) .toString());
        }
        if (numWednesdayDayNumLunar.get(i) != null) {
            monthMaster.setWednesdayDayNumLunar(numWednesdayDayNumLunar.get(i).toString());
        }
        if (numThursdayDayNumLunar.get(i) != null) {
            monthMaster.setThursdayDayNumLunar(numThursdayDayNumLunar.get(i) .toString());
        }
        if (numFridayDayNumLunar.get(i) != null) {
            monthMaster.setFridayDayNumLunar(numFridayDayNumLunar.get(i) .toString());
        }
        if (numSaturdayDayNumLunar.get(i) != null) {
            monthMaster.setSaturdayDayNumLunar(numSaturdayDayNumLunar.get(i) .toString());
        }

        return monthMaster;
    }

    @Override
    public MonthMaster getMonthMasterFive(List<String> numDays, String dayType) {
        MonthMaster monthMaster = new MonthMaster();
        switch (dayType) {
            case BaseDays.MONDAY:
                monthMaster.setMonday(numDays.get(4).toString());
                break;
            case BaseDays.TUESDAY:
                monthMaster.setTuesday(numDays.get(4).toString());
                break;
            case BaseDays.WEDNESDAY:
                monthMaster.setWednesday(numDays.get(4).toString());
                break;
            case BaseDays.THURSDAY:
                monthMaster.setThursday(numDays.get(4).toString());
                break;
            case BaseDays.FRIDAY:
                monthMaster.setFriday(numDays.get(4).toString());
                break;
            case BaseDays.SATURDAY:
                monthMaster.setSaturday(numDays.get(4).toString());
                break;
            case BaseDays.SUNDAY:
                monthMaster.setSunday(numDays.get(4).toString());
                break;
                /*MonthLunar*/
            case BaseDays.MONDAY_MONTHLUNAR:
                monthMaster.setMondayMonthLunar(numDays.get(4).toString());
                break;
            case BaseDays.TUESDAY_MONTHLUNAR:
                monthMaster.setTuesdayMonthLunar(numDays.get(4).toString());
                break;
            case BaseDays.WEDNESDAY_MONTHLUNAR:
                monthMaster.setWednesdayMonthLunar(numDays.get(4).toString());
                break;
            case BaseDays.THURSDAY_MONTHLUNAR:
                monthMaster.setThursdayMonthLunar(numDays.get(4).toString());
                break;
            case BaseDays.FRIDAY_MONTHLUNAR:
                monthMaster.setFridayMonthLunar(numDays.get(4).toString());
                break;
            case BaseDays.SATURDAY_MONTHLUNAR:
                monthMaster.setSaturdayMonthLunar(numDays.get(4).toString());
                break;
            case BaseDays.SUNDAY_MONTHLUNAR:
                monthMaster.setSundayMonthLunar(numDays.get(4).toString());
                break;
                  /*DayNumLunar*/
            case BaseDays.MONDAY_DAYNUMLUNAR:
                monthMaster.setMondayDayNumLunar(numDays.get(4).toString());
                break;
            case BaseDays.TUESDAY_DAYNUMLUNAR:
                monthMaster.setTuesdayDayNumLunar(numDays.get(4).toString());
                break;
            case BaseDays.WEDNESDAY_DAYNUMLUNAR:
                monthMaster.setWednesdayDayNumLunar(numDays.get(4).toString());
                break;
            case BaseDays.THURSDAY_DAYNUMLUNAR:
                monthMaster.setThursdayDayNumLunar(numDays.get(4).toString());
                break;
            case BaseDays.FRIDAY_DAYNUMLUNAR:
                monthMaster.setFridayDayNumLunar(numDays.get(4).toString());
                break;
            case BaseDays.SATURDAY_DAYNUMLUNAR:
                monthMaster.setSaturdayDayNumLunar(numDays.get(4).toString());
                break;
            case BaseDays.SUNDAY_DAYNUMLUNAR:
                monthMaster.setSundayDayNumLunar(numDays.get(4).toString());
                break;

        }
        return monthMaster;
    }

    @Override
    public Map<String,List<String>> getNumEachDays(List<DateNumberDayDetail> dateNumberDayDetails,int monthNumber){
        List<String> numSundays = new ArrayList<>();
        List<String> numMondays = new ArrayList<>();
        List<String> numTuesday = new ArrayList<>();
        List<String> numWednesday = new ArrayList<>();
        List<String> numThursday = new ArrayList<>();
        List<String> numFriday = new ArrayList<>();
        List<String> numSaturday = new ArrayList<>();
        /*MonthLunar*/
        List<String> numSundaysMonthLunar = new ArrayList<>();
        List<String> numMondaysMonthLunar = new ArrayList<>();
        List<String> numTuesdayMonthLunar = new ArrayList<>();
        List<String> numWednesdayMonthLunar = new ArrayList<>();
        List<String> numThursdayMonthLunar = new ArrayList<>();
        List<String> numFridayMonthLunar = new ArrayList<>();
        List<String> numSaturdayMonthLunar = new ArrayList<>();
        /*DayLumLunar*/
        List<String> numSundaysDayNumLunar = new ArrayList<>();
        List<String> numMondaysDayNumLunar = new ArrayList<>();
        List<String> numTuesdayDayNumLunar = new ArrayList<>();
        List<String> numWednesdayDayNumLunar = new ArrayList<>();
        List<String> numThursdayDayNumLunar = new ArrayList<>();
        List<String> numFridayDayNumLunar = new ArrayList<>();
        List<String> numSaturdayDayNumLunar = new ArrayList<>();

        Map<String,List<String>> numWeekDays = new HashMap<>();

        for(DateNumberDayDetail dayDetail: dateNumberDayDetails){
            if (dayDetail.getMonth() != null && dayDetail.getMonth().getId() == monthNumber) {
                    if (dayDetail.getDateNumber().getNumEn() != null && dayDetail.getDay().getDesEn() != null) {
                        switch (dayDetail.getDay().getDesEn()) {
                            case BaseDays.SUNDAY:
                                numSundays.add(dayDetail.getDateNumber().getNumEn().toString());
                                numSundaysMonthLunar.add(dayDetail.getMonthLunar().getDes());
                                numSundaysDayNumLunar.add(dayDetail.getDayNumLunar().getNumEn().toString());
                                break;
                            case BaseDays.MONDAY:
                                numMondays.add(dayDetail.getDateNumber().getNumEn().toString());
                                numMondaysMonthLunar.add(dayDetail.getMonthLunar().getDes());
                                numMondaysDayNumLunar.add(dayDetail.getDayNumLunar().getNumEn().toString());
                                break;
                            case BaseDays.TUESDAY:
                                numTuesday.add(dayDetail.getDateNumber().getNumEn().toString());
                                numTuesdayMonthLunar.add(dayDetail.getMonthLunar().getDes());
                                numTuesdayDayNumLunar.add(dayDetail.getDayNumLunar().getNumEn().toString());
                                break;
                            case BaseDays.WEDNESDAY:
                                numWednesday.add(dayDetail.getDateNumber().getNumEn().toString());
                                numWednesdayMonthLunar.add(dayDetail.getMonthLunar().getDes());
                                numWednesdayDayNumLunar.add(dayDetail.getDayNumLunar().getNumEn().toString());
                                break;
                            case BaseDays.THURSDAY:
                                numThursday.add(dayDetail.getDateNumber().getNumEn().toString());
                                numThursdayMonthLunar.add(dayDetail.getMonthLunar().getDes());
                                numThursdayDayNumLunar.add(dayDetail.getDayNumLunar().getNumEn().toString());
                                break;
                            case BaseDays.FRIDAY:
                                numFriday.add(dayDetail.getDateNumber().getNumEn().toString());
                                numFridayMonthLunar.add(dayDetail.getMonthLunar().getDes());
                                numFridayDayNumLunar.add(dayDetail.getDayNumLunar().getNumEn().toString());
                                break;
                            case BaseDays.SATURDAY:
                                numSaturday.add(dayDetail.getDateNumber().getNumEn().toString());
                                numSaturdayMonthLunar.add(dayDetail.getMonthLunar().getDes());
                                numSaturdayDayNumLunar.add(dayDetail.getDayNumLunar().getNumEn().toString());
                                break;
                        }
                        switch (dayDetail.getMonthLunar().getDesEn()) {
                         /*   switch (dayDetail.getDay().getDesEn()) {
                                case BaseDays.SUNDAY:
                                    numSundays.add(dayDetail.getDateNumber().getNumEn().toString());
                                    numSundaysMonthLunar.add(dayDetail.getMonthLunar().getDes());
                                    numSundaysDayNumLunar.add(dayDetail.getDayNumLunar().getNumEn().toString());
                                    break;
                            }*/
                            case BaseDays.MONTHLUNAR_MAR:
                                numSundaysMonthLunar.add(dayDetail.getMonthLunar().getDes());
                                break;
                        }
                }
            }
        }

        numWeekDays.put(BaseDays.SUNDAY,numSundays);
        numWeekDays.put(BaseDays.MONDAY,numMondays);
        numWeekDays.put(BaseDays.TUESDAY,numTuesday);
        numWeekDays.put(BaseDays.WEDNESDAY,numWednesday);
        numWeekDays.put(BaseDays.THURSDAY,numThursday);
        numWeekDays.put(BaseDays.FRIDAY,numFriday);
        numWeekDays.put(BaseDays.SATURDAY,numSaturday);
        /*MonthLunar*/
        numWeekDays.put(BaseDays.SUNDAY_MONTHLUNAR,numSundaysMonthLunar);
        numWeekDays.put(BaseDays.MONDAY_MONTHLUNAR,numMondaysMonthLunar);
        numWeekDays.put(BaseDays.TUESDAY_MONTHLUNAR,numTuesdayMonthLunar);
        numWeekDays.put(BaseDays.WEDNESDAY_MONTHLUNAR,numWednesdayMonthLunar);
        numWeekDays.put(BaseDays.THURSDAY_MONTHLUNAR,numThursdayMonthLunar);
        numWeekDays.put(BaseDays.FRIDAY_MONTHLUNAR,numFridayMonthLunar);
        numWeekDays.put(BaseDays.SATURDAY_MONTHLUNAR,numSaturdayMonthLunar);
        /*DayNumLuar*/
        numWeekDays.put(BaseDays.SUNDAY_DAYNUMLUNAR,numSundaysDayNumLunar);
        numWeekDays.put(BaseDays.MONDAY_DAYNUMLUNAR,numMondaysDayNumLunar);
        numWeekDays.put(BaseDays.TUESDAY_DAYNUMLUNAR,numTuesdayDayNumLunar);
        numWeekDays.put(BaseDays.WEDNESDAY_DAYNUMLUNAR,numWednesdayDayNumLunar);
        numWeekDays.put(BaseDays.THURSDAY_DAYNUMLUNAR,numThursdayDayNumLunar);
        numWeekDays.put(BaseDays.FRIDAY_DAYNUMLUNAR,numFridayDayNumLunar);
        numWeekDays.put(BaseDays.SATURDAY_DAYNUMLUNAR,numSaturdayDayNumLunar);
        return numWeekDays;
    }

    @Override
    public List<MonthMaster> getMonthMasterCOColumns(List<MonthMaster> monthMasters,List<DateNumberDayDetail> dateNumberDayDetails){
        Boolean bMonday = false;
        Boolean bTuesday = false;
        Boolean bWednesday = false;
        Boolean bThursday = false;
        Boolean bFriday = false;
        Boolean bSaturday = false;

        List<String> mondaysListNum = new ArrayList<>();
        List<String> tuesdaysListNum = new ArrayList<>();
        List<String> wedsListNum = new ArrayList<>();
        List<String> thurdaysListNum = new ArrayList<>();
        List<String> frisListNum = new ArrayList<>();
        List<String> satsdaysListNum = new ArrayList<>();

  /*      List<String> mondaysMonthLunar = new ArrayList<>();*/

        for (MonthMaster m : monthMasters) {
            mondaysListNum.add(m.getMonday());
            tuesdaysListNum.add(m.getTuesday());
            wedsListNum.add(m.getWednesday());
            thurdaysListNum.add(m.getThursday());
            frisListNum.add(m.getFriday());
            satsdaysListNum.add(m.getSaturday());
           /* mondaysMonthLunar.add(m.getMondayMonthLunar());*/
        }
        for (int i = 0; i < monthMasters.size(); i++) {
            monthMasters.get(i).setMonth(dateNumberDayDetails.get(i).getMonth().getDesEn().toString());
            monthMasters.get(i).setYear(dateNumberDayDetails.get(i).getYear().getNumEn().toString());

            if (i == 0) {
                if (monthMasters.get(0).getTuesday().equalsIgnoreCase("1")) {
                    bMonday = true;
                }
                if (monthMasters.get(0).getWednesday().equalsIgnoreCase("1")) {
                    bMonday = true;
                    bTuesday = true;
                }
                if (monthMasters.get(0).getThursday().equalsIgnoreCase("1")) {
                    bMonday = true;
                    bTuesday = true;
                    bWednesday = true;
                }
                if (monthMasters.get(0).getFriday().equalsIgnoreCase("1")) {
                    bMonday = true;
                    bTuesday = true;
                    bWednesday = true;
                    bThursday = true;
                }
                if (monthMasters.get(0).getSaturday().equalsIgnoreCase("1")) {
                    bMonday = true;
                    bTuesday = true;
                    bWednesday = true;
                    bThursday = true;
                    bFriday = true;
                }
                if (monthMasters.get(0).getSunday().equalsIgnoreCase("1")) {
                    bMonday = true;
                    bTuesday = true;
                    bWednesday = true;
                    bThursday = true;
                    bFriday = true;
                    bSaturday = true;
                }
            }
            if (i == 0) {
                if (bMonday == Boolean.TRUE) {
                    monthMasters.get(i).setMonday("");
                }
                if (bTuesday == Boolean.TRUE) {
                    monthMasters.get(i).setTuesday("");
                }
                if (bWednesday == Boolean.TRUE) {
                    monthMasters.get(i).setWednesday("");
                }
                if (bThursday == Boolean.TRUE) {
                    monthMasters.get(i).setThursday("");
                }
                if (bFriday == Boolean.TRUE) {
                    monthMasters.get(i).setFriday("");
                }
                if (bSaturday == Boolean.TRUE) {
                    monthMasters.get(i).setSaturday("");
                }
            } else {
                if (bMonday == Boolean.TRUE) {
                    monthMasters.get(i).setMonday(mondaysListNum.get(i - 1));
                }
                if (bTuesday == Boolean.TRUE) {
                    monthMasters.get(i).setTuesday(tuesdaysListNum.get(i - 1));
                }
                if (bWednesday == Boolean.TRUE) {
                    monthMasters.get(i).setWednesday(wedsListNum.get(i - 1));
                }
                if (bThursday == Boolean.TRUE) {
                    monthMasters.get(i).setThursday(thurdaysListNum.get(i - 1));
                }
                if (bFriday == Boolean.TRUE) {
                    monthMasters.get(i).setFriday(frisListNum.get(i - 1));
                }
                if (bSaturday == Boolean.TRUE) {
                    monthMasters.get(i).setSaturday(satsdaysListNum.get(i - 1));
                }

            }
        }
        return monthMasters;
    }
}
