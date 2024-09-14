package com.xworks.inheritance.things;

public class SatJioInternetProvider extends JioInternetProvider {

	private double cost;
	private String launchDate;

	public SatJioInternetProvider(String name, String ceoName, double cost, String launchDate) {
		super(name, ceoName);
		this.cost = cost;
		this.launchDate = launchDate;
	}

	public SatJioInternetProvider(String name, String ceoName) {
		super(name, ceoName);

	}

}
