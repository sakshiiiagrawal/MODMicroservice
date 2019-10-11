package com.cs.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cs.ms.model.Calendar;
import com.cs.ms.repository.CalendarRepository;


@Service
@Transactional
public class CalendarService {
	@Autowired
    private CalendarRepository calendarRepository;

   
    public Calendar create(Calendar calendar) {
        return calendarRepository.save(calendar);
    }

    
    public Optional<Calendar> delete(int id) {
    	Optional<Calendar> calendar = findById(id);
    	calendarRepository.deleteById(id);
        return calendar;
    }

    
    public List<Calendar> findAll() {
        return (List<Calendar>) calendarRepository.findAll();
    }

    
    public Optional<Calendar> findById(int id) {
        return calendarRepository.findById(id);
    }

    
    public Calendar update(Calendar calendar) {
        return calendarRepository.save(calendar);
    }
}
