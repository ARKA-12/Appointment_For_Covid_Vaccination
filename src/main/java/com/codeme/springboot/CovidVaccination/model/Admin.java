package com.codeme.springboot.CovidVaccination.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int adminId;
    
    private String name;
    private String mobileNo;
    private String email;

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Admin(){}

    public Admin(String name, String mobileNo, String email) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Admin{");
        sb.append("adminId=").append(adminId);
        sb.append(", name=").append(name);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }

    

}
