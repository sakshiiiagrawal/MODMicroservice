package com.cs.ms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="training")
public class Training {
private static final long serialVersionUID=1L;
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="status")
	private String status;
	
	@Column(name="progress")
	private Integer progress=0;
	
	@Column(name="fees")
	private Float fes=0.0f;
	
	@Column(name="commission_amount")
	private Float commission_amount=0.0f;
	
	@Column(name="rating")
	private Integer rating=0;
	
	@Column(name="avg_rating")
	private Integer avgRating=0;
	
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
	
	@Column(name="amount_received")
	private Float amountReceived=0.0f;
	
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="mentor_id")
	private Integer mentorId;
	
	@Column(name="skill_id")
	private Integer skillId;
	
	@Column(name="razorpay_payment__id")
	private Long razorpayPaymentId;
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getProgress() {
		return progress;
	}
	public void setProgress(Integer progress) {
		this.progress = progress;
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
	public Integer getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(Integer avgRating) {
		this.avgRating = avgRating;
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
	public Float getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(Float amountReceived) {
		this.amountReceived = amountReceived;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getMentorId() {
		return mentorId;
	}
	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}
	public Long getRazorpayPaymentId() {
		return razorpayPaymentId;
	}
	public void setRazorpayPaymentId(Long razorpayPaymentId) {
		this.razorpayPaymentId = razorpayPaymentId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Training(Integer id, String status, Integer progress, Float fes, Float commission_amount, Integer rating,
			Integer avgRating, String startDate, String endDate, String startTime, String endTime, Float amountReceived,
			Integer userId, Integer mentorId, Integer skillId, Long razorpayPaymentId) {
		super();
		this.id = id;
		this.status = status;
		this.progress = progress;
		this.fes = fes;
		this.commission_amount = commission_amount;
		this.rating = rating;
		this.avgRating = avgRating;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.amountReceived = amountReceived;
		this.userId = userId;
		this.mentorId = mentorId;
		this.skillId = skillId;
		this.razorpayPaymentId = razorpayPaymentId;
	}
	
}