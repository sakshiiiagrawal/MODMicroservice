package com.cs.ms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skill")
public class Skill {
private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="name",nullable=false)
	private String name;
	
	@Column(name="toc",nullable=false)
	private String toc;
	
	@Column(name="prerequisites",nullable=false)
	private String prerequisites;
	
	
	
	
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToc() {
		return toc;
	}
	public void setToc(String toc) {
		this.toc = toc;
	}
	public String getPrerequisites() {
		return prerequisites;
	}
	public void setPrerequisites(String prerequisites) {
		this.prerequisites = prerequisites;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Skill(Integer id, String name, String toc, String prerequisites) {
		super();
		this.id = id;
		this.name = name;
		this.toc = toc;
		this.prerequisites = prerequisites;
	}
	
	
}