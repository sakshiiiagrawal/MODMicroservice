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

import com.cs.ms.model.Technology;
import com.cs.ms.service.TechnologyService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/tech")
public class TechnologyController {
	@Autowired
	TechnologyService technologyService;
    
	@PostMapping
    public Technology create(@RequestBody Technology technology){
        return technologyService.create(technology);
    }

    @GetMapping(path = {"/{id}"})
    public Optional<Technology> findOne(@PathVariable("id") int id){
        return technologyService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Technology update(@PathVariable("id") int id, @RequestBody Technology technology){
    	technology.setId(id);
        return technologyService.update(technology);
    }

    @DeleteMapping(path ={"/{id}"})
    public Optional<Technology> delete(@PathVariable("id") int id) {
        return technologyService.delete(id);
    }

    @GetMapping
    public List<Technology> findAll(){
        return technologyService.findAll();
    }
    
//    @PutMapping(path = {"/{id}"})
//    public Technology updatefees(@PathVariable("id") int id, @RequestBody Technology technology){
//    	technology.setId(id);
//        return technologyService.update(technology);
//    }
}
