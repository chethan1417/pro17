package com.xworks.practice.runner;

import com.xworks.practice.assign.Jeans;

public class JeansRunner {

	public static void main(String[] args) {
	
        Jeans jeans1=new Jeans("tone jeans", "black", 750, 30, "denim", 2);
		
		Jeans jeans2=new Jeans("cotton jeans", "blue", 750, 30, "denim", 2);
		
		boolean same= jeans2.equals(jeans1);
		
		System.out.println("Left hand side==Right hand side:"+same);

	}

}
