package com.xworks.works.inter.imp;

import com.xworks.works.inter.HotelRule;

public class CanaraHotel implements HotelRule {

	@Override
	public boolean cleanPremises() {
		System.out.println("created cleanPremises in CanaraHotel ");
		return false;
	}

}
