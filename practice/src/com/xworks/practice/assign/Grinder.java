package com.xworks.practice.assign;

public class Grinder {
	
	private String name;
	private String color;
	private double price;
	private int discount;
	private int powerConsumption;
	private int noOfJars;
	
	public Grinder(String name, String color, double price, int discount, int powerConsumption, int noOfJars) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.discount = discount;
		this.powerConsumption = powerConsumption;
		this.noOfJars = noOfJars;
	}

	@Override
	public String toString() {
		return "Grinder [name=" + name + ", color=" + color + ", price=" + price + ", discount=" + discount
				+ ", powerConsumption=" + powerConsumption + ", noOfJars=" + noOfJars + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("created equals in Grinder");
			if (obj!=null) {
			
			if(obj instanceof Grinder) {
				
				Grinder casted=(Grinder)obj;
		
				if(this.name.equals(casted.name) && this.powerConsumption==casted.powerConsumption &&this.price==casted.price)
				{
					System.out.println("this and obj are equal");
					return true;
				}
				else
				{
					System.out.println("both are not equals");
				}
			
			}
			else 
			{
				System.out.println("obj is null");
			}
		}
		return super.equals(obj);
	}

}
