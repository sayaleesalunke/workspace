package com.stocks.screener.controller;

import com.stocks.screener.model.CashFlow;
import com.stocks.screener.model.StockId;
import com.stocks.screener.service.CashFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CashFlowController {

    @Autowired
    CashFlowService cashFlowService;

    @RequestMapping(value = "/*")
    public String Hello()
    {
        return "Hello";
    }
    @ResponseBody
    @RequestMapping(value = "/cashflow/getAll",method = RequestMethod.GET)
    public List<CashFlow> getAllCashFlow()
    {
        return this.cashFlowService.getAllCashFlow();
    }
    @ResponseBody
    @RequestMapping(value = "/cashflow/getOne",method = RequestMethod.GET)
    public CashFlow getOneCashFlow()
    {
        return this.cashFlowService.getOneCashFlow(new StockId("LARSEN AND TOUBRO LIMITED","FY 2015"));
    }

    @RequestMapping(value = "/cashflow/add",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public CashFlow addCashFlow(@RequestBody CashFlow cashFlow)
    {
        return this.cashFlowService.addCashFlow(cashFlow);
    }

    @RequestMapping(value = "/cashflow/addAll",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<CashFlow> addCashFlow(@RequestBody List<CashFlow> cashFlows)
    {
        return this.cashFlowService.addAllCashFlow(cashFlows);
    }

}
