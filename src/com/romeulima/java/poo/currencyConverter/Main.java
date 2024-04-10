package com.romeulima.java.poo.currencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        Double dollarPrice = sc.nextDouble();

        System.out.println();
        System.out.print("How many dollars will be bought? ");
        Double dollarAmount = sc.nextDouble();

        System.out.println();
        System.out.println("Amount to be paid in reais = " + CurrencyConverter.dollarToReais(dollarPrice, dollarAmount));

    }
}
