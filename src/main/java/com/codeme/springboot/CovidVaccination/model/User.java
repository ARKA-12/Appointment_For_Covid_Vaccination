package com.codeme.springboot.CovidVaccination.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int userId;
    private String name;
    private String mobileNo;
    private String email;

    public User(){}

    public User(String name, String mobileNo, String email) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{");
        sb.append("userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", mobileNo=").append(mobileNo);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }

    

}
