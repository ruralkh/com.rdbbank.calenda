package com.rdbbank.calenda.controllers.monthmaster;

import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.models.MonthMaster;
import com.rdbbank.calenda.models.base.BaseDays;
import com.rdbbank.calenda.services.datenumdaydetail.DateNumDayDeService;
import com.rdbbank.calenda.services.monthmaster.MonthMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Create By: Ron Rith
 * Create Date on: 12/13/2018.
 */
@Controller
@RequestMapping(value = "/monthmaster")
public class MonthMasterController {

    @Autowired
    private DateNumDayDeService dateNumDayDeService;

    @Autowired
    private MonthMasterService monthMasterService;

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public String saveMonthMaster(){
        //id = 13 is 2019
        /*List<DateNumberDayDetail> dateNumberDayDetails = dateNumDayDeService.findByYear(13L);*/
        List<DateNumberDayDetail> dateNumberDayDetails = dateNumDayDeService.findByYearIdAndMonthId(13L,1L);

        List<MonthMaster> monthMasters = new ArrayList<>();
        // number of each days
        // monthNum = 1 is January
        Map<String,List<String>> numEachDays = monthMasterService.getNumEachDays(dateNumberDayDetails,1);
        // days in a month not yet sort
        //one month getMonthMasters can noted by month
        monthMasters = monthMasterService.getMonthMasters(
                numEachDays.get(BaseDays.SUNDAY),
                numEachDays.get(BaseDays.MONDAY),
                numEachDays.get(BaseDays.TUESDAY),
                numEachDays.get(BaseDays.WEDNESDAY),
                numEachDays.get(BaseDays.THURSDAY),
                numEachDays.get(BaseDays.FRIDAY),
                numEachDays.get(BaseDays.SATURDAY),

                numEachDays.get(BaseDays.SUNDAY_MONTHLUNAR),
                numEachDays.get(BaseDays.MONDAY_MONTHLUNAR),
                numEachDays.get(BaseDays.TUESDAY_MONTHLUNAR),
                numEachDays.get(BaseDays.WEDNESDAY_MONTHLUNAR),
                numEachDays.get(BaseDays.THURSDAY_MONTHLUNAR),
                numEachDays.get(BaseDays.FRIDAY_MONTHLUNAR),
                numEachDays.get(BaseDays.SATURDAY_MONTHLUNAR),

                numEachDays.get(BaseDays.SUNDAY_DAYNUMLUNAR),
                numEachDays.get(BaseDays.MONDAY_DAYNUMLUNAR),
                numEachDays.get(BaseDays.TUESDAY_DAYNUMLUNAR),
                numEachDays.get(BaseDays.WEDNESDAY_DAYNUMLUNAR),
                numEachDays.get(BaseDays.THURSDAY_DAYNUMLUNAR),
                numEachDays.get(BaseDays.FRIDAY_DAYNUMLUNAR),
                numEachDays.get(BaseDays.SATURDAY_DAYNUMLUNAR),
                1)
        ;
        // days in a month sorted
        List<MonthMaster> monthMasterCoColumns = monthMasterService.getMonthMasterCOColumns(monthMasters,dateNumberDayDetails);
     /*   for(MonthMaster master: monthMasterCoColumns){
            monthMasterService.save(master);
        }*/
        return "home";
    }




}
