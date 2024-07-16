package com.codeme.springboot.CovidVaccination.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {

    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations


    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long bookingId;
    private long mobileNo;
    private Date dateOfBooking;
    private boolean bookingStatus;
    //Slot

    public  Appointment(){}

    public Appointment(long bookingId, boolean bookingStatus, Date dateOfBooking, long mobileNo) {
        this.bookingId = bookingId;
        this.bookingStatus = bookingStatus;
        this.dateOfBooking = dateOfBooking;
        this.mobileNo = mobileNo;
    }

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Date getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(Date dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public boolean isBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "Appointment [bookingId=" + bookingId + ", mobileNo=" + mobileNo + ", dateOfBooking=" + dateOfBooking
                + ", bookingStatus=" + bookingStatus + "]";
    }
    

    

    

}
