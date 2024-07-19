package com.codeme.springboot.CovidVaccination.Service;

import com.codeme.springboot.CovidVaccination.Exception.UserException;
import com.codeme.springboot.CovidVaccination.model.User;


public interface UserService  {


    public User registerUser(User user) throws UserException;

}
