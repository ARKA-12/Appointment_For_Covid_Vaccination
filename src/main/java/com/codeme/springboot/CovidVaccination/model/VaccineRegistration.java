package com.codeme.springboot.CovidVaccination.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VaccineRegistration {
    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long mobileNo;
    private Date dateoOfRegistration;

    public VaccineRegistration(){}

    public VaccineRegistration(long mobileNo, Date dateoOfRegistration) {
        this.mobileNo = mobileNo;
        this.dateoOfRegistration = dateoOfRegistration;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getDateoOfRegistration() {
        return dateoOfRegistration;
    }

    public void setDateoOfRegistration(Date dateoOfRegistration) {
        this.dateoOfRegistration = dateoOfRegistration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VaccineRegistration{");
        sb.append("mobileNo=").append(mobileNo);
        sb.append(", dateoOfRegistration=").append(dateoOfRegistration);
        sb.append('}');
        return sb.toString();
    }

    
}
