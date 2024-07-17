package com.codeme.springboot.CovidVaccination.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeme.springboot.CovidVaccination.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    // 

}
