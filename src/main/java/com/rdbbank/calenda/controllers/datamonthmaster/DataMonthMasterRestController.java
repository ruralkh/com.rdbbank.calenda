package com.rdbbank.calenda.controllers.datamonthmaster;

import com.rdbbank.calenda.models.DataMonthMaster;
import com.rdbbank.calenda.services.datamonthmaster.DataMMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Create By: Ron Rith
 * Create Date on: 1/4/2019.
 */
@RestController
@RequestMapping(value = "/api/dmmasters")
public class DataMonthMasterRestController {
    @Autowired
    private DataMMasterService dataMMasterService;

    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 5;

    @RequestMapping(method = RequestMethod.GET)
    private List<DataMonthMaster> getDataMonthMaster() {
        List<DataMonthMaster> dataMonthMasters = dataMMasterService.getAll();
        if (dataMonthMasters != null) {
            return dataMonthMasters;
        }
        return null;
    }

    @RequestMapping(value = "/p", params = {"page", "pageSize"}, method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public Page<DataMonthMaster> showNewsPage(@RequestParam("pageSize") Optional<Integer> pageSize,
                                   @RequestParam("page") Optional<Integer> page) {

        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
        Page<DataMonthMaster> userProfiles = dataMMasterService.findAllPageable(new PageRequest(evalPage, evalPageSize, Sort.Direction.DESC, "id"));
        return userProfiles;
    }
}
