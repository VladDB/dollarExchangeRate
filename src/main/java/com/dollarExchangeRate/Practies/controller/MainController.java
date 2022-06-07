package com.dollarExchangeRate.Practies.controller;

import com.dollarExchangeRate.Practies.model.ExchangeRate;
import com.dollarExchangeRate.Practies.service.ExchangeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ExchangeRateService exchangeRateService;

    @GetMapping("/")
    public ExchangeRate getAll() {
        return exchangeRateService.getAllRates();
    }
}
