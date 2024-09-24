package com.xworks.works.internal;

public class BankRunner {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.setAccHolder("chethan");
		System.out.println(bank.getAccHolder());
		bank.setBalance(100000);
		System.out.println(bank.getBalance());
	}

}

