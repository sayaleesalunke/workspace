package com.stocks.screener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.stocks.screener.dao")
public class ScreenerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ScreenerApplication.class, args);


	}

}
