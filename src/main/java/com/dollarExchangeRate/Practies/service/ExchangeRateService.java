package com.dollarExchangeRate.Practies.service;

import com.dollarExchangeRate.Practies.model.ExchangeRate;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Service
@AllArgsConstructor
public class ExchangeRateService {

    private static final String APP_ID = "9685f09dbc044449b3d8bec20af0be06";

    public ExchangeRate getAllRates() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(ExchangeRate.class, "https://openexchangerates.org/api/latest.json?app_id=" + APP_ID);
    }
}
