package com.xworks.practice.assign;

public class Saree {
	
	private String type;
	private String fabric;
	private double length;
	private double width;
	private String color;
	private double price;
	
	public Saree(String type, String fabric, double length, double width, String color, double price) {
		super();
		this.type = type;
		this.fabric = fabric;
		this.length = length;
		this.width = width;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Saree [type=" + type + ", fabric=" + fabric + ", length=" + length + ", width=" + width + ", color="
				+ color + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("created equals in saree");
		
		if (obj!=null) {
			
			if(obj instanceof Saree) {
				
				Saree casted=(Saree)obj;		
				if(this.type.equals(casted.type) && this.color.equals(casted.color) &&this.price==casted.price)
				{
					System.out.println("obj and this contents are equal");
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
