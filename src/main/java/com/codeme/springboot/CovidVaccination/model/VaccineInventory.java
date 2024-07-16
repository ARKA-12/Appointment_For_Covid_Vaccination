package com.codeme.springboot.CovidVaccination.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VaccineInventory {

    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vaccineInventoryId;
    private Date date;

    public VaccineInventory(){}

    public VaccineInventory(int vaccineInventoryId, Date date) {
        this.vaccineInventoryId = vaccineInventoryId;
        this.date = date;
    }

    public int getVaccineInventoryId() {
        return vaccineInventoryId;
    }

    public void setVaccineInventoryId(int vaccineInventoryId) {
        this.vaccineInventoryId = vaccineInventoryId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VaccineInventory{");
        sb.append("vaccineInventoryId=").append(vaccineInventoryId);
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    

}
