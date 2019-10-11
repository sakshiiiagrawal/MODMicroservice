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

import com.cs.ms.model.Calendar;
import com.cs.ms.service.CalendarService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping({"/calendars"})
public class CalendarController {
	@Autowired
    private CalendarService calendarService;

    @PostMapping
    public Calendar create(@RequestBody Calendar calendar){
        return calendarService.create(calendar);
    }

    @GetMapping(path = {"/{id}"})
    public Optional<Calendar> findOne(@PathVariable("id") int id){
        return calendarService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Calendar update(@PathVariable("id") int id, @RequestBody Calendar calendar){
    	calendar.setId(id);
        return calendarService.update(calendar);
    }

    @DeleteMapping(path ={"/{id}"})
    public Optional<Calendar> delete(@PathVariable("id") int id) {
        return calendarService.delete(id);
    }

    @GetMapping
    public List<Calendar> findAll(){
        return calendarService.findAll();
    }
}
