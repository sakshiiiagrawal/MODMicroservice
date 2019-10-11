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

import com.cs.ms.model.Skill;
import com.cs.ms.service.SkillService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping({"/skills"})
public class SkillController {
	@Autowired
	SkillService skillService;
    
	@PostMapping
    public Skill create(@RequestBody Skill skills){
        return skillService.create(skills);
    }

    @GetMapping(path = {"/{id}"})
    public Optional<Skill> findOne(@PathVariable("id") int id){
        return skillService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Skill update(@PathVariable("id") int id, @RequestBody Skill skills){
    	skills.setId(id);
        return skillService.update(skills);
    }

    @DeleteMapping(path ={"/{id}"})
    public Optional<Skill> delete(@PathVariable("id") int id) {
        return skillService.delete(id);
    }

    @GetMapping
    public List<Skill> findAll(){
        return skillService.findAll();
    }
}
