package com.normalization.springdatjpamapping.DTO;

import com.normalization.springdatjpamapping.entity.Customer;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class OrderRequest {

	public OrderRequest() {
		super();
	}

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private Customer customer;
	
	
}

