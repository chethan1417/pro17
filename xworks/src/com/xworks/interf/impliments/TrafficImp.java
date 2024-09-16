package com.xworks.interf.impliments;

import com.xworks.interf.rules.TrafficRules;

public class TrafficImp implements TrafficRules {

	@Override
	public int noOfPassengersinTwoWheelers() {
		System.out.println("created noOfPassengersinTwoWheelers in TrafficImp ");
		return 0;
	}

	@Override
	public int noOfPassengersinFourWheelers() {
		System.out.println("created noOfPassengersinFourWheelers in TrafficImp ");
		return 0;
	}

	@Override
	public boolean helmetMandatory() {
		System.out.println("created helmetMandatory in TrafficImp ");
		return false;
	}

	@Override
	public boolean noMods() {
		System.out.println("created noMods in TrafficImp ");
		return false;
	}

	@Override
	public int speedLimit() {
		System.out.println("created speedLimit in TrafficImp ");
		return 0;
	}

	@Override
	public boolean jumpSignals() {
		System.out.println("created jumpSignals in TrafficImp ");
		return false;
	}

	@Override
	public boolean wearSeatBelt() {
		System.out.println("created wearSeatBelt in TrafficImp ");
		return false;
	}

	@Override
	public boolean parking() {
		System.out.println("created parking in TrafficImp ");
		return false;
	}

	@Override
	public boolean uTurn() {
		System.out.println("created uTurn in TrafficImp ");
		return false;
	}

	@Override
	public boolean leftTurn() {
		System.out.println("created leftTurn in TrafficImp ");
		return false;
	}

	@Override
	public boolean rightTurn() {
		System.out.println("created rightTurn in TrafficImp ");
		return false;
	}

	@Override
	public boolean oneWay() {
		System.out.println("created oneWay in TrafficImp ");
		return false;
	}

	@Override
	public boolean overtake() {
		System.out.println("created overtake in TrafficImp ");
		return false;
	}

	@Override
	public int ageLimit() {
		System.out.println("created ageLimit in TrafficImp ");
		return 0;
	}

	@Override
	public boolean soundHorn() {
		System.out.println("created soundHorn in TrafficImp ");
		return false;
	}

}
