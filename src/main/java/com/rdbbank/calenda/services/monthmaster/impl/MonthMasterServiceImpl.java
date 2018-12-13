package com.rdbbank.calenda.services.monthmaster.impl;

import com.rdbbank.calenda.models.MonthMaster;
import com.rdbbank.calenda.repositories.monthmaster.MonthMasterRepository;
import com.rdbbank.calenda.services.monthmaster.MonthMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
}
