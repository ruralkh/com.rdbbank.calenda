package com.rdbbank.calenda.services.monthmaster;

import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.models.MonthMaster;

import java.util.List;
import java.util.Map;

/**
 * Create By: Ron Rith
 * Create Date on: 12/13/2018.
 */
public interface MonthMasterService {
    void save(MonthMaster monthMaster);

    MonthMaster getMonthMasterFive(List<String> numDays, String dayType);

    MonthMaster getMonthMaster(List<String> numSundays,
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
                               int i);

    List<MonthMaster> getMonthMasters(List<String> numSundays,
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
                                      Integer numMonth
    );
    Map<String,List<String>> getNumEachDays(List<DateNumberDayDetail> dateNumberDayDetails,int monthNum);

    List<MonthMaster> getMonthMasterCOColumns(List<MonthMaster> monthMasters,List<DateNumberDayDetail> dateNumberDayDetails);
}
