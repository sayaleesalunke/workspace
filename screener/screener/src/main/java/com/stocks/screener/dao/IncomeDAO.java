package com.stocks.screener.dao;

import com.stocks.screener.model.Income;
import com.stocks.screener.model.StockId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeDAO extends JpaRepository<Income, StockId> {
}