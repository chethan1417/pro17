package com.xworks.naganna;

public class Blackshoe extends Shoe{
	
	public void run()
	{
		System.out.println("created run in Blackshoe");
	}

	@Override
	public void walk()
	{
		System.out.println("created walk in BlackShoe");
	}

}
