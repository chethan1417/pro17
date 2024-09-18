package com.xworks.works.runner;

import com.xworks.works.inter.TrafficRule;
import com.xworks.works.inter.imp.DriverTrafficRule;
import com.xworks.works.inter.imp.PoliceTrafficRule;

public class TrafficRunner {

	public static void main(String[] args) {

		TrafficRule traffic = new PoliceTrafficRule();
		DriverTrafficRule driver = new DriverTrafficRule();
		driver.setTrafficRule(traffic);
		driver.detect();

	}

}
