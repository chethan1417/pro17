package com.xworks.practice.assign;

public class Bulb {
	
	private String type;
	private String brand;
	private int lifespan;
	private int voltage;
	private double price;
	private String color;
	
	public Bulb(String type, String brand, int lifespan, int voltage, double price, String color) {
		super();
		this.type = type;
		this.brand = brand;
		this.lifespan = lifespan;
		this.voltage = voltage;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Bulb [type=" + type + ", brand=" + brand + ", lifespan=" + lifespan + ", voltage=" + voltage
				+ ", price=" + price + ", color=" + color + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			
			if(obj instanceof Bulb) {
				
				Bulb bulb=(Bulb)obj;
				System.out.println("use instanceof to convert subclass type into parent type");
		
				if(this.type.equals(bulb.type) && this.lifespan==bulb.lifespan &&this.price==bulb.price)
				{
					System.out.println("check the two given ref are equal or not");
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
