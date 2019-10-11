package com.cs.ms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cs.ms.model.Technology;


public interface TechnologyRepository extends CrudRepository<Technology,Integer> {
	
}
