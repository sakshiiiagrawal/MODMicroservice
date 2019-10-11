package com.cs.ms.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cs.ms.model.User;
import com.cs.ms.service.UserService;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping({"/users"})
public class UserController {
	@Autowired
    UserService userService;
	

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public Optional<User> findById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public User update(@PathVariable("id") Long id, @RequestBody User user){
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public Optional<User> delete(@PathVariable("id") Long id) {
        return userService.delete(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

}
