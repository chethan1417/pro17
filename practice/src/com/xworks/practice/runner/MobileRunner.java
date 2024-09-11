package com.xworks.practice.runner;

import com.xworks.practice.assign.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		
		
		Mobile mobile1=new Mobile("realme", "narzo", 15000, 1, "black", 1);
		Mobile mobile2=new Mobile("realme", "narzo", 15000, 1, "black", 1);
		
		boolean same=mobile1.equals(mobile2);
		System.out.println("Lhs=rhs:"+same);
		

	}

}
