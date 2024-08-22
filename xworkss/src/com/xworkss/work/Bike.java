package com.xworkss.work;

public class Bike
{ 

	private String[] bikenames=new String[7];
	private int counts;
	
	public void store(String bikeName)
	{
		this.bikenames[this.counts]=bikeName;
		this.counts++;
	}
	
	public void display()
	{
		for(String bikeName:bikenames)
		{
			System.out.println("Bike Name:"+bikeName);
		}
	
	}

}