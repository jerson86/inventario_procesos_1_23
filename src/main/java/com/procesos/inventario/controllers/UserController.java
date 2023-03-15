package com.procesos.inventario.controllers;

import com.procesos.inventario.models.User;
import com.procesos.inventario.services.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping(value = "/user/{id}")
    public User findUserById(@PathVariable Long id){
        return userServiceImp.getUser(id);
    }
    @PostMapping(value = "/user")
    public Boolean saveUser(@RequestBody User user){
        return userServiceImp.createUser(user);
    }
}








