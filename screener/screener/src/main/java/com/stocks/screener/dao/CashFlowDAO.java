package com.stocks.screener.dao;

import com.stocks.screener.model.CashFlow;
import com.stocks.screener.model.StockId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashFlowDAO extends JpaRepository<CashFlow, StockId> {
}