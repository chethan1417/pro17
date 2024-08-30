package com.xworks.datatypes.things;

public class Soldier {

	public void shoot()
	{
		Gun gun=new Gun("ump45","Russia","AR");
		gun.fire();
		gun.display();	
	}
}
