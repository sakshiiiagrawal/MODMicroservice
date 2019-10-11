package com.cs.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.ms.model.Training;
import com.cs.ms.repository.TrainingRepository;
@Service
@Transactional
public class TrainingService {
	@Autowired
	TrainingRepository trainingRepository;
    
    public Training create(Training trainer) {
        return trainingRepository.save(trainer);
    }

    
    public Optional<Training> delete(int id) {
    	Optional<Training> trainer = findById(id);
      
        	trainingRepository.deleteById(id);
        
        return trainer;
    }

    
    public List<Training> findAll() {
        return (List<Training>) trainingRepository.findAll();
    }
    
    
    public List<Training> findTrainingByMentorId(Integer mentorId) {
        return trainingRepository.findTrainingByMentorId(mentorId);
    }
    
    
    public List<Training> findTrainingByUserId(Integer userId) {
        return trainingRepository.findTrainingByUserId(userId);
    }
    

	
	public Training findByIdAndMentorId(Integer id, Integer mentorId) {
		// TODO Auto-generated method stub
		return trainingRepository.findByIdAndMentorId(id,mentorId);
	}

	
	public Training findByIdAndUserId(Integer id, Integer userId) {
		// TODO Auto-generated method stub
		return trainingRepository.findByIdAndUserId(id,userId);
	}
	
    
    public Optional<Training> findById(int id) {
        return trainingRepository.findById(id);
    }

    
    
    public Training update(Training trainer) {
        return trainingRepository.save(trainer);
    }
}
