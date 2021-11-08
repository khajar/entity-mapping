package com.normalization.springdatjpamapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.normalization.springdatjpamapping.DTO.FlightBookingAcknowledgement;
import com.normalization.springdatjpamapping.DTO.FlightBookingRequest;
import com.normalization.springdatjpamapping.service.FlightBookingService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightBookingService flightBookingService;
	
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request)
	{
		return flightBookingService.bookFightTicket(request);
	}

}
