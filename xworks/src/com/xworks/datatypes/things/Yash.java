package com.xworks.datatypes.things;

public class Yash
{

	public void tear(Hat hat)
	{
		if(hat!=null)
		{
		    hat.shade();
		    System.out.println(hat.color);
		}
	    else   
	    {
		    System.out.println("hat is null");
	    }
    }
}
