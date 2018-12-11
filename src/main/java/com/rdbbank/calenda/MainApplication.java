package com.rdbbank.calenda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create By: Ron Rith
 * Create Date on: 12/7/2018.
 */
@SpringBootApplication
@EnableAutoConfiguration
public class MainApplication {
    public static void main(String args[]){
        SpringApplication.run(MainApplication.class,args);
    }
}
