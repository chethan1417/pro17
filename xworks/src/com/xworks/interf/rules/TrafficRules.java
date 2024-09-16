package com.xworks.interf.rules;

public interface TrafficRules {

	int noOfPassengersinTwoWheelers();

	int noOfPassengersinFourWheelers();

	boolean helmetMandatory();

	boolean noMods();

	int speedLimit();

	boolean jumpSignals();

	boolean wearSeatBelt();

	boolean parking();

	boolean uTurn();

	boolean leftTurn();

	boolean rightTurn();

	boolean oneWay();

	boolean overtake();

	int ageLimit();

	boolean soundHorn();

}
