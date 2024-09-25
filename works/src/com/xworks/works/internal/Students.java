package com.xworks.works.internal;

public interface Students {

	void boys(); // abstract method

	default void girls() // default method
	{
		System.out.println("girls from Students");
	}

}