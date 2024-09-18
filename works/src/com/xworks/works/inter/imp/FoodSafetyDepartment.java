package com.xworks.works.inter.imp;

import com.xworks.works.inter.HotelRule;

public class FoodSafetyDepartment {
	private HotelRule hotelRule;
	
	public void setHotelRule(HotelRule hotelRule)
	{
		this.hotelRule=hotelRule;
	}

	public void inspection() {
		if(hotelRule!=null)
		{
			System.out.println("hotelRule is not null");
		hotelRule.cleanPremises();
		}
		else
		{
			System.out.println("hotelRule is null");
		}

	}

}
