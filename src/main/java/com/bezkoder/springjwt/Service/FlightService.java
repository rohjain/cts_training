package com.bezkoder.springjwt.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.bezkoder.springjwt.models.Flight;
import com.bezkoder.springjwt.models.ScheduledFlight;
import com.bezkoder.springjwt.repository.FlightRepository;
@Component
public class FlightService {
	@Autowired
	FlightRepository flightRepository;
	 public ScheduledFlight addflight(ScheduledFlight flight) {
		 ScheduledFlight b = this.flightRepository.save(flight);
		 
	        return b;
	    }

}
