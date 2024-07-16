package com.codeme.springboot.CovidVaccination.model;

import jakarta.persistence.Entity;

@Entity
public class AdharCard {
    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations

    private long adharNo;

    public AdharCard(){}

    public AdharCard(long adharNo) {
        this.adharNo = adharNo;
    }

    public long getAdharNo() {
        return adharNo;
    }

    public void setAdharNo(long adharNo) {
        this.adharNo = adharNo;
    }


    



}
