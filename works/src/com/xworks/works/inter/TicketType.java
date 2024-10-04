package com.xworks.works.inter;

public enum TicketType {

	ONLINE(199),OFFLINE(250);
	
	private double cost;
	
	private TicketType(double cost) {
		this.cost=cost;
	}
	
	public double getCost() {
		return cost;
	}
}
