package com.rdbbank.calenda.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Create By: Ron Rith
 * Create Date on: 12/11/2018.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String goHome(){
        return "home";
    }
}
