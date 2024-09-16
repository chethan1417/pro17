package com.xworks.interf.rules.runner;

import com.xworks.interf.impliments.TrafficImp;

public class TrafficRunner {

	public static void main(String[] args) {

		TrafficImp traffic = new TrafficImp();
		System.out.println(traffic.ageLimit());
		System.out.println(traffic.helmetMandatory());
		System.out.println(traffic.jumpSignals());
		System.out.println(traffic.leftTurn());
		System.out.println(traffic.noMods());
		System.out.println(traffic.noOfPassengersinFourWheelers());
		System.out.println(traffic.noOfPassengersinTwoWheelers());
		System.out.println(traffic.oneWay());
		System.out.println(traffic.overtake());
		System.out.println(traffic.parking());
		System.out.println(traffic.rightTurn());
		System.out.println(traffic.soundHorn());
		System.out.println(traffic.speedLimit());
		System.out.println(traffic.uTurn());
		System.out.println(traffic.wearSeatBelt());

	}

}
