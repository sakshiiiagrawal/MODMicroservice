package com.cs.ms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cs.ms.model.Skill;

public interface SkillRepository extends CrudRepository<Skill, Integer> {
	
}
