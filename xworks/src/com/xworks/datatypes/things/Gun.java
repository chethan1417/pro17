package com.xworks.datatypes.things;

public class Gun {
	
	private String name;
	private String countryMade;
	private String type;
	
	
	public Gun()
	{
		System.out.println("created Gun");
	}
	
	public void fire()
	{
		System.out.println("created fire in Gun");
	}
	
	public Gun(String name,String countryMade,String type) 
	{
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}

	public void display()
	{
		System.out.println("Gun name:"+this.name);
		System.out.println("Country manufactured:"+this.countryMade);
		System.out.println("Gun type:"+this.type);

	}

	
}
