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

import com.cs.ms.model.Payment;
import com.cs.ms.service.PaymentService;
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping({"/payments"})
public class PaymentController {
	@Autowired
	PaymentService paymentService;
    
	@PostMapping(path = {"/{id}"})
    public Payment create(@RequestBody Payment payment){
        return paymentService.create(payment);
    }

    @GetMapping(path = {"/{id}"})
    public Optional<Payment> findOne(@PathVariable("id") int id){
        return paymentService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Payment update(@PathVariable("id") int id, @RequestBody Payment payment){
    	payment.setId(id);
        return paymentService.update(payment);
    }

    @DeleteMapping(path ={"/{id}"})
    public Optional<Payment> delete(@PathVariable("id") int id) {
        return paymentService.delete(id);
    }

    @GetMapping
    public List<Payment> findAll(){
        return paymentService.findAll();
    }
    }
