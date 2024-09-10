package com.xworks.practice.assign;

public class Kettle {
	private String name;
	
	private int power;
	private boolean automatic;
	private String materials;
	private int capacity;
	private double price;
	
	
	public Kettle(String name, String materials, int capacity, double price, int power, boolean automatic) {
		super();
		this.name = name;
		this.materials = materials;
		this.capacity = capacity;
		this.price = price;
		this.power = power;
		this.automatic = automatic;
	}


	@Override
	public String toString() {
		return "Kettle [name=" + name + ", materials=" + materials + ", capacity=" + capacity + ", price=" + price
				+ ", power=" + power + ", automatic=" + automatic + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("created equals in Kettle");
		if (obj!=null) {
			
			if(obj instanceof Kettle) {
				
				Kettle casted=(Kettle)obj;
		
				if(this.name.equals(casted.name) && this.capacity==casted.capacity &&this.price==casted.price)
				{
					System.out.println("contents of  this and obj are same");
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
