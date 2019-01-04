package com.rdbbank.calenda.services.datamonthmaster;

import com.rdbbank.calenda.models.DataMonthMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Create By: Ron Rith
 * Create Date on: 1/4/2019.
 */
public interface DataMMasterService {
    List<DataMonthMaster> getAll();

    Page<DataMonthMaster> findAllPageable(Pageable pageable);
}
