package com.stocks.screener.service;

import com.stocks.screener.dao.BalanceSheetDAO;
import com.stocks.screener.model.BalanceSheet;
import com.stocks.screener.model.StockId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceSheetService {

    @Autowired
    BalanceSheetDAO BalanceSheetDAO;

    public List<BalanceSheet> getAllBalanceSheet()
    {
        return this.BalanceSheetDAO.findAll();
    }

    public BalanceSheet addBalanceSheet(BalanceSheet BalanceSheet)
    {
        return this.BalanceSheetDAO.save(BalanceSheet);
    }
    public List<BalanceSheet> addAllBalanceSheet(List<BalanceSheet> BalanceSheets)
    {
        return this.BalanceSheetDAO.saveAll(BalanceSheets);
    }
    public BalanceSheet getOneBalanceSheet(StockId Id)
    {
        return this.BalanceSheetDAO.getOne(Id);
    }
}
