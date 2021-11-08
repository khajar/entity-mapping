package com.normalization.springdatjpamapping.entity;

import java.io.Serializable;

public class CompositeKey implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int stuId;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
