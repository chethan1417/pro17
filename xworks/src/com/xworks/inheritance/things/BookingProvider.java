package com.xworks.inheritance.things;

public class BookingProvider extends Provider {

	public BookingProvider(String name, String ceoName) {
		super(name, ceoName);
	}

	@Override
	public void service() {
		System.out.println("created service in BookingProvider");

	}

}
