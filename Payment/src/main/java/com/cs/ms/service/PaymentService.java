package com.cs.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.ms.model.Payment;
import com.cs.ms.repository.PaymentRepository;
@Service
@Transactional
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;
	
    public Payment create(Payment payment) {
        return paymentRepository.save(payment);
    }

    
    public Optional<Payment> delete(int id) {
    	Optional<Payment> payment = findById(id);
            paymentRepository.deleteById(id);
        return payment;
    }

    
    public List<Payment> findAll() {
        return (List<Payment>) paymentRepository.findAll();
    }

    
    public Optional<Payment> findById(int id) {
        return paymentRepository.findById(id);
    }

    
    public Payment update(Payment payment) {
        return paymentRepository.save(payment);
    }
}
