package com.sayo.stocks.client;

import com.sayo.stocks.client.TickerFinancials.PopulateFinancials;
import com.sayo.stocks.client.TickerFinancials.StockCodeReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RequestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestApplication.class, args);

		StockCodeReader reader=new StockCodeReader();
		reader.readCode();


	}

}
