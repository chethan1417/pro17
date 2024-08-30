package com.xworks.datatypes.things;

public class Chandan {
	
	public void service(Car car)
	{
		if(car!=null) 
		{
			car.drive();
			car.torsu();
		}
		else
		{
			System.out.println("car is null");
		}
	}

}
