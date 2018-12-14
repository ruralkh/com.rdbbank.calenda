package com.rdbbank.calenda.repositories.datenumdaydetail;

import com.rdbbank.calenda.models.DateNumberDayDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Create By: Ron Rith
 * Create Date on: 12/13/2018.
 */
public interface DateNumDayDeRepository extends PagingAndSortingRepository<DateNumberDayDetail,Long> {
    List<DateNumberDayDetail> findByYearId(Long id);

    List<DateNumberDayDetail> findByYearIdAndMonthId(Long yearId,Long monthId);
}
