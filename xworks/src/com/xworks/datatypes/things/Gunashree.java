package com.xworks.datatypes.things;

public class Gunashree {
	
	public void bottle()
	{
		WaterBottle waterBottle=new WaterBottle();
		waterBottle.fill();
		waterBottle.empty();
		waterBottle.crush();
		System.out.println(waterBottle.quantity);
		System.out.println(waterBottle.color);
		
	}

}
