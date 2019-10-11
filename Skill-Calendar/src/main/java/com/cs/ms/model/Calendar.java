package com.cs.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calendar")
public class Calendar {
private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="mentor_id",nullable=false)
	private String mentorId;
	
	@Column(name="time_slot",nullable=false)
	private String timeSlot;

	public Calendar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calendar(Integer id, String mentorId, String timeSlot) {
		super();
		this.id = id;
		this.mentorId = mentorId;
		this.timeSlot = timeSlot;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMentorId() {
		return mentorId;
	}

	public void setMentorId(String mentorId) {
		this.mentorId = mentorId;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}