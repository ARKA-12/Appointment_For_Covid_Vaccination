package com.codeme.springboot.CovidVaccination.model;


public class PanCard {

    //define fields
    //define constructor
    //define getter/setter
    

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PanCard{");
        sb.append("panCard=").append(panCard);
        sb.append('}');
        return sb.toString();
    }

    
}
