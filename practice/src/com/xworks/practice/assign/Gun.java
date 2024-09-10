package com.xworks.practice.assign;

public class Gun {
	
	private String modelName;
	private String brand;
	private double price;
	private double weight;
	private String color;
	private int bullets;
	
	public Gun(String modelName, String brand, double price, double weight, String color, int bullets) {
		super();
		this.modelName = modelName;
		this.brand = brand;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.bullets = bullets;
	}

	@Override
	public String toString() {
		return "Gun [modelName=" + modelName + ", brand=" + brand + ", price=" + price + ", weight=" + weight
				+ ", color=" + color + ", bullets=" + bullets + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj!=null) {
			
			if(obj instanceof Gun) {
				
				Gun gun=(Gun)obj;
				System.out.println("use instanceof to convert subclass type into parent type");
		
				if(this.modelName.equals(gun.modelName) && this.weight==gun.weight &&this.price==gun.price)
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
