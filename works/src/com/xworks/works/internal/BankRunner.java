package com.xworks.works.internal;

import com.xworks.works.runner.HdfcBank;

public class BankRunner {

	public static void main(String[] args) {

		Bank bank = new Bank();
		
		bank.setAccHolder("chethan");
		System.out.println(bank.getAccHolder());
		bank.setBalance(100000);
		System.out.println(bank.getBalance());
		
		HdfcBank hdfc = new HdfcBank();
		hdfc.getter(bank);
	}

}

