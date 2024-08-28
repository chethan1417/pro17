package com.xworks.datatypes.things;

public class Omkar {
	
	public void snikers(Shoe shoe)
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
