package com.rdbbank.calenda.services.datenumdaydetail;

import com.rdbbank.calenda.models.DateNumberDayDetail;

import java.util.List;

/**
 * Create By: Ron Rith
 * Create Date on: 12/13/2018.
 */
public interface DateNumDayDeService {
    List<DateNumberDayDetail> getAll();

    void save(DateNumberDayDetail dateNumberDayDetail);

    List<DateNumberDayDetail> findByYear(Long id);

    List<DateNumberDayDetail> findByYearIdAndMonthId(Long yearId,Long monthId);
}
