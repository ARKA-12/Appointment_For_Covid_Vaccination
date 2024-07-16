package com.codeme.springboot.CovidVaccination.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {

    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;
    private boolean dose1Status;
    private boolean dose2Status;
    private Date dose1Date;
    private Date dose2Date;

    public Member (){}

    public Member(Date dose1Date, boolean dose1Status, Date dose2Date, boolean dose2Status, int memberId) {
        this.dose1Date = dose1Date;
        this.dose1Status = dose1Status;
        this.dose2Date = dose2Date;
        this.dose2Status = dose2Status;
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public boolean isDose1Status() {
        return dose1Status;
    }

    public void setDose1Status(boolean dose1Status) {
        this.dose1Status = dose1Status;
    }

    public boolean isDose2Status() {
        return dose2Status;
    }

    public void setDose2Status(boolean dose2Status) {
        this.dose2Status = dose2Status;
    }

    public Date getDose1Date() {
        return dose1Date;
    }

    public void setDose1Date(Date dose1Date) {
        this.dose1Date = dose1Date;
    }

    public Date getDose2Date() {
        return dose2Date;
    }

    public void setDose2Date(Date dose2Date) {
        this.dose2Date = dose2Date;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Member{");
        sb.append("memberId=").append(memberId);
        sb.append(", dose1Status=").append(dose1Status);
        sb.append(", dose2Status=").append(dose2Status);
        sb.append(", dose1Date=").append(dose1Date);
        sb.append(", dose2Date=").append(dose2Date);
        sb.append('}');
        return sb.toString();
    }

    
    

}
