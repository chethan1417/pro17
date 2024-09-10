package com.xworks.practice.runner;

import com.xworks.practice.assign.Saree;

public class SareeRunner {
	
	public static void main(String args[])
	{

		Saree saree1= new Saree("silk saree", "satin soft silk", 4.5, 8.2, "white", 753);
		
		Saree saree2= new Saree("cotton saree", "smooth cotton", 4.6, 8.3, "green", 246);
		
		boolean same=saree1.equals(saree2);
		System.out.println("left hand side=right hand side:"+same);

	}

}
