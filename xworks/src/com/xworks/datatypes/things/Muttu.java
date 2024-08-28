package com.xworks.datatypes.things;

public class Muttu {
	
	public void drift(Bikes bikes)
	{
		if(bikes!=null)
		{
			bikes.superSport();
			bikes.adventure();
			bikes.nakedBikes();
			System.out.println(bikes.brand);
			System.out.println(bikes.cc);
		}
		else
		{
			System.out.println("bikes is null");
		}
	}

}
