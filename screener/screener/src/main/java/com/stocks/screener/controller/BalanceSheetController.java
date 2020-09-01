package com.stocks.screener.controller;

import com.stocks.screener.model.BalanceSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BalanceSheetController {

    @Autowired
    com.stocks.screener.service.BalanceSheetService BalanceSheetService;

    @RequestMapping(value = "/balancesheet/getAll",method = RequestMethod.GET)
    public List<BalanceSheet> getAllBalanceSheet()
    {
        return this.BalanceSheetService.getAllBalanceSheet();
    }

    @RequestMapping(value = "/balancesheet/add",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public BalanceSheet addBalanceSheet(@RequestBody BalanceSheet BalanceSheet)
    {
        return this.BalanceSheetService.addBalanceSheet(BalanceSheet);
    }

    @RequestMapping(value = "/balancesheet/addAll",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public List<BalanceSheet> addBalanceSheet(@RequestBody List<BalanceSheet> BalanceSheets)
    {
        return this.BalanceSheetService.addAllBalanceSheet(BalanceSheets);
    }

}
