package com.infy.jd.ormspring.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.aot.generate.GeneratedTypeReference;

@Entity
@Table(name="stu_det")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="stu_id")
private Integer stuId;
	@Column(name="stu_name")
private String stuName;
	@Column(name="stu_city")
private String stuCity;
	
	
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuCity() {
		return stuCity;
	}
	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}
	public Student(String stuName, String stuCity) {
		super();
		this.stuName = stuName;
		this.stuCity = stuCity;
	}
	public Student() {
		super();
	}
	
	
	
	
	
	
	
	
}
