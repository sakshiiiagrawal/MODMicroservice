package com.cs.ms.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.ms.model.Search;
import com.cs.ms.repository.SearchRepository;
@Service
@Transactional
public class SearchService {
	@Autowired
	SearchRepository searchRepository;
	
    public Search create(Search search) {
        return searchRepository.save(search);
    }

    public Search create1(Search search) {
        return searchRepository.save(search);
    }
    
    public Optional<Search> delete(int id) {
    	Optional<Search> search = findById(id);
    	searchRepository.deleteById(id);
        return search;
    }

    
    public List<Search> findAll() {
        return (List<Search>) searchRepository.findAll();
    }

    
    public Optional<Search> findById(int id) {
        return searchRepository.findById(id);
    }

    
    public Search update(Search search) {
        return searchRepository.save(search);
    }
    
    //search by technology
    public List<Search> getSearchsByTechnologyName(String techName) {
        return (List<Search>) searchRepository.findByTechName(techName);
    }
    
    //search by time
    public List<Search> getSearchsByTime(String startTime, String endTime) {
        return (List<Search>) searchRepository.findByStartTimeAndEndTime(startTime, endTime);
    }
    
    //search by date
    public List<Search> getSearchsByDate(String startDate, String endDate) {
//        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        
//        String date1= startDate;
//        String date2= endDate;
//        
//       LocalDate localDate1= LocalDate.parse(date1,formatter);
//       LocalDate localDate2= LocalDate.parse(date2,formatter);
       
       return (List<Search>) searchRepository.findByStartDateAndEndDate(startDate, endDate);
    }
}
