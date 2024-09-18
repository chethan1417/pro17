package com.xworks.works.inter.imp;

import com.xworks.works.inter.TrafficRule;

public class PoliceTrafficRule implements TrafficRule {

	@Override
	public String licenceNo() {
		System.out.println("created licenceNo in ");
		return "420";
	}

}
