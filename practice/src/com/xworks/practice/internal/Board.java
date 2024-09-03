package com.xworks.practice.internal;

public class Board {
	
	private String color;
	private double price;
	
	protected Board()
	{
		System.out.println("created no-arg const.. in Board");
	}
	
	public Board(String color,double price)
	{
		this.color=color;
		this.price=price;
		System.out.println("created String and double const.. in Board");

	}
	

}
