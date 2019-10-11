package com.cs.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.ms.model.Skill;
import com.cs.ms.repository.SkillRepository;

@Service
@Transactional
public class SkillService {
	@Autowired
	SkillRepository skillRepository;
	
    public Skill create(Skill skills) {
        return skillRepository.save(skills);
    }

    
    public Optional<Skill> delete(int id) {
    	Optional<Skill> skills = findById(id);
            skillRepository.deleteById(id);
        return skills;
    }

    
    public List<Skill> findAll() {
        return (List<Skill>) skillRepository.findAll();
    }

    
    public Optional<Skill> findById(int id) {
        return skillRepository.findById(id);
    }

    
    public Skill update(Skill skills) {
        return skillRepository.save(skills);
    }
}
