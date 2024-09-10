package com.xworks.practice.assign;

public class Bedsheet {
	
	private String material;
	private String size;
	private String color;
	private int durability;
	private double price;
	private int discount;
	
	public Bedsheet(String material, String size, String color, int durability, double price, int discount) {
		super();
		this.material = material;
		this.size = size;
		this.color = color;
		this.durability = durability;
		this.price = price;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Bedsheet [material=" + material + ", size=" + size + ", color=" + color + ", durability=" + durability
				+ ", price=" + price + ", discount=" + discount + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("created equals in Bedsheet ");
		if (obj!=null) {
			
			if(obj instanceof Saree) {
				
				Bedsheet casted=(Bedsheet)obj;
			
		
				if(this.material.equals(casted.material) && this.color.equals(casted.color) &&this.price==casted.price)
				{
					System.out.println("contents of this and obj are equal");
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
