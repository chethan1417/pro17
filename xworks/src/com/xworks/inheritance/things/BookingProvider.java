package com.xworks.inheritance.things;

public class BookingProvider extends Provider {

	public BookingProvider(String name, String ceoName) {
		super(name, ceoName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void service() {
		System.out.println("created service in BookingProvider");
		
	}
	
	

}
