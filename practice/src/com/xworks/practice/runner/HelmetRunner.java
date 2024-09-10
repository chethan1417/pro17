package com.xworks.practice.runner;

import com.xworks.practice.assign.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		
		
        Helmet helmet1=new Helmet("bell", 's', "fiberglass", 1.2, 10, 500);
		
		Helmet helmet2=new Helmet("icon", 'm', "carbonfiber", 1.5, 20, 700);
		
		boolean same=helmet1.equals(helmet2);
		System.out.println(same);

	}

}
