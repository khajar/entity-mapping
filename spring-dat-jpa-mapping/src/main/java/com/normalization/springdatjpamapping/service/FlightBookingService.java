package com.normalization.springdatjpamapping.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.normalization.springdatjpamapping.DTO.FlightBookingAcknowledgement;
import com.normalization.springdatjpamapping.DTO.FlightBookingRequest;
import com.normalization.springdatjpamapping.entity.PassengerInfo;
import com.normalization.springdatjpamapping.entity.PaymentInfo;
import com.normalization.springdatjpamapping.repository.PassengerInfoRepository;
import com.normalization.springdatjpamapping.repository.PaymentInfoRepository;
import com.normalization.springdatjpamapping.utils.PaymentUtils;

@Service
public class FlightBookingService {
	
	@Autowired
	private PassengerInfoRepository passengerInfoRepo;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	@Transactional
	public FlightBookingAcknowledgement bookFightTicket(FlightBookingRequest request)
	{
		
		PassengerInfo passengerInfo = request.getPassengerInfo();
		passengerInfo = passengerInfoRepo.save(passengerInfo);
		
		PaymentInfo paymentInfo = request.getPaymentInfo();
		
		PaymentUtils.validateCreditLimit(paymentInfo.getAccNo(), passengerInfo.getFare());
		
		paymentInfo.setPassengerId(passengerInfo.getpId());
		paymentInfo.setAmount(passengerInfo.getFare());
		
		paymentInfoRepository.save(paymentInfo);
		
		return new FlightBookingAcknowledgement("sucess",passengerInfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerInfo);
	}

}
