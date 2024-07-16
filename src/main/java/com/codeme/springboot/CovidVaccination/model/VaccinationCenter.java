package com.codeme.springboot.CovidVaccination.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VaccinationCenter {
    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int centerCode;
    private String centerName;
    private String address;
    private String city;
    private String state;
    private String pincode;

    public VaccinationCenter(){}

    public VaccinationCenter(int centerCode, String centerName, String address, String city, String state,
            String pincode) {
        this.centerCode = centerCode;
        this.centerName = centerName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public int getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(int centerCode) {
        this.centerCode = centerCode;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VaccinationCenter{");
        sb.append("centerCode=").append(centerCode);
        sb.append(", centerName=").append(centerName);
        sb.append(", address=").append(address);
        sb.append(", city=").append(city);
        sb.append(", state=").append(state);
        sb.append(", pincode=").append(pincode);
        sb.append('}');
        return sb.toString();
    }

    

}
