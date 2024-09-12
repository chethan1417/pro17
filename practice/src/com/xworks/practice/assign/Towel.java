package com.xworks.practice.assign;

public  class  Towel {//Towel class with final as non access specifier so we cant extend 
	                           //Towel in CottonTowel
	
	public int quantity;
	public int price;
	public String material;
	
	
	public Towel(int quantity, int price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public void wash()
	{
		System.out.println("created wash in Towel");
	}
	
	public final void wipe()
	{
		System.out.println("created wipe in Towel");
	}
	
	static {
		System.out.println("created static blck in Towel");
	}
	
	

}
