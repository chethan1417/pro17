package com.xworks.practice.assign;

public class Mobile {
	
	private String brand;
	private String name;
	private double price;
	private int quantity;
	private String color;
	private int warranty;
	
	
	public Mobile(String brand, String name, double price, int quantity, String color, int warranty) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.color = color;
		this.warranty = warranty;
	}


	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", color="
				+ color + ", warranty=" + warranty + "]";
	}


@Override
	public boolean equals(Object obj) 
	{
		System.out.println("created equals in Mobile");
			if(obj!=null)
			{
				if(obj instanceof Mobile)
				{
					Mobile casted=(Mobile)obj;
					if(this.price==casted.price && this.quantity==casted.quantity && this.brand.equals(casted.brand))
					{
						System.out.println("obj and Mobile contents are equal");
						return true;
					}
					else
					{
						System.out.println("obj and Mobile contents are not equal");
						return false;
					}
				}
			}
			else
			{
				System.out.println("obj is null");
			}
			
	
	return super.equals(obj);
	}
	
	
	

}
