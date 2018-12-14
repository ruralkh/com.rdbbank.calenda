package com.rdbbank.calenda.services.datenumdaydetail.impl;

import com.rdbbank.calenda.models.DateNumberDayDetail;
import com.rdbbank.calenda.repositories.datenumdaydetail.DateNumDayDeRepository;
import com.rdbbank.calenda.services.datenumdaydetail.DateNumDayDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Create By: Ron Rith
 * Create Date on: 12/13/2018.
 */
@Service
@Transactional
public class DateNumDayDeServiceImpl implements DateNumDayDeService{

    @Autowired
    private DateNumDayDeRepository dateNumDayDeRepository;

    @Override
    public List<DateNumberDayDetail> getAll() {
        return (List<DateNumberDayDetail>) dateNumDayDeRepository.findAll();
    }

    @Override
    public void save(DateNumberDayDetail dateNumberDayDetail) {
        dateNumDayDeRepository.save(dateNumberDayDetail);
    }

    @Override
    public List<DateNumberDayDetail> findByYear(Long id) {
        return dateNumDayDeRepository.findByYearId(id);
    }

    @Override
    public List<DateNumberDayDetail> findByYearIdAndMonthId(Long yearId, Long monthId) {
        return dateNumDayDeRepository.findByYearIdAndMonthId(yearId,monthId);
    }
}
