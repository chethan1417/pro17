package com.xworks.practice.runner;

import com.xworks.practice.assign.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		
         Grinder grinder1=new Grinder("V guard", "black", 3299, 40, 750, 3);
		
		Grinder grinder2=new Grinder("Bajaj", "black", 3299, 40, 750, 3);
		
		boolean same=grinder1.equals(grinder2);
		System.out.println("left hand side=Right hand side:"+same);

	}

}
