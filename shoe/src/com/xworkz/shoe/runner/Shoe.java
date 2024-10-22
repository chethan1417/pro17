package com.xworkz.shoe.runner;

public class Shoe {

	public static void main(String[] args) {

		try
		{
			Class.forName("com.xworkz.shoe.runner.NikeShoe");
			System.out.println("invoking static block of NikeShoe ");
			
		}
		catch(ClassNotFoundException e1)
		{
			e1.printStackTrace();
		}

	}

}
