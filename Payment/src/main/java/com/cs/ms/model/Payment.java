package com.cs.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="txn_type")
	private String txnType;
	
	@Column(name="amount")
	private Float amount;
	
	@Column(name="remarks")
	private String remarks;
	
	@Column(name="mentor_id")
	private Integer mentorId;
	
	@Column(name="mentor_name")
	private String mentorName;
	
	@Column(name="training_id")
	private Integer trainingId;
	
	@Column(name="skill_name")
	private String skillName;
	
	@Column(name="total_amount_to_mentor")
	private Float totalAmountToMentor;
	
	@Column(name="payment_type")
	private String paymentType;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Float getTotalAmountToMentor() {
		return totalAmountToMentor;
	}

	public void setTotalAmountToMentor(Float totalAmountToMentor) {
		this.totalAmountToMentor = totalAmountToMentor;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(Integer id, String txnType, Float amount, String remarks, Integer mentorId, String mentorName,
			Integer trainingId, String skillName, Float totalAmountToMentor, String paymentType) {
		super();
		this.id = id;
		this.txnType = txnType;
		this.amount = amount;
		this.remarks = remarks;
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.trainingId = trainingId;
		this.skillName = skillName;
		this.totalAmountToMentor = totalAmountToMentor;
		this.paymentType = paymentType;
	}
	
	
}