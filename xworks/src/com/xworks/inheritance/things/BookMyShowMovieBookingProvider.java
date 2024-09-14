package com.xworks.inheritance.things;

public class BookMyShowMovieBookingProvider extends MovieBookingProvider {

	private int totalHalls;

	@Override
	public void book() {
		System.out.println("created book in BookMyShowMovieBookingProvider");
	}

	@Override
	public void cancel() {
		System.out.println("created cancel in BookMyShowMovieBookingProvider");

	}

	public BookMyShowMovieBookingProvider(String name, String ceoName, int totalHalls) {
		super(name, ceoName);
		this.totalHalls = totalHalls;
	}

	public BookMyShowMovieBookingProvider(String name, String ceoName) {
		super(name, ceoName);

	}

}
