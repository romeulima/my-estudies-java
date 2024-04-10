package com.romeulima.java.poo.triangle;

import com.romeulima.java.poo.triangle.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Entre com os lados do triângulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com os lados do triângulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        System.out.printf("Área do Triângulo X: %.4f%n", areaX);
        System.out.printf("Área do Triângulo Y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger Area: X");
        } else {
            System.out.println("Larger Area: Y");
        }

        sc.close();

    }
}
