package com.normalization.springdatjpamapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(CompositeKey.class)
@Table(name="subject_student")
public class SubjectStudent {
	
	@Id
	@Column(name="student_id")
	private int stuId;
	
	@Id
	@Column(name="subject_id")
	private int subId;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}
	
	
	

}
