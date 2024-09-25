package com.xworks.exception;

public class PersonalDetails {

	String name;

	public void save(String name) throws InvalidName {
		if (name == null || name.equals("")) {
			System.out.println("program will stop execution");
			throw new InvalidName();
		}
		System.out.println("program will continue execution");

	}

}
