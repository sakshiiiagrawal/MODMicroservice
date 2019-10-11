package com.cs.ms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cs.ms.model.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {
	
}
