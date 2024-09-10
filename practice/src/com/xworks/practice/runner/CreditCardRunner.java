package com.xworks.practice.runner;

import com.xworks.practice.assign.CreditCard;

public class CreditCardRunner {

	public static void main(String[] args) {
		
		
		CreditCard creditCard1=new CreditCard("visa", 125346826, "nov 25", 50000, 5000, 1.5);

		CreditCard creditCard2=new CreditCard("mastercard", 987654321, "nov 25", 50000, 5000, 1.5);
		

		boolean same =creditCard1.equals(creditCard2);
		System.out.println(same);

	}

}
