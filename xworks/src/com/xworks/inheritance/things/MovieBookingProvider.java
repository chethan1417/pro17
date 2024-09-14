package com.xworks.inheritance.things;

public class MovieBookingProvider extends BookingProvider {

	public MovieBookingProvider(String name, String ceoName) {
		super(name, ceoName);

	}

	public void book() {
		System.out.println("created book in MovieBookingProvider");
	}

	public void cancel() {
		System.out.println("created cancel in MovieBookingProvider");
	}

}
