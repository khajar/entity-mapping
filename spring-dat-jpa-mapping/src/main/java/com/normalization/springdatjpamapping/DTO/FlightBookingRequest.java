package com.normalization.springdatjpamapping.DTO;

import com.normalization.springdatjpamapping.entity.PassengerInfo;
import com.normalization.springdatjpamapping.entity.PaymentInfo;

public class FlightBookingRequest {

	private PassengerInfo passengerInfo;
	
	private PaymentInfo paymentInfo;

	public FlightBookingRequest() {
		super();
	}

	public FlightBookingRequest(PassengerInfo passengerInfo, PaymentInfo paymentInfo) {
		super();
		this.passengerInfo = passengerInfo;
		this.paymentInfo = paymentInfo;
	}

	public PassengerInfo getPassengerInfo() {
		return passengerInfo;
	}

	public void setPassengerInfo(PassengerInfo passengerInfo) {
		this.passengerInfo = passengerInfo;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	
	
}
