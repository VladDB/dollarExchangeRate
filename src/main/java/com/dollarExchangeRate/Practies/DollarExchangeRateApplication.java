package com.dollarExchangeRate.Practies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DollarExchangeRateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DollarExchangeRateApplication.class, args);
	}

}
