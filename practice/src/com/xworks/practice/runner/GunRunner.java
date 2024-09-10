package com.xworks.practice.runner;

import com.xworks.practice.assign.Gun;

public class GunRunner {

	public static void main(String[] args) {
		
		
        Gun gun1 =new Gun("glock 19", "glock", 2500, 25, "black", 12);
		
		Gun gun2 =new Gun("glock 19", "glock", 2500, 25, "black", 12);
		
		boolean same=gun2.equals(gun1);
		System.out.println("LHS=RHS:"+same);


	}

}
