package com.xworks.data;

public class SidedishRunner
{

	public static void main(String[] args) 
	{
		SidedishStore store = new SidedishStore();
		
		SidedishData d1=new SidedishData("kebab",50,"Non-veg");
		SidedishData d2=new SidedishData("pickle",10,"veg");
		SidedishData d3=new SidedishData("lemon chicken",250,"Non-veg");
		SidedishData d4=new SidedishData("chips",20,"veg");
		SidedishData d5=new SidedishData("tandoori",300,"Non-veg");
		
		store.save(d1);
		store.save(d2);
		store.save(d3);
		store.save(d4);
		store.save(d5);
		
		store.display();
		

	}

}
