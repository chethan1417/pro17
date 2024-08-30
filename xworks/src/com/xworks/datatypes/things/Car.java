package com.xworks.datatypes.things;

public class Car {
	
	private String brand;
	private String color;
    private int seats;
    
    public Car()
    {
    	System.out.println("created Gun");
    }
    
    public Car(String brand,String color,int seats)
    {
    	super();
    	this.brand=brand;
    	this.color=color;
    	this.seats=seats;
    }
    
    public void drive()
    {
    	System.out.println("created drive in Car");
    }
    public void torsu()
    {
    	System.out.println("Brand:"+this.brand);
    	System.out.println("Color:"+this.color);
    	System.out.println("Seats:"+this.seats);
    }

}
