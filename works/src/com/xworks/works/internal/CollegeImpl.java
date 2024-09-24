package com.xworks.works.internal;

public class CollegeImpl implements College {

	@Override
	public void firstPuc() {
		System.out.println("firstPuc in CollegeImpl");
	}

	@Override
	public void secondPuc() {
		System.out.println("secondPuc in CollegeImpl");

	}
	
//as interface College has 2 abstract methods so we should we override 	
//all the methods in an interface so interface provides 100% abstraction
}
