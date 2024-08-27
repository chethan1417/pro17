package com.xworks.inheritance;

public class MobileRunner {

	public static void main(String[] args) {
		
		
		Mobile mob =new Mobile();
		mob.brand="realme";
		mob.price=20000;
		mob.color="black";
		mob.quantity=1;
		mob.mobile();
		mob.gadjet();
		System.out.println("Brand:"+mob.brand);
		System.out.println("price:"+mob.price);
		System.out.println("color:"+mob.color);
		System.out.println("quantity:"+mob.quantity);
		
		
		SmartPhone mob1=new Mobile();
		mob1.brand="redme";
		mob1.price=22500;
		mob1.color="white";
		mob1.quantity=2;
		mob1.mobile();
		mob1.gadjet();
		System.out.println("Brand:"+mob1.brand);
		System.out.println("price:"+mob1.price);
		System.out.println("color:"+mob1.color);
		System.out.println("quantity:"+mob1.quantity);

		
	}

}
