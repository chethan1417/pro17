package com.xworks.datatypes.things;

public class Alok {
	
	public Car car;
	
	public void drift()
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
