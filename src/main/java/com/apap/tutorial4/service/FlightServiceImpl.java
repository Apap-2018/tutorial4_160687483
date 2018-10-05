package com.apap.tutorial4.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.tutorial4.model.FlightModel;
import com.apap.tutorial4.repository.FlightDB;

@Service
@Transactional
public class FlightServiceImpl {
	@Autowired
	private FlightDB flightDb;
	
	public void addFlight(FlightModel flight) {
		flightDb.save(flight);
	}
	
}
