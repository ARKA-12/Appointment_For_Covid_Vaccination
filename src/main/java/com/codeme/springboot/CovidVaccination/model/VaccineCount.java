package com.codeme.springboot.CovidVaccination.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VaccineCount {
    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int vaccineCountId;
    
    private int quantity;
    private double price;

    public VaccineCount(){}

   
   

    public VaccineCount( int quantity, double price) {
      
        this.quantity = quantity;
        this.price = price;
    }


    public int getVaccineCountId() {
        return vaccineCountId;
    }


    public void setVaccineCountId(int vaccineCountId) {
        this.vaccineCountId = vaccineCountId;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VaccineCount{");
        sb.append("quantity=").append(quantity);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }


   

}
