package com.codeme.springboot.CovidVaccination.model;

public class AdharCard {
    //define fields
    //define constructor
    //define getter/setter
    

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
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdharCard{");
        sb.append("adharNo=").append(adharNo);
        sb.append('}');
        return sb.toString();
    }


    



}
