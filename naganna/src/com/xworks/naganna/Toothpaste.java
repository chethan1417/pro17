package com.xworks.naganna;

public class Toothpaste {
	
	private String brand;
	private double price;
	
	public Toothpaste()
	{
		System.out.println("created Toothpaste with no-arg const..");
	}
		
	public Toothpaste(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	
	public void torsu()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Price:"+this.price);
	}
}
