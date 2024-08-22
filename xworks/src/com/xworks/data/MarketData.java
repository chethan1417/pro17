package com.xworks.data;

public class MarketData 
{

	private String name;
	private String location;
	
	public MarketData(String name, String location)
	{
		super();
		this.name = name;
		this.location = location;
	}
	
	public void show()
	{
		System.out.println("Name:"+this.name);
		System.out.println("LOcation:"+this.location);
		
		
	}
}
