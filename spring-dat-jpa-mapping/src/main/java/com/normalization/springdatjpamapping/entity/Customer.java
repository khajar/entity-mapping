package com.normalization.springdatjpamapping.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Entity

public class Customer {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	
	@JsonIgnore
	@OneToMany(targetEntity = Product.class,cascade=CascadeType.ALL)
	@JoinColumn(name ="cp_fk", referencedColumnName="id")
	private List<Product> products;
	
	public Customer() {
		super();
	}
	public Customer(int id, String name, String email, List<Product> products) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.products = products;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}

