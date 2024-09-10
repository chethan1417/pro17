package com.xworks.practice.assign;

public class Helmet {
	

	private String brand;
	private char size;
	private String material;
	private double weight;
	private int lifespan;
	private double price;
	
	public Helmet(String brand, char size, String material, double weight, int lifespan, double price) {
		super();
		this.brand = brand;
		this.size = size;
		this.material = material;
		this.weight = weight;
		this.lifespan = lifespan;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {

	    if (obj!=null) {
				
				if(obj instanceof Helmet) {
					
					Helmet helmet=(Helmet)obj;
					System.out.println("use instanceof to convert subclass type into parent type");
			
					if(this.brand.equals(helmet.brand) && this.size==helmet.size &&this.price==helmet.price)
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
