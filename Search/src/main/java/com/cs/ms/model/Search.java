package com.cs.ms.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="search")
public class Search {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="years_of_experience")
	private String yearsOf_experience;
	
	@Column(name="tech_name")
	private String techName;
	
	@Column(name="fees")
	private Float fes=0.0f;
	
	@Column(name="commission_amount")
	private Float commission_amount=0.0f;
	
	@Column(name="rating")
	private Integer rating=0;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="start_date")
	private String startDate;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="end_date")
	private String endDate;
	
	@JsonFormat(pattern="HH:mm:ss")
	@Column(name="start_time")
	private String startTime;
	
	@JsonFormat(pattern="HH:mm:ss")
	@Column(name="end_time")
	private String endTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getYearsOf_experience() {
		return yearsOf_experience;
	}

	public void setYearsOf_experience(String yearsOf_experience) {
		this.yearsOf_experience = yearsOf_experience;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public Float getFes() {
		return fes;
	}

	public void setFes(Float fes) {
		this.fes = fes;
	}

	public Float getCommission_amount() {
		return commission_amount;
	}

	public void setCommission_amount(Float commission_amount) {
		this.commission_amount = commission_amount;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}



	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Search() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Search(Integer id, String firstName, String lastName, String yearsOf_experience, String techName, Float fes,
			Float commission_amount, Integer rating, String startDate, String endDate, String startTime,
			String endTime) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearsOf_experience = yearsOf_experience;
		this.techName = techName;
		this.fes = fes;
		this.commission_amount = commission_amount;
		this.rating = rating;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
	}




	
	
}
