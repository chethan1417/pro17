package com.xworks.practice.assign;

public class Jeans {
	
	private String name;
	private String color;
	private double price;
	private int size;
	private String type;
	private int pockets;
	
	
	public Jeans(String name, String color, double price, int size, String type, int pockets) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.size = size;
		this.type = type;
		this.pockets = pockets;
	}

	@Override
	public String toString() {
		return "Jeans [name=" + name + ", color=" + color + ", price=" + price + ", size=" + size + ", type=" + type
				+ ", pockets=" + pockets + "]";
	}

	@Override
	public boolean equals(Object obj) 
	{
		System.out.println("running equals in Jeans");
		
		if(obj!=null) 
		{
			if(obj instanceof Jeans) 
			{
				Jeans casted=(Jeans)obj;
		
				if(this.size==casted.size && this.pockets==casted.pockets &&this.price==casted.price)
				{
					System.out.println("this and obj contents are matching");
					return true;
				}
				else
				{
					System.out.println("obj is not Jeans");
				}
			
			}
			else 
			{
				System.out.println("obj in null");
			}

		
		}
	
			return super.equals(obj);
	
	
	}	

	

}
