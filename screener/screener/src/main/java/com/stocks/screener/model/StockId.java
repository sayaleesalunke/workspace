package com.stocks.screener.model;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;


public class StockId implements Serializable {
    @Column(name = "stockname")
    private String stockname;

    @Column(name = "displayPeriod")
    private String displayPeriod;

    public StockId(){}
    public StockId(String stockname, String displayPeriod) {
        this.stockname = stockname;
        this.displayPeriod = displayPeriod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StockId stockId1 = (StockId) o;
        if (stockname.equals(stockId1.stockname)&&displayPeriod.equals(stockId1.displayPeriod)) return true;
        else return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockname, displayPeriod);
    }
}