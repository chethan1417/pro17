package com.xworks.inheritance.things;

public class InternetProvider extends Provider{

	public InternetProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}

	@Override
	public void service() {
		System.out.println("created service in InternetProvider");
		
	}

}
