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

import com.cs.ms.model.Search;
import com.cs.ms.service.SearchService;
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping({"/search"})
public class SearchController {
	@Autowired
	SearchService searchService;
    
	@PostMapping(path = {"/{id}"})
    public Search create(@RequestBody Search search){
        return searchService.create(search);
    }

    @GetMapping(path = {"/{id}"})
    public Optional<Search> findOne(@PathVariable("id") int id){
        return searchService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Search update(@PathVariable("id") int id, @RequestBody Search search){
    	search.setId(id);
        return searchService.update(search);
    }

    @DeleteMapping(path ={"/{id}"})
    public Optional<Search> delete(@PathVariable("id") int id) {
        return searchService.delete(id);
    }

    @GetMapping
    public List<Search> findAll(){
        return searchService.findAll();
    }
    
	@PostMapping
    public Search create1(@RequestBody Search search){
        return searchService.create(search);
    }
	
	@GetMapping(path = {"tech/{techName}"})
    public List<Search> getSearchsByTechnologyName(@PathVariable("techName") String techName){
        return searchService.getSearchsByTechnologyName(techName);
    }
	
	@GetMapping(path = {"time/{startTime}/{endTime}"})
    public List<Search> getSearchsByTime(@PathVariable("startTime") String startTime, 
    		@PathVariable("endTime") String endTime){
        return searchService.getSearchsByTime(startTime,endTime);
    }
	
	@GetMapping(path = {"date/{startDate}/{endDate}"})
    public List<Search> getSearchsByDate(@PathVariable("startDate") String startDate, 
    		@PathVariable("endDate") String endDate){
        return searchService.getSearchsByDate(startDate,endDate);
    }
	
}
