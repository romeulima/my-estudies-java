package com.romeulima.java.poo.triangle.entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double calcularArea(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
