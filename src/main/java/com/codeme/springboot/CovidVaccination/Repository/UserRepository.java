package com.codeme.springboot.CovidVaccination.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeme.springboot.CovidVaccination.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    public User findByMobileNo(String mobileNo);

}
