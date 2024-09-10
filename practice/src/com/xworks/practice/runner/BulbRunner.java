package com.xworks.practice.runner;

import com.xworks.practice.assign.Bulb;

public class BulbRunner {

	public static void main(String[] args) {
	
        Bulb bulb1=new Bulb("LED", "Philips", 4, 120, 150, "white");
		
		Bulb bulb2=new Bulb("LED", "Philips", 3, 120, 90, "white");

		boolean same=bulb1.equals(bulb2);
		System.out.println(same);

	}

}
