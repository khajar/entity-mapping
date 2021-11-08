package com.normalization.springdatjpamapping.entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Transactional
@Entity
@Table(name = "address")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Address {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int addressId;
	private String city;
	private String addressType;
	
	@OneToOne(mappedBy="address")
	private User user;
	
	public Address() {
		super();
	}

	public Address(int addressId, String city, String addressType) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.addressType = addressType;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	
	

}
