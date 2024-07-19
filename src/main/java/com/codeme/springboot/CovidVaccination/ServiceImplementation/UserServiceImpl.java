package com.codeme.springboot.CovidVaccination.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeme.springboot.CovidVaccination.Exception.UserException;
import com.codeme.springboot.CovidVaccination.Repository.UserRepository;
import com.codeme.springboot.CovidVaccination.Service.UserService;
import com.codeme.springboot.CovidVaccination.model.User;

@Service
public class UserServiceImpl implements UserService {

    //define the JPA repository
    
    public UserRepository userDao;
    
    @Autowired
    //contructor dependency injection
    public UserServiceImpl(UserRepository userDao) {
        this.userDao = userDao;
    }

    @Override
    public User registerUser(User user) {

        User existingUser = userDao.findByMobileNo(user.getMobileNo());

        if (existingUser != null) {
            throw new UserException("User already exists!! - " + user.getName());
        } else {
            return userDao.save(user);
        }

    }

}
