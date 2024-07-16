package com.codeme.springboot.CovidVaccination.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaccine {

    //define fields
    //define constructor
    //define getter/setter
    //define toString method
    //provide all annotations

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vaccineId;
    private String vaccineName;
    private String description;

    public Vaccine(){}

    public Vaccine(int vaccineId, String vaccineName, String description) {
        this.vaccineId = vaccineId;
        this.vaccineName = vaccineName;
        this.description = description;
    }

    public int getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(int vaccineId) {
        this.vaccineId = vaccineId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vaccine{");
        sb.append("vaccineId=").append(vaccineId);
        sb.append(", vaccineName=").append(vaccineName);
        sb.append(", description=").append(description);
        sb.append('}');
        return sb.toString();
    }

    

}
