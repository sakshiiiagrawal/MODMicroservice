package com.cs.ms.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdata")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String reppassword;
	private String firstname;
	private String lastname;
	private String emailid;
	private Long contactnumber;
	private String regcode="";
	private String role;
	private String linkedinurl;
	private String yearsofexperience;
	private boolean active;
	private boolean confirmedsignup;
	private boolean resetpassword;
	private Date resetpassworddate;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReppassword() {
		return reppassword;
	}
	public void setReppassword(String reppassword) {
		this.reppassword = reppassword;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(Long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getRegcode() {
		return regcode;
	}
	public void setRegcode(String regcode) {
		this.regcode = regcode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLinkedinurl() {
		return linkedinurl;
	}
	public void setLinkedinurl(String linkedinurl) {
		this.linkedinurl = linkedinurl;
	}
	public String getYearsofexperience() {
		return yearsofexperience;
	}
	public void setYearsofexperience(String yearsofexperience) {
		this.yearsofexperience = yearsofexperience;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isConfirmedsignup() {
		return confirmedsignup;
	}
	public void setConfirmedsignup(boolean confirmedsignup) {
		this.confirmedsignup = confirmedsignup;
	}
	public boolean isResetpassword() {
		return resetpassword;
	}
	public void setResetpassword(boolean resetpassword) {
		this.resetpassword = resetpassword;
	}
	public Date getResetpassworddate() {
		return resetpassworddate;
	}
	public void setResetpassworddate(Date resetpassworddate) {
		this.resetpassworddate = resetpassworddate;
	}
	public User(Long id, String username, String password, String reppassword, String firstname, String lastname,
			String emailid, Long contactnumber, String regcode, String role, String linkedinurl,
			String yearsofexperience, boolean active, boolean confirmedsignup, boolean resetpassword,
			Date resetpassworddate) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.reppassword = reppassword;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.contactnumber = contactnumber;
		this.regcode = regcode;
		this.role = role;
		this.linkedinurl = linkedinurl;
		this.yearsofexperience = yearsofexperience;
		this.active = active;
		this.confirmedsignup = confirmedsignup;
		this.resetpassword = resetpassword;
		this.resetpassworddate = resetpassworddate;
	}
	
	
	
}
