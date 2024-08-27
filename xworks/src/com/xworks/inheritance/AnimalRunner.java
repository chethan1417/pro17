package com.xworks.inheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.type="redpole";
		animal.color="black";
		animal.gender='M';
		animal.weight=300;
		animal.price=100000;
		animal.bulldog();
		animal.pitbull();
		animal.redbull();
		animal.bullockCart();
		animal.bengaluruBulls();
		System.out.println("Type:"+animal.type);
		System.out.println("color:"+animal.color);
		System.out.println("gender:"+animal.gender);
		System.out.println("weight"+animal.weight);
		System.out.println("price:"+animal.price);

		Bull animal1=new Animal();
		animal1.type="longhorn";
		animal1.color="white";
		animal1.gender='M';
		animal1.weight=250;
		animal1.price=120000;
		animal1.bulldog();
		animal1.pitbull();
		animal1.redbull();
		animal1.bullockCart();
		animal1.bengaluruBulls();
		System.out.println("Type:"+animal1.type);
		System.out.println("color:"+animal1.color);
		System.out.println("gender:"+animal1.gender);
		System.out.println("weight"+animal1.weight);
		System.out.println("price:"+animal1.price);

	}

}
