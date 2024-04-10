package com.romeulima.java.poo.currencyConverter;

public class CurrencyConverter {
    public static final Double IOF_PERCENT = 6.0;

    public static String dollarToReais(Double priceDollar, Double dollarAmount){
        priceDollar += (priceDollar * (IOF_PERCENT / 100));
        Double total = priceDollar * dollarAmount;
        return String.format("%.2f", total);
    }
}
