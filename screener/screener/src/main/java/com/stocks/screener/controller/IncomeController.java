package com.stocks.screener.controller;

import com.stocks.screener.model.Income;
import com.stocks.screener.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IncomeController {

    @Autowired
    IncomeService IncomeService;
    @ResponseBody()
    @RequestMapping(value = "/income/getAll",method = RequestMethod.GET,consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Income> getAllIncome()
    {
        return this.IncomeService.getAllIncome();
    }

    @RequestMapping(value = "/income/add",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public Income addIncome(@RequestBody Income Income)
    {
        return this.IncomeService.addIncome(Income);
    }

    @RequestMapping(value = "/income/addAll",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public List<Income> addIncome(@RequestBody List<Income> Incomes)
    {
        return this.IncomeService.addAllIncome(Incomes);
    }

}
