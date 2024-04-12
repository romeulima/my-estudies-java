package com.romeulima.java.poo.product.entities;

public class Product {
    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name){
        this.name = name;
    }

    public Product(){}

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPrice(){
        return this.price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

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
