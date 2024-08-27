package com.xworks.inheritance;

public class StreetLightRunner 
{

	public static void main(String[] args) 
	{
		StreetLight light =new StreetLight();
		light.color="white";
		light.glow();
		System.out.println("bulb color:"+light.color);
		
		Bulb light1=new StreetLight();
		light1.color="orange";
		light1.glow();
		System.out.println("bulb color:"+light1.color);

	}

}
