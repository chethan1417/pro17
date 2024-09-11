package com.xworks.practice.assign;

public final class  Towel {//Towel class with final as non access specifier so we cant extend 
	                           //Towel in CottonTowel
	
	public int quantity;
	public void wash()
	{
		System.out.println("created wash in Towel");
	}
	
	public final void wipe()
	{
		System.out.println("created wipe in Towel");
	}
	
	

}
