package com.xworks.data;

public class SidedishData 
{

	String name;
	double price;
	String type;
	
	public SidedishData(String name, double price, String type) 
	{
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	public void torsu()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Price:"+this.price);
		System.out.println("Type:"+this.type);
		
	}
}
