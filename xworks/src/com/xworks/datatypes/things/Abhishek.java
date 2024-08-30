package com.xworks.datatypes.things;

public class Abhishek {
	
	public WashingMachine washingMachine;
	
	
	public void dry()
	{
		if(washingMachine!=null)
		{
			washingMachine.rinse();
			washingMachine.show();
		}
		else
		{
			System.out.println("washingMachine is null");
		}
	}

}
