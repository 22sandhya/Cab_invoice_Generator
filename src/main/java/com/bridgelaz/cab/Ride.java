package com.bridgelaz.cab;

import com.bridgelaz.cab.InvoiceGenerator.RideMode;

public class Ride {

	public final int time;
	public double distance;

	// parameterized Constructor
	public Ride(double distance, int time) {
		this.distance = distance;
		this.time = time;
	}

	public Ride(double distance, int time, RideMode rideMode) {
		this.distance = distance;
		this.time = time;
	}

}
