package com.romeulima.java.poo.product.entities;

public class Product {
    public String name;
    public Double price;
    public Integer quantity;

    public Product(String name, Double price, Integer quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name){
        this.name = name;
    }

    public Product(){}

    public Double totalValueInStock(){
        return this.price * this.quantity;
    }

    public void addProducts(Integer quantity){
        this.quantity += quantity;
    }

    public void removeProducts(Integer quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return (this.name + ", $ " + String.format("%.2f", this.price) + ", " + this.quantity + " units, Total: $ ") + String.format("%.2f", this.totalValueInStock());
    }
}
