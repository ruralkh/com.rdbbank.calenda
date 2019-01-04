package com.rdbbank.calenda.services.datamonthmaster.impl;

import com.rdbbank.calenda.models.DataMonthMaster;
import com.rdbbank.calenda.repositories.datamonthmaster.DataMMasterRepository;
import com.rdbbank.calenda.services.datamonthmaster.DataMMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create By: Ron Rith
 * Create Date on: 1/4/2019.
 */
@Service
public class DataMMasterServiceImpl implements DataMMasterService{
    @Autowired
    private DataMMasterRepository dataMMasterRepository;

    @Override
    public List<DataMonthMaster> getAll() {
        return (List<DataMonthMaster>) dataMMasterRepository.findAll();
    }

    @Override
    public Page<DataMonthMaster> findAllPageable(Pageable pageable) {
        return dataMMasterRepository.findAll(pageable);
    }
}
