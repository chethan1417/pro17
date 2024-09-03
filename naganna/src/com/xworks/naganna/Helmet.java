package com.xworks.naganna;

public class Helmet {
	
	private String brand;
	private String color;
	private double price;
	
	public Helmet(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
	}
	
	public Helmet(String brand,String color,double price)
	{
		this(brand,color);
		this.price=price;
	}
	
	public void display()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Color:"+this.color);
		System.out.println("Price:"+this.price);
	}

}
