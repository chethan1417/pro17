package com.xworks.works.inter.imp;

import com.xworks.works.inter.TrafficRule;

public class DriverTrafficRule {

	private TrafficRule trafficRule;

	public void setTrafficRule(TrafficRule trafficRule) {
		this.trafficRule = trafficRule;
	}

	public void detect() {
		if (trafficRule != null) {
			System.out.println("trafficRule is not null");

			trafficRule.licenceNo();
		} else {
			System.out.println("trafficRule is null");
		}
	}
}
