package com.cs.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.ms.model.User;
import com.cs.ms.repository.UserRepository;



@Service
@Transactional
public class UserService {
	@Autowired
	UserRepository userRepository;
	
    public User create(User user) {
        return userRepository.save(user);
    }

    
    public Optional<User> delete(Long id) {
    	Optional<User> user= findById(id);
    	userRepository.deleteById(id);
    	return user;
    	
    }

    
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    
    public User update(User user) {
        return userRepository.save(user);
    }
}