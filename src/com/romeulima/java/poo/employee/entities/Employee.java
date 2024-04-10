package com.romeulima.java.poo.employee.entities;

public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;

    public Double netSalary(){
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(Double percentage){
        this.grossSalary += (this.grossSalary * (percentage / 100));
        this.netSalary();
    }

    public String toString(){
        return this.name + ", $ " + String.format("%.2f", this.netSalary());
    }
}
