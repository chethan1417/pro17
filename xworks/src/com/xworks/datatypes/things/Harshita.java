package com.xworks.datatypes.things;

public class Harshita {
	
	public Shoe shoe;
	
	public void formals()
	{
		if(shoe!=null)
		{
			shoe.safeGaurd();
			shoe.enhanceWalk();
			System.out.println(shoe.brand);
			System.out.println(shoe.cost);
		}
		else
		{
			System.out.println("shoe is null");
		}
	}

}
