package com.xworks.datatypes;

import com.xworks.datatypes.things.Devu;
import com.xworks.datatypes.things.Gunashree;
import com.xworks.datatypes.things.Shwetha;
import com.xworks.datatypes.things.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		
		Gunashree gunashree =new Gunashree();
		gunashree.bottle();
		
		
		Shwetha shwetha =new Shwetha();
		WaterBottle waterBottle=new WaterBottle();
		shwetha.drink(waterBottle);
		
		Devu devu =new Devu();
		WaterBottle waterBottle1=new WaterBottle();
		devu.waterBottle=waterBottle1;
		devu.hotBottle();
		
	}

}
