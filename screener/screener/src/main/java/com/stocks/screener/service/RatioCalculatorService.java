package com.stocks.screener.service;

import com.stocks.screener.dao.BalanceSheetDAO;
import com.stocks.screener.dao.CashFlowDAO;
import com.stocks.screener.dao.IncomeDAO;
import com.stocks.screener.model.BalanceSheet;
import com.stocks.screener.model.CashFlow;
import com.stocks.screener.model.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RatioCalculatorService {

    @Autowired
    IncomeDAO incomeDAO;
    @Autowired
    BalanceSheetDAO balanceSheetDAO;
    @Autowired
    CashFlowDAO cashFlowDAO;
    @Autowired
    InputPopulatorService inputPopulatorService;

    public RatioCalculatorService()
    {}

    public String calculateRatio()
    {
        Map<String, List<CashFlow>> cashFlowMap;
        Map<String, List<Income>> incomeMap;
        Map<String, List<BalanceSheet>> balanceSheetMap;

        cashFlowMap=this.cashFlowDAO.findAll().stream().collect(Collectors.groupingBy(CashFlow::getStockname));
        incomeMap=this.incomeDAO.findAll().stream().collect(Collectors.groupingBy(Income::getStockname));
        balanceSheetMap=this.balanceSheetDAO.findAll().stream().collect(Collectors.groupingBy(BalanceSheet::getStockname));

        Set<String> companies= cashFlowMap.keySet();
        for(String company:companies)
        {
            List<CashFlow> cashFlows=cashFlowMap.get(company);
            List<Income> incomes=incomeMap.get(company);
            List<BalanceSheet> balanceSheets=balanceSheetMap.get(company);
            inputPopulatorService.setStatements(cashFlows,incomes,balanceSheets);

        }
        System.out.println(inputPopulatorService.getEBITDAMargin());
        return cashFlowMap.size()+"--"+incomeMap.size()+"--"+balanceSheetMap.size();
    }



}
