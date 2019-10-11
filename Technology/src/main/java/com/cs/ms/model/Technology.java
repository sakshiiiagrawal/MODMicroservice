package com.cs.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="technology")
public class Technology {
private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="tech_name")
	private String techname;
	
	@Column(name="price")
	private Float price=0.0f;
	
	@Column(name="duration")
	private String duration;
	
	@Column(name="description")
	private String description;

	public Technology() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTechname() {
		return techname;
	}

	public void setTechName(String techName) {
		this.techname = techName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Technology(Integer id, String techname, Float price, String duration, String description) {
		super();
		this.id = id;
		this.techname = techname;
		this.price = price;
		this.duration = duration;
		this.description = description;
	}
	
	
}
