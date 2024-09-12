package com.xworks.practice.assign;

public class Person {

	private String name;
	private String mail;
	private int age;
	private long contact;

	public Person(String name, String mail, int age, long contact) {
		super();
		this.name = name;
		this.mail = mail;
		this.age = age;
		this.contact = contact;
	}

	public void display() {
		System.out.println("Name:" + this.name);
		System.out.println("mail:" + this.mail);
		System.out.println("age:" + this.age);
		System.out.println("contact no:" + this.contact);
		System.out.println();
	}

}
