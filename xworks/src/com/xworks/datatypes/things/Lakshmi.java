package com.xworks.datatypes.things;

public class Lakshmi {
	
	public void clean(WashingMachine washingMachine)
	{
		if(washingMachine!=null)
		{
			washingMachine.rinse();
			washingMachine.show();
		}
		else
		{
			System.out.println("WashingMachine is null");
		}
	}

}
