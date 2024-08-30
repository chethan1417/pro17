package com.xworks.datatypes.things;

public class DBoss {
	
	public Gun gun;
	
	public void jail()
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
