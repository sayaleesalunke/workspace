package com.stocks.screener.service;

import com.stocks.screener.model.BalanceSheet;
import com.stocks.screener.model.CashFlow;
import com.stocks.screener.model.Income;
import com.stocks.screener.model.InputValues;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class InputPopulatorService {

    TreeMap<Integer,CashFlow> cashflow;
    TreeMap<Integer,Income> income;
    TreeMap<Integer,BalanceSheet> balanceSheet;

    public void setStatements(List<CashFlow> cashflow,List<Income> income,List<BalanceSheet> balanceSheet)
    {

        this.cashflow= (TreeMap<Integer, CashFlow>) cashflow.stream().collect(Collectors.toMap(CashFlow::getYear, Function.identity()));
        this.income= (TreeMap<Integer, Income>) income.stream().collect(Collectors.toMap(Income::getYear, Function.identity()));
        this.balanceSheet= (TreeMap<Integer, BalanceSheet>) balanceSheet.stream().collect(Collectors.toMap(BalanceSheet::getYear, Function.identity()));
    }
    public Map<String, InputValues> getInputs()
    {
        Integer currKey,minKey,MaxKey;
        minKey=cashflow.firstKey();
        MaxKey=cashflow.lastKey();
        for(int i=minKey;i<=MaxKey;i++)
        {

            income.get(1).getIncIoi()
        }

        /*EBIDTA=income.getIncEbi();
        Total_Revenue=income.getIncTrev();
        PAT=income.getIncNinc();
        Shareholders_Equity=balanceSheet.getBalTeq();
        Average_Asset=(current total asset+lsat yr asset/2)-- balanceSheet.get(1).getBalTota()*****
        PBIT=income.getIncPbi()
        Short Term Debt
        Long Term Debt=balancesheet.getBalTltd();
        Interest= income.getIncIoi()
        Total Asset=balanceSheet.getBalTota()
        Total Asset previous year=balanceSheet.getBalTota()
        Current asset=balanceSheet.getBalTca()
        Current asset previous yr=balanceSheet.getBalTca()
        Current liabilities=balanceSheet.getBalTcl()
        Current liabilities previous yr=balanceSheet.getBalTcl()
        Operating Revenue=income.getIncTrev()-
        Average total asset
        Working capital=Current asset-Current liabilities(balanceSheet.getBalTca()-balanceSheet.getBalTcl())
        Working capital previous yr=prevCurrent asset-Current liabilities(balanceSheet.getBalTca()-balanceSheet.getBalTcl())
        Average working capital=Working capital+Working capital previous yr/2

        */


        return null;

    }

    public String getEBITDAMargin()
    {
        return "hellooo";
    }
    public InputPopulatorService(){}
}
