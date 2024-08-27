package com.xworks.inheritance;

public class BirdRunner {

	public static void main(String[] args) {
		
       Bird bird = new Bird();
       bird.type="jersey";
       bird.color="black";
       bird.weight=3;
       bird.height=25;
       bird.quantity=2;
       bird.quality='H';
       bird.ownerName="naganna";
       bird.contact=854886669;
       bird.gender='M';
       bird.district="CTA";
       bird.chickenBiryani();
       bird.chickenKebab();
       bird.chickenManchurian();
       bird.drillChicken();
       bird.lemonChicken();
       System.out.println("Type:"+bird.type);
       System.out.println("color:"+bird.color);
       System.out.println("weight:"+bird.weight);
       System.out.println("height:"+bird.height);
       System.out.println("quantity:"+bird.quantity);
       System.out.println("quality:"+bird.quality);
       System.out.println("ownerName:"+bird.ownerName);
       System.out.println("contact:"+bird.contact);
       System.out.println("gender:"+bird.gender);
       System.out.println("district:"+bird.district);
       
       
       Chicken bird1 = new Bird();
       bird1.type="form";
       bird1.color="white";
       bird1.weight=4;
       bird1.height=20;
       bird1.quantity=5;
       bird1.quality='M';
       bird1.ownerName="ranjith";
       bird1.contact=998678893;
       bird1.gender='F';
       bird1.district="DVG";
       bird1.chickenBiryani();
       bird1.chickenKebab();
       bird1.chickenManchurian();
       bird1.drillChicken();
       bird1.lemonChicken();
       System.out.println("Type:"+bird1.type);
       System.out.println("color:"+bird1.color);
       System.out.println("weight:"+bird1.weight);
       System.out.println("height:"+bird1.height);
       System.out.println("quantity:"+bird1.quantity);
       System.out.println("quality:"+bird1.quality);
       System.out.println("ownerName:"+bird1.ownerName);
       System.out.println("contact:"+bird1.contact);
       System.out.println("gender:"+bird1.gender);
       System.out.println("district:"+bird1.district);

	}

}
