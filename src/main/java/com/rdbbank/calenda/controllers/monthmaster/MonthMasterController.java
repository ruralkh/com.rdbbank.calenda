package com.rdbbank.calenda.controllers.monthmaster;

import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.services.datenumdaydetail.DateNumDayDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public String saveMonthMaster(){
        List<DateNumberDayDetail> dateNumberDayDetails = dateNumDayDeService.findByYear(13L);
        return "home";
    }
}
