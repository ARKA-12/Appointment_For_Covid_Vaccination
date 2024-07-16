package com.codeme.springboot.CovidVaccination.model;

import jakarta.persistence.Entity;

@Entity
public class PanCard {

    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations

    private String panCard;

    public PanCard(){}

    public PanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getPannCard() {
        return panCard;
    }

    public void setPannCard(String panCard) {
        this.panCard = panCard;
    }

    
}
