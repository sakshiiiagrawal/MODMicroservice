package com.cs.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.ms.model.Technology;
import com.cs.ms.repository.TechnologyRepository;

@Service
@Transactional
public class TechnologyService {
	@Autowired
	TechnologyRepository technologyRepository;
	
    public Technology create(Technology technology) {
        return technologyRepository.save(technology);
    }

    
    public Optional<Technology> delete(int id) {
    	Optional<Technology> technology = findById(id);
        
            technologyRepository.deleteById(id);
        
        return technology;
    }

    
    public List<Technology> findAll() {
        return (List<Technology>) technologyRepository.findAll();
    }

    
    public Optional<Technology> findById(int id) {
        return technologyRepository.findById(id);
    }

    
    public Technology update(Technology technology) {
        return technologyRepository.save(technology);
    }
}
