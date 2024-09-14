package com.xworks.inheritance.things;

public class LenovoProvider extends Provider {

	private double profit;

	public LenovoProvider(String name, String ceoName, double profit) {
		super(name, ceoName);
		this.profit = profit;
	}

	public LenovoProvider(String name, String ceoName) {
		super(name, ceoName);

	}

	@Override
	public void service() {
		System.out.println("created service in LenovoProvider");
	}

}
