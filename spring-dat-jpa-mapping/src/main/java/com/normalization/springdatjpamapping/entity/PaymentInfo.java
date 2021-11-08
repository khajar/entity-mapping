package com.normalization.springdatjpamapping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="payment")
public class PaymentInfo {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name="uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String  paymentId;
	private String accNo;
	private double amount;
	private Long passengerId;
	
	public PaymentInfo() {
		super();
	}
	
	public PaymentInfo(String paymentId, String accNo, double amount, Long passengerId) {
		super();
		this.paymentId = paymentId;
		this.accNo = accNo;
		this.amount = amount;
		this.passengerId = passengerId;
	}
	
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Long passengerId) {
		this.passengerId = passengerId;
	}

}
