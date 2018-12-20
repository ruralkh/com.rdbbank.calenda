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

    MonthMaster getMonthMasterFive(List<Integer> numDays, String dayType);

    MonthMaster getMonthMaster(List<Integer> numSundays,
                               List<Integer> numMondays,
                               List<Integer> numTuesday,
                               List<Integer> numWednesday,
                               List<Integer> numThursday,
                               List<Integer> numFriday,
                               List<Integer> numSaturday, int i);

    List<MonthMaster> getMonthMasters(List<Integer> numSundays,
                                      List<Integer> numMondays,
                                      List<Integer> numTuesday,
                                      List<Integer> numWednesday,
                                      List<Integer> numThursday,
                                      List<Integer> numFriday,
                                      List<Integer> numSaturday,Integer numMonth);
    Map<String,List<Integer>> getNumEachDays(List<DateNumberDayDetail> dateNumberDayDetails,int monthNum);

    List<MonthMaster> getMonthMasterCOColumns(List<MonthMaster> monthMasters,List<DateNumberDayDetail> dateNumberDayDetails);
}
