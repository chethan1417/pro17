package com.xworks.naganna;

public class Government {

	private String state;
	private int noOfMlas;
	private String partyHeadName;
	private String homeMinisterName;
	
	public Government(String state, int noOfMals, String partyHeadName, String homeMinisterName) {
		super();
		this.state = state;
		this.noOfMlas = noOfMals;
		this.partyHeadName = partyHeadName;
		this.homeMinisterName = homeMinisterName;
	}
	
	
	public Government(String state, int noOfMals) {
		super();
		this.state = state;
		this.noOfMlas = noOfMals;
	}


	public void display() {
		
		System.out.println("State:"+this.state);
		System.out.println("No Of Mals:"+this.noOfMlas);
		System.out.println("Party Head Name:"+this.homeMinisterName);
		System.out.println("Home Minister Name:"+this.homeMinisterName);
	}


}
