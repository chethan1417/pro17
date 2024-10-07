package com.xworkz.collection.works;

public class LabourRunner {

	public static void main(String[] args) {

		Starter starter = () -> {
			System.out.println("on method is running");
		};

		Labour labour = new Labour();
		labour.work(starter);

		FoodApp foodApp = (String items) -> {
			System.out.println("foods method is running:"+items);

		};
		labour.orderFood(foodApp);

	}
}
