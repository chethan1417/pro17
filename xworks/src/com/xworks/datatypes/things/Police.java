package com.xworks.datatypes.things;

public class Police {
	
	public void fight(Gun gun)
	{
		if(gun!=null)
		{
		gun.fire();
		gun.display();
		}
		else
		{
			System.out.println("gun is null");
		}
	
	}

}
