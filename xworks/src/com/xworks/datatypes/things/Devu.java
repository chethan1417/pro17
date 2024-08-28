package com.xworks.datatypes.things;

public class Devu {
	
	public WaterBottle waterBottle;
	
	public void hotBottle()
	{
		if(waterBottle!=null)
		{
			waterBottle.crush();
			waterBottle.empty();
			waterBottle.fill();
			System.out.println(waterBottle.quantity);
			System.out.println(waterBottle.color);
		}
		else
		{
			System.out.println("shoe is null");
		}
	}

}
