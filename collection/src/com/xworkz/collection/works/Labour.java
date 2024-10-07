package com.xworkz.collection.works;

public class Labour {

	public void work(Starter starter) {
		System.out.println("work in Labour");
		if (starter != null) {
			System.out.println("starter is not null");
			starter.on();
		} else {
			System.out.println("starter is null");
		}
	}

	public void orderFood(FoodApp foodApp)
	{
		if(foodApp!=null)
		{
			System.out.println("foodApp is  not null");
			foodApp.order("Biryani");
		}
		else
		{
			System.out.println("foodApp is null");
		}
	}

}
