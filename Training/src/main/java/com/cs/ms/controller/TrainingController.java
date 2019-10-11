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

import com.cs.ms.model.Training;
import com.cs.ms.service.TrainingService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping({"/trainer"})
public class TrainingController {
	@Autowired
	TrainingService trainingService;
    
	@PostMapping(path = {"/{id}"})
    public Training create(@RequestBody Training trainer){
        return trainingService.create(trainer);
    }

    @GetMapping(path = {"/{id}"})
    public Optional<Training> findOne(@PathVariable("id") int id){
        return trainingService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Training update(@PathVariable("id") int id, @RequestBody Training trainer){
    	trainer.setId(id);
        return trainingService.update(trainer);
    }

    @DeleteMapping(path ={"/{id}"})
    public Optional<Training> delete(@PathVariable("id") int id) {
        return trainingService.delete(id);
    }

    @GetMapping
    public List<Training> findAll(){
        return trainingService.findAll();
    }
    
    
    @GetMapping("/findTrainingByMentorId/{mentorId}")
    public List < Training > findTrainingByMentorId(@PathVariable(value = "mentorId") int mentorId) {
        return trainingService.findTrainingByMentorId(mentorId);
    }

    
    @GetMapping("/findTrainingByUserId/{userId}")
    public List < Training > findTrainingByUserId(@PathVariable(value = "userId") int userId) {
        return trainingService.findTrainingByUserId(userId);
    }
    
    @GetMapping("/findByIdAndMentorId/{mentorId}/{id}")
    public Training findByIdAndMentorId(@PathVariable(value = "mentorId") Integer mentorId,
            @PathVariable(value = "id") Integer id) {
        return trainingService.findByIdAndMentorId(id, mentorId);
    }
    
    
    @GetMapping("/findByIdAndUserId/{userId}/{id}")
    public Training findByIdAndUserId(@PathVariable(value = "userId") Integer userId,
            @PathVariable(value = "id") Integer id) {
        return trainingService.findByIdAndUserId(id, userId);
    }
}
