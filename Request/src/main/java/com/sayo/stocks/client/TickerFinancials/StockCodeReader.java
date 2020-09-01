package com.sayo.stocks.client.TickerFinancials;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StockCodeReader {

    public void readCode()
    {
        PopulateFinancials fetchData=new PopulateFinancials();

        try {

            File f = new File("src/main/resources/static/stock_code.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            System.out.println("Reading file using Buffered Reader");

            while ((readLine = b.readLine()) != null) {
                String[] values=readLine.split(",");
                System.out.println(values[0]+"--"+values[2]);
                fetchData.runLogic(values[0], values[1], values[2],"cashflow");
                fetchData.runLogic(values[0], values[1], values[2],"income");
                fetchData.runLogic(values[0], values[1], values[2],"balancesheet");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
