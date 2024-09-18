package com.xworks.works.runner;

import com.xworks.works.inter.HotelRule;
import com.xworks.works.inter.imp.CanaraHotel;
import com.xworks.works.inter.imp.FoodSafetyDepartment;

public class HotelRunner {

	public static void main(String[] args) {

		HotelRule hotelRule = new CanaraHotel();
		FoodSafetyDepartment safety = new FoodSafetyDepartment();
		safety.setHotelRule(hotelRule);
		safety.inspection();

	}

}
