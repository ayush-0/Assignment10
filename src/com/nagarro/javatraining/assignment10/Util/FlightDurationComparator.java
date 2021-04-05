package com.nagarro.javatraining.assignment10.Util;

import java.util.Comparator;

import com.nagarro.javatraining.assignment10.model.Flight;

public class FlightDurationComparator implements Comparator<Flight> {

	@Override
	public int compare(Flight flight1, Flight flight2) {
		Double answer  = flight1.getFlightDuration()-flight2.getFlightDuration() ;
		if (answer<0)
		return -1;
		else if (answer>0)
			return 1 ;
		else
			return 0;
			
	}

}
