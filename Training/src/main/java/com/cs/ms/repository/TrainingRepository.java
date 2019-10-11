package com.cs.ms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cs.ms.model.Training;

public interface TrainingRepository extends CrudRepository<Training,Integer>  {
//	@Query("select training from Training training where training.mentor.id=?")
    List<Training> findTrainingByMentorId(Integer mentorId);
    
    List<Training> findTrainingByUserId(Integer userId);
    
//    @Query("select training from Training training where training.id=? and training.mentor.id=?")
    Training findByIdAndMentorId(Integer Id, Integer mentorId);
    
    Training findByIdAndUserId(Integer Id, Integer userId);
}

