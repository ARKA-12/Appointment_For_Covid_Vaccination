package com.codeme.springboot.CovidVaccination.Contoller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codeme.springboot.CovidVaccination.Service.UserService;
import com.codeme.springboot.CovidVaccination.model.User;


@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService =userService;
    }


    @PostMapping
    public ResponseEntity<User> saveRegisterUser(@RequestBody User user){

        User newUser =  userService.registerUser(user) ;

        return new ResponseEntity<>(newUser,HttpStatus.CREATED);

    }

 
    
    


}
