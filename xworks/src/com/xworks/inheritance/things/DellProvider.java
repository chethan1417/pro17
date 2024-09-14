package com.xworks.inheritance.things;

public class DellProvider extends Provider {

	public DellProvider(String name, String ceoName) {
		super(name, ceoName);

	}

	@Override
	public void service() {
		System.out.println("created service in DellProvider");

	}

}
