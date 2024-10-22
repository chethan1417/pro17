package com.xworkz.fan.runner;

public class Fan {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("invoking Driver");
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		try
		{
			Class.forName("com.xworkz.fan.runner.UshaFan");
			System.out.println("invoking static block of UshaFan ");
			
		}
		catch(ClassNotFoundException e1)
		{
			e1.printStackTrace();
		}

	}

}
