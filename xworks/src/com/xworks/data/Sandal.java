package com.xworks.data;

public class Sandal 
{
    String brand;
	char size;
    double cost;
	String color;
	
	public Sandal()
	{
		
	}
	
	public Sandal(String brand, char size, double cost, String color)
	{
		super();
		this.brand = brand;
		this.size = size;
		this.cost = cost;
		this.color = color;
	}
	
	public void show()
	{
		System.out.println("Brand:"+this.brand);
		System.out.println("Size:"+this.size);
		System.out.println("Cost:"+this.cost);
		System.out.println("Color:"+this.color);
	}

}
