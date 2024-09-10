package com.xworks.practice.runner;

import com.xworks.practice.assign.Country;

public class CountryRunner {

	public static void main(String[] args) {
	
		

		Country country1=new Country("india", "delhi", 28, 1.4, 400, "modi");
		
		Country country2=new Country("india", "delhi", 28, 1.4, 400, "modi");
		
		boolean same=country2.equals(country1);
		System.out.println(same);

	}

}
