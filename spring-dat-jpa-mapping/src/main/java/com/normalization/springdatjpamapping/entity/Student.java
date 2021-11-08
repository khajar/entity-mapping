package com.normalization.springdatjpamapping.entity;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "student")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stuId;
	private String stuName;
	private int stuClass;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="student")
	private List<Subjects> subject;
	
	public Student()
	{
		
	}
	
	public Student(String stuName, int stuClass) {
		super();
		this.stuName = stuName;
		this.stuClass = stuClass;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuClass() {
		return stuClass;
	}
	public void setStuClass(int stuClass) {
		this.stuClass = stuClass;
	}
	public List<Subjects> getSubject() {
		return subject;
	}
	public void setSubject(List<Subjects> subject) {
		this.subject = subject;
	}
}
