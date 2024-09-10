package com.xworks.practice.runner;

import com.xworks.practice.assign.Bedsheet;

public class BedsheetRunner {

	public static void main(String[] args) {
		
        Bedsheet bedsheet1=new Bedsheet("cotton", "king", "white", 5, 398, 10);
		
		Bedsheet bedsheet2=new Bedsheet("cotton", "king", "white", 5, 398, 10);
		
		boolean same=bedsheet2 .equals(bedsheet2);
		System.out.println("left hand side =right hand side:"+same);


	}

}
