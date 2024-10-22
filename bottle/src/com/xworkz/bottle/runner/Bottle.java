package com.xworkz.bottle.runner;

public class Bottle {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.xworkz.bottle.runner.PegionBottle");
			System.out.println("invoking static block of PegionBottle ");
			
		}
		catch(ClassNotFoundException e1)
		{
			e1.printStackTrace();
		}

	}

}
