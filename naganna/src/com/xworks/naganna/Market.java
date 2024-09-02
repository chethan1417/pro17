package com.xworks.naganna;

public class Market {
	
	private String name;
	private String location;
	private String shops;
	private String type;
	
	public Market(String name, String location, String shops, String type) {
		super();
		this.name = name;
		this.location = location;
		this.shops = shops;
		this.type = type;
	}

	public Market(String shops) {
		super();
		this.shops = shops;
	}
	
	public void show()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Location:"+this.location);
		System.out.println("Shops:"+this.shops);
		System.out.println("Type:"+this.type);
	}

}
