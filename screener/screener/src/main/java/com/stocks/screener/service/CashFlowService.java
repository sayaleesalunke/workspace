package com.stocks.screener.service;

import com.stocks.screener.dao.CashFlowDAO;
import com.stocks.screener.model.CashFlow;
import com.stocks.screener.model.StockId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashFlowService {

    @Autowired
    CashFlowDAO cashFlowDAO;

    public List<CashFlow> getAllCashFlow()
    {
     return this.cashFlowDAO.findAll();
    }

    public CashFlow addCashFlow(CashFlow cashFlow)
    {
        return this.cashFlowDAO.save(cashFlow);
    }
    public List<CashFlow> addAllCashFlow(List<CashFlow> cashFlows)
    {
        return this.cashFlowDAO.saveAll(cashFlows);
    }

    public CashFlow getOneCashFlow(StockId Id)
    {
        return this.cashFlowDAO.getOne(Id);
    }
}
