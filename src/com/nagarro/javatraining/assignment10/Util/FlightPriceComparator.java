package com.nagarro.javatraining.assignment10.Util;

import java.util.Comparator;

import com.nagarro.javatraining.assignment10.model.Flight;

public class FlightPriceComparator implements Comparator<Flight>
{
	@Override
	public int compare(Flight flight1, Flight flight2) {
		return flight1.getFare()-flight2.getFare();
	}
}
