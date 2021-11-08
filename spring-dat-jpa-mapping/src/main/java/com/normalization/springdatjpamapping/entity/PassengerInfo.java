package com.normalization.springdatjpamapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passenger_info")
public class PassengerInfo {
	
	@Id
	@GeneratedValue
	private Long pId;
	private String name;
	private String source;
	private String destination;
	private double fare;
	
	public PassengerInfo(Long pId, String name, String source, String destination,double fare) {
		super();
		this.pId = pId;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.fare=fare;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public PassengerInfo() {
		super();
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}	
	
}
