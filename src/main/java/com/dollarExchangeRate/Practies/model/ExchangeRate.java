package com.dollarExchangeRate.Practies.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
public class ExchangeRate {

    private static Map<String, Double> rates;

    public double getCurrency(String currency) {
        return rates.get(currency);
    }
}
