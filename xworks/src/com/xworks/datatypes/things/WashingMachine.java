package com.xworks.datatypes.things;

public class WashingMachine {
	
	private String brand;
	private String type;
	private int capacity;
	
	
	public WashingMachine()
	{
		System.out.println("created WashingMachine");
	}
	
	public void rinse()
	{
		System.out.println("created rinse in WashingMachine");
	}
	
	public WashingMachine(String brand,String type,int capacity) 
	{
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}

	public void show()
	{
		System.out.println("Brand name:"+this.brand);
		System.out.println("Type:"+this.type);
		System.out.println("Capacity:"+this.capacity);

	}


}
