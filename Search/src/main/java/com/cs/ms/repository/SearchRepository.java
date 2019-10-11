package com.cs.ms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cs.ms.model.Search;

public interface SearchRepository extends CrudRepository<Search, Integer> {

	List<Search> findByTechName(String techName);

	List<Search> findByStartTimeAndEndTime(String startTime, String endTime);

	List<Search> findByStartDateAndEndDate(String startDate, String endDate);

}
