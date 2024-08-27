package com.xworks.inheritance;

public class HalwaRunner {

	public static void main(String[] args) {
		
		Sweet sweet=new Sweet();
		sweet.quantity=4;
		sweet.price=20;
		sweet.type="carrot";
		sweet.taste();
		sweet.carrot();
		System.out.println("Quantity:"+sweet.quantity);
		System.out.println("price:"+sweet.price);
		System.out.println("type:"+sweet.type);
		
		Halwa sweet1=new Sweet();
		sweet1.quantity=2;
		sweet1.price=30;
		sweet1.type=" special carrot";
		sweet1.carrot();
		sweet.taste();
		System.out.println("Quantity:"+sweet1.quantity);
		System.out.println("price:"+sweet1.price);
		System.out.println("type:"+sweet1.type);

		
		


	}

}
