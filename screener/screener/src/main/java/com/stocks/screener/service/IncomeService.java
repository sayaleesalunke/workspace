package com.stocks.screener.service;

import com.stocks.screener.dao.IncomeDAO;
import com.stocks.screener.model.Income;
import com.stocks.screener.model.StockId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {

    @Autowired
    IncomeDAO IncomeDAO;

    public List<Income> getAllIncome()
    {
        return this.IncomeDAO.findAll();
    }

    public Income addIncome(Income Income)
    {
        return this.IncomeDAO.save(Income);
    }
    public List<Income> addAllIncome(List<Income> Incomes)
    {
        return this.IncomeDAO.saveAll(Incomes);
    }
    public Income getOneIncome(StockId Id)
    {
        return this.IncomeDAO.getOne(Id);
    }
}
