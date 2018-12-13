package com.rdbbank.calenda.controllers.monthmaster;

import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.models.MonthMaster;
import com.rdbbank.calenda.services.datenumdaydetail.DateNumDayDeService;
import com.rdbbank.calenda.services.monthmaster.MonthMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

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
        List<DateNumberDayDetail> dateNumberDayDetails = dateNumDayDeService.findByYear(13L);

        List<Integer> numSundays = new ArrayList<>();
        List<Integer> numMondays = new ArrayList<>();
        List<Integer> numTuesday = new ArrayList<>();
        List<Integer> numWednesday = new ArrayList<>();
        List<Integer> numThursday = new ArrayList<>();
        List<Integer> numFriday = new ArrayList<>();
        List<Integer> numSaturday = new ArrayList<>();
        MonthMaster monthMaster = new MonthMaster();
        MonthMaster monthMaster2 = new MonthMaster();

        List<MonthMaster> monthMasters = new ArrayList<>();

        for(DateNumberDayDetail dayDetail: dateNumberDayDetails){
            if (dayDetail.getMonth() != null) {
                // January
                if (dayDetail.getMonth().getId() == 1) {
                    if (dayDetail.getDateNumber().getNumEn() != null && dayDetail.getDay().getDesEn() != null) {
                        switch (dayDetail.getDay().getDesEn()) {
                            case "Sunday":
                                //monthMaster.setSunday(dayDetail.getDateNumber().getNumEn().toString());
                                numSundays.add(dayDetail.getDateNumber().getNumEn());
                                break;
                            case "Monday":
                                //monthMaster.setMonday(dayDetail.getDateNumber().getNumEn().toString());
                                numMondays.add(dayDetail.getDateNumber().getNumEn());
                                break;
                            case "Tuesday":
                                //monthMaster.setTuesday(dayDetail.getDateNumber().getNumEn().toString());
                                numTuesday.add(dayDetail.getDateNumber().getNumEn());
                                break;
                            case "Wednesday":
                                //monthMaster.setWednesday(dayDetail.getDateNumber().getNumEn().toString());
                                numWednesday.add(dayDetail.getDateNumber().getNumEn());
                                break;
                            case "Thursday":
                                //monthMaster.setThursday(dayDetail.getDateNumber().getNumEn().toString());
                                numThursday.add(dayDetail.getDateNumber().getNumEn());
                                break;
                            case "Friday":
                                //monthMaster.setFriday(dayDetail.getDateNumber().getNumEn().toString());
                                numFriday.add(dayDetail.getDateNumber().getNumEn());
                                break;
                            case "Saturday":
                                //monthMaster.setSaturday(dayDetail.getDateNumber().getNumEn().toString());
                                numSaturday.add(dayDetail.getDateNumber().getNumEn());
                                break;
                        }
                    }
                }
                /*monthMaster.setYear(dayDetail.getYear().getNumEn().toString());
                monthMaster.setMonth(dayDetail.getMonth().getDesEn().toString());

                monthMasterService.save(monthMaster);*/
            }


        }
        // 5


        /*monthMaster.setYear(dayDetail.getYear().getNumEn().toString());
        monthMaster.setMonth(dayDetail.getMonth().getDesEn().toString());*/
        monthMasterService.save(monthMaster);

        monthMaster2.setSunday(numSundays.get(1)+"");
        monthMaster2.setMonday(numMondays.get(1)+"");
        monthMaster2.setTuesday(numTuesday.get(1)+"");
        monthMaster2.setWednesday(numWednesday.get(1)+"");
        monthMaster2.setThursday(numThursday.get(1)+"");
        monthMaster2.setFriday(numFriday.get(1)+"");
        monthMaster2.setSaturday(numSaturday.get(1)+"");

        Boolean bMonday = false;
        Boolean bTuesday = false;
        Boolean bWednesday = false;
        Boolean bThursday = false;
        Boolean bFriday = false;
        Boolean bSaturday = false;

        if (numMondays.get(0) == 1) {
            //other start from .get(0)
            monthMasters = getMonthMasters(numSundays, numMondays, numTuesday, numWednesday, numThursday, numFriday, numSaturday);
            for (MonthMaster master : monthMasters) {
                monthMasterService.save(master);
            }
        } else if (numTuesday.get(0) == 1) {
            bMonday = true;
            //other start from .get(0)
        } else if (numWednesday.get(0) == 1) {
            bMonday = true;
            bTuesday = true;
            //other start from .get(0)
        } else if (numThursday.get(0) == 1) {
            bMonday = true;
            bTuesday = true;
            bWednesday = true;
            //other start from .get(0)
        } else if (numFriday.get(0) == 1) {
            bMonday = true;
            bTuesday = true;
            bWednesday = true;
            bThursday = true;
            //other start from .get(0)
        } else if (numSaturday.get(0) == 1) {
            bMonday = true;
            bTuesday = true;
            bWednesday = true;
            bThursday = true;
            bFriday = true;
            //other start from .get(0)
        } else {
            bMonday = true;
            bTuesday = true;
            bWednesday = true;
            bThursday = true;
            bFriday = true;
            bSaturday = true;
        }

        monthMasterService.save(monthMaster2);
        return "home";
    }
    private List<MonthMaster> getMonthMasters(List<Integer> numSundays,
                                       List<Integer> numMondays,
                                       List<Integer> numTuesday,
                                       List<Integer> numWednesday,
                                       List<Integer> numThursday,
                                       List<Integer> numFriday,
                                       List<Integer> numSaturday
    ){
        MonthMaster monthMaster = new MonthMaster();
        List<MonthMaster> monthMasters = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            monthMaster = getMonthMaster(numSundays, numMondays, numTuesday, numWednesday, numThursday, numFriday, numSaturday, i);
            monthMasters.add(monthMaster);
        }

        return monthMasters;
    }

    private MonthMaster getMonthMaster(List<Integer> numSundays,
                                       List<Integer> numMondays,
                                       List<Integer> numTuesday,
                                       List<Integer> numWednesday,
                                       List<Integer> numThursday,
                                       List<Integer> numFriday,
                                       List<Integer> numSaturday, int i) {

        MonthMaster monthMaster = new MonthMaster();

        monthMaster.setSunday(numSundays.get(i) + "");
        monthMaster.setMonday(numMondays.get(i) + "");
        monthMaster.setTuesday(numTuesday.get(i) + "");
        monthMaster.setWednesday(numWednesday.get(i) + "");
        monthMaster.setThursday(numThursday.get(i) + "");
        monthMaster.setFriday(numFriday.get(i) + "");
        monthMaster.setSaturday(numSaturday.get(i) + "");

        return monthMaster;
    }
}
